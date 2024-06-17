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

import com.entity.BushujiluEntity;
import com.entity.view.BushujiluView;

import com.service.BushujiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 步数记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@RestController
@RequestMapping("/bushujilu")
public class BushujiluController {
    @Autowired
    private BushujiluService bushujiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BushujiluEntity bushujilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			bushujilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BushujiluEntity> ew = new EntityWrapper<BushujiluEntity>();
                if(jilushijianstart!=null) ew.ge("jilushijian", jilushijianstart);
                if(jilushijianend!=null) ew.le("jilushijian", jilushijianend);

		PageUtils page = bushujiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bushujilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BushujiluEntity bushujilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jilushijianend,
		HttpServletRequest request){
        EntityWrapper<BushujiluEntity> ew = new EntityWrapper<BushujiluEntity>();
                if(jilushijianstart!=null) ew.ge("jilushijian", jilushijianstart);
                if(jilushijianend!=null) ew.le("jilushijian", jilushijianend);

		PageUtils page = bushujiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bushujilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BushujiluEntity bushujilu){
       	EntityWrapper<BushujiluEntity> ew = new EntityWrapper<BushujiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bushujilu, "bushujilu")); 
        return R.ok().put("data", bushujiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BushujiluEntity bushujilu){
        EntityWrapper< BushujiluEntity> ew = new EntityWrapper< BushujiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bushujilu, "bushujilu")); 
		BushujiluView bushujiluView =  bushujiluService.selectView(ew);
		return R.ok("查询步数记录成功").put("data", bushujiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BushujiluEntity bushujilu = bushujiluService.selectById(id);
        return R.ok().put("data", bushujilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BushujiluEntity bushujilu = bushujiluService.selectById(id);
        return R.ok().put("data", bushujilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BushujiluEntity bushujilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bushujilu);
        bushujiluService.insert(bushujilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BushujiluEntity bushujilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bushujilu);
        bushujiluService.insert(bushujilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BushujiluEntity bushujilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bushujilu);
        bushujiluService.updateById(bushujilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bushujiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
