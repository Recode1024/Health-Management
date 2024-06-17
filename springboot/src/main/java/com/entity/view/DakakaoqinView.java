package com.entity.view;

import com.entity.DakakaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 打卡考勤
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
@TableName("dakakaoqin")
public class DakakaoqinView  extends DakakaoqinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DakakaoqinView(){
	}
 
 	public DakakaoqinView(DakakaoqinEntity dakakaoqinEntity){
 	try {
			BeanUtils.copyProperties(this, dakakaoqinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
