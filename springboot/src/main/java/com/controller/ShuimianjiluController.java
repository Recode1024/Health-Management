package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShuimianjiluEntity;
import com.entity.view.ShuimianjiluView;

import com.service.ShuimianjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 睡眠记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@RestController
@RequestMapping("/shuimianjilu")
public class ShuimianjiluController {
    @Autowired
    private ShuimianjiluService shuimianjiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShuimianjiluEntity shuimianjilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shuimianjilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShuimianjiluEntity> ew = new EntityWrapper<ShuimianjiluEntity>();
                if(jilushijianstart!=null) ew.ge("jilushijian", jilushijianstart);
                if(jilushijianend!=null) ew.le("jilushijian", jilushijianend);

		PageUtils page = shuimianjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuimianjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShuimianjiluEntity shuimianjilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianend,
		HttpServletRequest request){
        EntityWrapper<ShuimianjiluEntity> ew = new EntityWrapper<ShuimianjiluEntity>();
                if(jilushijianstart!=null) ew.ge("jilushijian", jilushijianstart);
                if(jilushijianend!=null) ew.le("jilushijian", jilushijianend);

		PageUtils page = shuimianjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shuimianjilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShuimianjiluEntity shuimianjilu){
       	EntityWrapper<ShuimianjiluEntity> ew = new EntityWrapper<ShuimianjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shuimianjilu, "shuimianjilu")); 
        return R.ok().put("data", shuimianjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShuimianjiluEntity shuimianjilu){
        EntityWrapper< ShuimianjiluEntity> ew = new EntityWrapper< ShuimianjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shuimianjilu, "shuimianjilu")); 
		ShuimianjiluView shuimianjiluView =  shuimianjiluService.selectView(ew);
		return R.ok("查询睡眠记录成功").put("data", shuimianjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShuimianjiluEntity shuimianjilu = shuimianjiluService.selectById(id);
        return R.ok().put("data", shuimianjilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShuimianjiluEntity shuimianjilu = shuimianjiluService.selectById(id);
        return R.ok().put("data", shuimianjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShuimianjiluEntity shuimianjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shuimianjilu);
        shuimianjiluService.insert(shuimianjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShuimianjiluEntity shuimianjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shuimianjilu);
        shuimianjiluService.insert(shuimianjilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShuimianjiluEntity shuimianjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shuimianjilu);
        shuimianjiluService.updateById(shuimianjilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shuimianjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
