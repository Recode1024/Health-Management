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


import com.dao.HeshuijiluDao;
import com.entity.HeshuijiluEntity;
import com.service.HeshuijiluService;
import com.entity.vo.HeshuijiluVO;
import com.entity.view.HeshuijiluView;

@Service("heshuijiluService")
public class HeshuijiluServiceImpl extends ServiceImpl<HeshuijiluDao, HeshuijiluEntity> implements HeshuijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HeshuijiluEntity> page = this.selectPage(
                new Query<HeshuijiluEntity>(params).getPage(),
                new EntityWrapper<HeshuijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HeshuijiluEntity> wrapper) {
		  Page<HeshuijiluView> page =new Query<HeshuijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HeshuijiluVO> selectListVO(Wrapper<HeshuijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HeshuijiluVO selectVO(Wrapper<HeshuijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HeshuijiluView> selectListView(Wrapper<HeshuijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HeshuijiluView selectView(Wrapper<HeshuijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
