package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DakakaoqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DakakaoqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DakakaoqinView;


/**
 * 打卡考勤
 *
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface DakakaoqinService extends IService<DakakaoqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DakakaoqinVO> selectListVO(Wrapper<DakakaoqinEntity> wrapper);
   	
   	DakakaoqinVO selectVO(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);
   	
   	List<DakakaoqinView> selectListView(Wrapper<DakakaoqinEntity> wrapper);
   	
   	DakakaoqinView selectView(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DakakaoqinEntity> wrapper);

   	

}

