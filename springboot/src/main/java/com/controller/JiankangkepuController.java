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

import com.entity.JiankangkepuEntity;
import com.entity.view.JiankangkepuView;

import com.service.JiankangkepuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 健康科普
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 11:09:10
 */
@RestController
@RequestMapping("/jiankangkepu")
public class JiankangkepuController {
    @Autowired
    private JiankangkepuService jiankangkepuService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangkepuEntity jiankangkepu,
		HttpServletRequest request){
        EntityWrapper<JiankangkepuEntity> ew = new EntityWrapper<JiankangkepuEntity>();

		PageUtils page = jiankangkepuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangkepu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangkepuEntity jiankangkepu, 
		HttpServletRequest request){
        EntityWrapper<JiankangkepuEntity> ew = new EntityWrapper<JiankangkepuEntity>();

		PageUtils page = jiankangkepuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangkepu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangkepuEntity jiankangkepu){
       	EntityWrapper<JiankangkepuEntity> ew = new EntityWrapper<JiankangkepuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangkepu, "jiankangkepu")); 
        return R.ok().put("data", jiankangkepuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangkepuEntity jiankangkepu){
        EntityWrapper< JiankangkepuEntity> ew = new EntityWrapper< JiankangkepuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangkepu, "jiankangkepu")); 
		JiankangkepuView jiankangkepuView =  jiankangkepuService.selectView(ew);
		return R.ok("查询健康科普成功").put("data", jiankangkepuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangkepuEntity jiankangkepu = jiankangkepuService.selectById(id);
        return R.ok().put("data", jiankangkepu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangkepuEntity jiankangkepu = jiankangkepuService.selectById(id);
        return R.ok().put("data", jiankangkepu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangkepuEntity jiankangkepu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangkepu);
        jiankangkepuService.insert(jiankangkepu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangkepuEntity jiankangkepu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangkepu);
        jiankangkepuService.insert(jiankangkepu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangkepuEntity jiankangkepu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangkepu);
        jiankangkepuService.updateById(jiankangkepu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangkepuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
