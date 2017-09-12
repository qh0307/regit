package org.lanqiao.service;

import java.util.List;

import javax.xml.bind.annotation.XmlRegistry;

import org.lanqiao.dao.RegitDao;
import org.lanqiao.entity.Regit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegitServiceImp implements RegitSevice {
   @Autowired
   RegitDao dao;
	@Override
	public int regit(Regit regit) {
		return dao.regit(regit);
	}
	@Override
	public List<Regit> check() {
		// TODO Auto-generated method stub
		return dao.check();
	}
	@Override
	public Regit getRegByName(String name) {
		// TODO Auto-generated method stub
		return dao.getRegByName(name);
	}

}
