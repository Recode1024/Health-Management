package com.dao;

import com.entity.YundongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongjiluVO;
import com.entity.view.YundongjiluView;


/**
 * 运动记录
 * 
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface YundongjiluDao extends BaseMapper<YundongjiluEntity> {
	
	List<YundongjiluVO> selectListVO(@Param("ew") Wrapper<YundongjiluEntity> wrapper);
	
	YundongjiluVO selectVO(@Param("ew") Wrapper<YundongjiluEntity> wrapper);
	
	List<YundongjiluView> selectListView(@Param("ew") Wrapper<YundongjiluEntity> wrapper);

	List<YundongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<YundongjiluEntity> wrapper);

	
	YundongjiluView selectView(@Param("ew") Wrapper<YundongjiluEntity> wrapper);
	

}
