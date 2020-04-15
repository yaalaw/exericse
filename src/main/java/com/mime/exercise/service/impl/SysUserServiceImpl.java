package com.mime.exercise.service.impl;

import com.mime.exercise.mapper.SysUserMapper;
import com.mime.exercise.service.SysUserService;

public class SysUserServiceImpl implements SysUserService{

	private SysUserMapper sysUserMapper;
	public SysUserServiceImpl(SysUserMapper sysUserMapper) {
		this.sysUserMapper= sysUserMapper;
	}
	
	@Override
	public void selectUser() {
		sysUserMapper.selectUser();
	}

}
