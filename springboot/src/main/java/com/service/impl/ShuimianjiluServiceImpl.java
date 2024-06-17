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


import com.dao.ShuimianjiluDao;
import com.entity.ShuimianjiluEntity;
import com.service.ShuimianjiluService;
import com.entity.vo.ShuimianjiluVO;
import com.entity.view.ShuimianjiluView;

@Service("shuimianjiluService")
public class ShuimianjiluServiceImpl extends ServiceImpl<ShuimianjiluDao, ShuimianjiluEntity> implements ShuimianjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuimianjiluEntity> page = this.selectPage(
                new Query<ShuimianjiluEntity>(params).getPage(),
                new EntityWrapper<ShuimianjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuimianjiluEntity> wrapper) {
		  Page<ShuimianjiluView> page =new Query<ShuimianjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShuimianjiluVO> selectListVO(Wrapper<ShuimianjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuimianjiluVO selectVO(Wrapper<ShuimianjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuimianjiluView> selectListView(Wrapper<ShuimianjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuimianjiluView selectView(Wrapper<ShuimianjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
