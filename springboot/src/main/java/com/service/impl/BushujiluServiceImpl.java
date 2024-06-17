package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BushujiluDao;
import com.entity.BushujiluEntity;
import com.service.BushujiluService;
import com.entity.vo.BushujiluVO;
import com.entity.view.BushujiluView;

@Service("bushujiluService")
public class BushujiluServiceImpl extends ServiceImpl<BushujiluDao, BushujiluEntity> implements BushujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BushujiluEntity> page = this.selectPage(
                new Query<BushujiluEntity>(params).getPage(),
                new EntityWrapper<BushujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BushujiluEntity> wrapper) {
		  Page<BushujiluView> page =new Query<BushujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BushujiluVO> selectListVO(Wrapper<BushujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BushujiluVO selectVO(Wrapper<BushujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BushujiluView> selectListView(Wrapper<BushujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BushujiluView selectView(Wrapper<BushujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
