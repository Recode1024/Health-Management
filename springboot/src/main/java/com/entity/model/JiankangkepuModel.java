package com.entity.model;

import com.entity.JiankangkepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康科普
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-06 11:09:10
 */
public class JiankangkepuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 知识分类
	 */
	
	private String zhishifenlei;
		
	/**
	 * 知识封面
	 */
	
	private String zhishifengmian;
		
	/**
	 * 知识简介
	 */
	
	private String zhishijianjie;
		
	/**
	 * 知识内容
	 */
	
	private String zhishineirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：知识分类
	 */
	 
	public void setZhishifenlei(String zhishifenlei) {
		this.zhishifenlei = zhishifenlei;
	}
	
	/**
	 * 获取：知识分类
	 */
	public String getZhishifenlei() {
		return zhishifenlei;
	}
				
	
	/**
	 * 设置：知识封面
	 */
	 
	public void setZhishifengmian(String zhishifengmian) {
		this.zhishifengmian = zhishifengmian;
	}
	
	/**
	 * 获取：知识封面
	 */
	public String getZhishifengmian() {
		return zhishifengmian;
	}
				
	
	/**
	 * 设置：知识简介
	 */
	 
	public void setZhishijianjie(String zhishijianjie) {
		this.zhishijianjie = zhishijianjie;
	}
	
	/**
	 * 获取：知识简介
	 */
	public String getZhishijianjie() {
		return zhishijianjie;
	}
				
	
	/**
	 * 设置：知识内容
	 */
	 
	public void setZhishineirong(String zhishineirong) {
		this.zhishineirong = zhishineirong;
	}
	
	/**
	 * 获取：知识内容
	 */
	public String getZhishineirong() {
		return zhishineirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
