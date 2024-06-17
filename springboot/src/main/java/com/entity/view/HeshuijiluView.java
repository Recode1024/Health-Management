package com.entity.view;

import com.entity.HeshuijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 喝水记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@TableName("heshuijilu")
public class HeshuijiluView  extends HeshuijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HeshuijiluView(){
	}
 
 	public HeshuijiluView(HeshuijiluEntity heshuijiluEntity){
 	try {
			BeanUtils.copyProperties(this, heshuijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
