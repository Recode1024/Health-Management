package com.dao;

import com.entity.HeshuijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HeshuijiluVO;
import com.entity.view.HeshuijiluView;


/**
 * 喝水记录
 * 
 * @author 
 * @email 
 * @date 2024-04-06 11:09:11
 */
public interface HeshuijiluDao extends BaseMapper<HeshuijiluEntity> {
	
	List<HeshuijiluVO> selectListVO(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);
	
	HeshuijiluVO selectVO(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);
	
	List<HeshuijiluView> selectListView(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);

	List<HeshuijiluView> selectListView(Pagination page,@Param("ew") Wrapper<HeshuijiluEntity> wrapper);

	
	HeshuijiluView selectView(@Param("ew") Wrapper<HeshuijiluEntity> wrapper);
	

}
