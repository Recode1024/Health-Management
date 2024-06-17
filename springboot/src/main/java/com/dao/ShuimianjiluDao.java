package com.dao;

import com.entity.ShuimianjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuimianjiluVO;
import com.entity.view.ShuimianjiluView;


/**
 * 睡眠记录
 * 
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface ShuimianjiluDao extends BaseMapper<ShuimianjiluEntity> {
	
	List<ShuimianjiluVO> selectListVO(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);
	
	ShuimianjiluVO selectVO(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);
	
	List<ShuimianjiluView> selectListView(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);

	List<ShuimianjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);

	
	ShuimianjiluView selectView(@Param("ew") Wrapper<ShuimianjiluEntity> wrapper);
	

}
