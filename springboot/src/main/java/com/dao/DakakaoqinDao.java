package com.dao;

import com.entity.DakakaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DakakaoqinVO;
import com.entity.view.DakakaoqinView;


/**
 * 打卡考勤
 * 
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface DakakaoqinDao extends BaseMapper<DakakaoqinEntity> {
	
	List<DakakaoqinVO> selectListVO(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);
	
	DakakaoqinVO selectVO(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);
	
	List<DakakaoqinView> selectListView(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);

	List<DakakaoqinView> selectListView(Pagination page,@Param("ew") Wrapper<DakakaoqinEntity> wrapper);

	
	DakakaoqinView selectView(@Param("ew") Wrapper<DakakaoqinEntity> wrapper);
	

}
