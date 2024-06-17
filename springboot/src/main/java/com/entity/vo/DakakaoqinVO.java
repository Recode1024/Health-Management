package com.entity.vo;

import com.entity.DakakaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 打卡考勤
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public class DakakaoqinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 签到时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandaoshijian;
		
	/**
	 * 签到地点
	 */
	
	private String qiandaodidian;
		
	/**
	 * 签到备注
	 */
	
	private String qiandaobeizhu;
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：签到时间
	 */
	 
	public void setQiandaoshijian(Date qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	
	/**
	 * 获取：签到时间
	 */
	public Date getQiandaoshijian() {
		return qiandaoshijian;
	}
				
	
	/**
	 * 设置：签到地点
	 */
	 
	public void setQiandaodidian(String qiandaodidian) {
		this.qiandaodidian = qiandaodidian;
	}
	
	/**
	 * 获取：签到地点
	 */
	public String getQiandaodidian() {
		return qiandaodidian;
	}
				
	
	/**
	 * 设置：签到备注
	 */
	 
	public void setQiandaobeizhu(String qiandaobeizhu) {
		this.qiandaobeizhu = qiandaobeizhu;
	}
	
	/**
	 * 获取：签到备注
	 */
	public String getQiandaobeizhu() {
		return qiandaobeizhu;
	}
			
}
