package com.entity.vo;

import com.entity.YinshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食信息
 * @author 
 * @email 
 * @date 2024-04-06 11:09:10
 */
public class YinshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饮食名称
	 */
	
	private String yinshimingcheng;
		
	/**
	 * 饮食类型
	 */
	
	private String yinshileixing;
		
	/**
	 * 饮食图片
	 */
	
	private String yinshitupian;
		
	/**
	 * 主要材料
	 */
	
	private String zhuyaocailiao;
		
	/**
	 * 饮食详情
	 */
	
	private String yinshixiangqing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：饮食名称
	 */
	 
	public void setYinshimingcheng(String yinshimingcheng) {
		this.yinshimingcheng = yinshimingcheng;
	}
	
	/**
	 * 获取：饮食名称
	 */
	public String getYinshimingcheng() {
		return yinshimingcheng;
	}
				
	
	/**
	 * 设置：饮食类型
	 */
	 
	public void setYinshileixing(String yinshileixing) {
		this.yinshileixing = yinshileixing;
	}
	
	/**
	 * 获取：饮食类型
	 */
	public String getYinshileixing() {
		return yinshileixing;
	}
				
	
	/**
	 * 设置：饮食图片
	 */
	 
	public void setYinshitupian(String yinshitupian) {
		this.yinshitupian = yinshitupian;
	}
	
	/**
	 * 获取：饮食图片
	 */
	public String getYinshitupian() {
		return yinshitupian;
	}
				
	
	/**
	 * 设置：主要材料
	 */
	 
	public void setZhuyaocailiao(String zhuyaocailiao) {
		this.zhuyaocailiao = zhuyaocailiao;
	}
	
	/**
	 * 获取：主要材料
	 */
	public String getZhuyaocailiao() {
		return zhuyaocailiao;
	}
				
	
	/**
	 * 设置：饮食详情
	 */
	 
	public void setYinshixiangqing(String yinshixiangqing) {
		this.yinshixiangqing = yinshixiangqing;
	}
	
	/**
	 * 获取：饮食详情
	 */
	public String getYinshixiangqing() {
		return yinshixiangqing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
