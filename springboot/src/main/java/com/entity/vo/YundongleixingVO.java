package com.entity.vo;

import com.entity.YundongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 运动类型
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public class YundongleixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 卡路里/小时
	 */
	
	private Double kaluli;
				
	
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
			
}
