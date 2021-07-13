package com.silva.chetax.schedule.center.test.service.impl;

import com.silva.chetax.schedule.center.test.entity.TstTest1;
import com.silva.chetax.schedule.center.test.mapper.TstTest1Mapper;
import com.silva.chetax.schedule.center.test.service.ITstTest1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author litinglong
 * @since 2021-07-12
 */
@Service
public class TstTest1ServiceImpl extends ServiceImpl<TstTest1Mapper, TstTest1> implements ITstTest1Service {
	
	public int updateSomething() {
		return this.baseMapper.updateSomething();
	}
}
