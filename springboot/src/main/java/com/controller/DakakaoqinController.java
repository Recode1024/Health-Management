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

import com.entity.DakakaoqinEntity;
import com.entity.view.DakakaoqinView;

import com.service.DakakaoqinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 打卡考勤
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@RestController
@RequestMapping("/dakakaoqin")
public class DakakaoqinController {
    @Autowired
    private DakakaoqinService dakakaoqinService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DakakaoqinEntity dakakaoqin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			dakakaoqin.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DakakaoqinEntity> ew = new EntityWrapper<DakakaoqinEntity>();

		PageUtils page = dakakaoqinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dakakaoqin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DakakaoqinEntity dakakaoqin, 
		HttpServletRequest request){
        EntityWrapper<DakakaoqinEntity> ew = new EntityWrapper<DakakaoqinEntity>();

		PageUtils page = dakakaoqinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dakakaoqin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DakakaoqinEntity dakakaoqin){
       	EntityWrapper<DakakaoqinEntity> ew = new EntityWrapper<DakakaoqinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dakakaoqin, "dakakaoqin")); 
        return R.ok().put("data", dakakaoqinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DakakaoqinEntity dakakaoqin){
        EntityWrapper< DakakaoqinEntity> ew = new EntityWrapper< DakakaoqinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dakakaoqin, "dakakaoqin")); 
		DakakaoqinView dakakaoqinView =  dakakaoqinService.selectView(ew);
		return R.ok("查询打卡考勤成功").put("data", dakakaoqinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DakakaoqinEntity dakakaoqin = dakakaoqinService.selectById(id);
        return R.ok().put("data", dakakaoqin);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DakakaoqinEntity dakakaoqin = dakakaoqinService.selectById(id);
        return R.ok().put("data", dakakaoqin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DakakaoqinEntity dakakaoqin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dakakaoqin);
        dakakaoqinService.insert(dakakaoqin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DakakaoqinEntity dakakaoqin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dakakaoqin);
        dakakaoqinService.insert(dakakaoqin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DakakaoqinEntity dakakaoqin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dakakaoqin);
        dakakaoqinService.updateById(dakakaoqin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dakakaoqinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
