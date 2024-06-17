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


import com.dao.DakakaoqinDao;
import com.entity.DakakaoqinEntity;
import com.service.DakakaoqinService;
import com.entity.vo.DakakaoqinVO;
import com.entity.view.DakakaoqinView;

@Service("dakakaoqinService")
public class DakakaoqinServiceImpl extends ServiceImpl<DakakaoqinDao, DakakaoqinEntity> implements DakakaoqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DakakaoqinEntity> page = this.selectPage(
                new Query<DakakaoqinEntity>(params).getPage(),
                new EntityWrapper<DakakaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DakakaoqinEntity> wrapper) {
		  Page<DakakaoqinView> page =new Query<DakakaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DakakaoqinVO> selectListVO(Wrapper<DakakaoqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DakakaoqinVO selectVO(Wrapper<DakakaoqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DakakaoqinView> selectListView(Wrapper<DakakaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DakakaoqinView selectView(Wrapper<DakakaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
