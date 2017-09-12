package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Regit;

public interface RegitSevice {
	public int regit(Regit regit);
    public List<Regit>check(); 
    public Regit getRegByName(String name);

}
