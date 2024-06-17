package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuimianjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuimianjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuimianjiluView;


/**
 * 睡眠记录
 *
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface ShuimianjiluService extends IService<ShuimianjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuimianjiluVO> selectListVO(Wrapper<ShuimianjiluEntity> wrapper);
   	
   	ShuimianjiluVO selectVO(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);
   	
   	List<ShuimianjiluView> selectListView(Wrapper<ShuimianjiluEntity> wrapper);
   	
   	ShuimianjiluView selectView(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuimianjiluEntity> wrapper);

   	

}

