package com.entity.model;

import com.entity.YundongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 运动记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public class YundongjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 运动图片
	 */
	
	private String yundongtupian;
		
	/**
	 * 运动类型
	 */
	
	private String yundongleixing;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 卡路里/小时
	 */
	
	private Double kaluli;
		
	/**
	 * 运动时长
	 */
	
	private Double yundongshizhang;
		
	/**
	 * 总消耗
	 */
	
	private String zongxiaohao;
		
	/**
	 * 运动时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yundongshijian;
		
	/**
	 * 运动情况
	 */
	
	private String yundongqingkuang;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：运动图片
	 */
	 
	public void setYundongtupian(String yundongtupian) {
		this.yundongtupian = yundongtupian;
	}
	
	/**
	 * 获取：运动图片
	 */
	public String getYundongtupian() {
		return yundongtupian;
	}
				
	
	/**
	 * 设置：运动类型
	 */
	 
	public void setYundongleixing(String yundongleixing) {
		this.yundongleixing = yundongleixing;
	}
	
	/**
	 * 获取：运动类型
	 */
	public String getYundongleixing() {
		return yundongleixing;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：卡路里/小时
	 */
	 
	public void setKaluli(Double kaluli) {
		this.kaluli = kaluli;
	}
	
	/**
	 * 获取：卡路里/小时
	 */
	public Double getKaluli() {
		return kaluli;
	}
				
	
	/**
	 * 设置：运动时长
	 */
	 
	public void setYundongshizhang(Double yundongshizhang) {
		this.yundongshizhang = yundongshizhang;
	}
	
	/**
	 * 获取：运动时长
	 */
	public Double getYundongshizhang() {
		return yundongshizhang;
	}
				
	
	/**
	 * 设置：总消耗
	 */
	 
	public void setZongxiaohao(String zongxiaohao) {
		this.zongxiaohao = zongxiaohao;
	}
	
	/**
	 * 获取：总消耗
	 */
	public String getZongxiaohao() {
		return zongxiaohao;
	}
				
	
	/**
	 * 设置：运动时间
	 */
	 
	public void setYundongshijian(Date yundongshijian) {
		this.yundongshijian = yundongshijian;
	}
	
	/**
	 * 获取：运动时间
	 */
	public Date getYundongshijian() {
		return yundongshijian;
	}
				
	
	/**
	 * 设置：运动情况
	 */
	 
	public void setYundongqingkuang(String yundongqingkuang) {
		this.yundongqingkuang = yundongqingkuang;
	}
	
	/**
	 * 获取：运动情况
	 */
	public String getYundongqingkuang() {
		return yundongqingkuang;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
