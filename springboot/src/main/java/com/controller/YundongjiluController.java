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

import com.entity.YundongjiluEntity;
import com.entity.view.YundongjiluView;

import com.service.YundongjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运动记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@RestController
@RequestMapping("/yundongjilu")
public class YundongjiluController {
    @Autowired
    private YundongjiluService yundongjiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundongjiluEntity yundongjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongjilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongjiluEntity> ew = new EntityWrapper<YundongjiluEntity>();

		PageUtils page = yundongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundongjiluEntity yundongjilu, 
		HttpServletRequest request){
        EntityWrapper<YundongjiluEntity> ew = new EntityWrapper<YundongjiluEntity>();

		PageUtils page = yundongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundongjiluEntity yundongjilu){
       	EntityWrapper<YundongjiluEntity> ew = new EntityWrapper<YundongjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundongjilu, "yundongjilu")); 
        return R.ok().put("data", yundongjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundongjiluEntity yundongjilu){
        EntityWrapper< YundongjiluEntity> ew = new EntityWrapper< YundongjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundongjilu, "yundongjilu")); 
		YundongjiluView yundongjiluView =  yundongjiluService.selectView(ew);
		return R.ok("查询运动记录成功").put("data", yundongjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundongjiluEntity yundongjilu = yundongjiluService.selectById(id);
        return R.ok().put("data", yundongjilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundongjiluEntity yundongjilu = yundongjiluService.selectById(id);
        return R.ok().put("data", yundongjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundongjiluEntity yundongjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjilu);
        yundongjiluService.insert(yundongjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundongjiluEntity yundongjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjilu);
        yundongjiluService.insert(yundongjilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YundongjiluEntity yundongjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundongjilu);
        yundongjiluService.updateById(yundongjilu);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<YundongjiluEntity> list = new ArrayList<YundongjiluEntity>();
        for(Long id : ids) {
            YundongjiluEntity yundongjilu = yundongjiluService.selectById(id);
            yundongjilu.setSfsh(sfsh);
            yundongjilu.setShhf(shhf);
            list.add(yundongjilu);
        }
        yundongjiluService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundongjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
