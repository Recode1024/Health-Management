package com.entity.view;

import com.entity.ShuimianjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 睡眠记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@TableName("shuimianjilu")
public class ShuimianjiluView  extends ShuimianjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuimianjiluView(){
	}
 
 	public ShuimianjiluView(ShuimianjiluEntity shuimianjiluEntity){
 	try {
			BeanUtils.copyProperties(this, shuimianjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
