package com.dao;

import com.entity.BushujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BushujiluVO;
import com.entity.view.BushujiluView;


/**
 * 步数记录
 * 
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface BushujiluDao extends BaseMapper<BushujiluEntity> {
	
	List<BushujiluVO> selectListVO(@Param("ew") Wrapper<BushujiluEntity> wrapper);
	
	BushujiluVO selectVO(@Param("ew") Wrapper<BushujiluEntity> wrapper);
	
	List<BushujiluView> selectListView(@Param("ew") Wrapper<BushujiluEntity> wrapper);

	List<BushujiluView> selectListView(Pagination page,@Param("ew") Wrapper<BushujiluEntity> wrapper);

	
	BushujiluView selectView(@Param("ew") Wrapper<BushujiluEntity> wrapper);
	

}
