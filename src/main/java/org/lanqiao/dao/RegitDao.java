package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.Regit;

public interface RegitDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Regit record);

    int insertSelective(Regit record);

    Regit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Regit record);

    int updateByPrimaryKey(Regit record);
     
    int regit(Regit regit);
    List<Regit>check();
    
    Regit getRegByName(String name);
    int delete(int id);
}