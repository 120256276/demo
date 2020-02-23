package com.test.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crud.bean.ClentInfo;
import com.test.crud.dao.ClentInfoMapper;

@Service
public class ClientService {
	
	@Autowired
	private ClentInfoMapper clentInfoMapper;
	
	
	public void InsertInfo(ClentInfo clentInfo){
		
		clentInfoMapper.insertSelective(clentInfo);
	}
}
