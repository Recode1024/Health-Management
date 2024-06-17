package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BushujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BushujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BushujiluView;


/**
 * 步数记录
 *
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface BushujiluService extends IService<BushujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BushujiluVO> selectListVO(Wrapper<BushujiluEntity> wrapper);
   	
   	BushujiluVO selectVO(@Param("ew") Wrapper<BushujiluEntity> wrapper);
   	
   	List<BushujiluView> selectListView(Wrapper<BushujiluEntity> wrapper);
   	
   	BushujiluView selectView(@Param("ew") Wrapper<BushujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BushujiluEntity> wrapper);

   	

}

