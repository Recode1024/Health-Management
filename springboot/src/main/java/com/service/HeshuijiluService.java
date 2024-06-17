package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HeshuijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HeshuijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HeshuijiluView;


/**
 * 喝水记录
 *
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface HeshuijiluService extends IService<HeshuijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HeshuijiluVO> selectListVO(Wrapper<HeshuijiluEntity> wrapper);
   	
   	HeshuijiluVO selectVO(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);
   	
   	List<HeshuijiluView> selectListView(Wrapper<HeshuijiluEntity> wrapper);
   	
   	HeshuijiluView selectView(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HeshuijiluEntity> wrapper);

   	

}

