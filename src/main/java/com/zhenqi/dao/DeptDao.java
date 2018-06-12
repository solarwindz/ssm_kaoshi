package com.zhenqi.dao;

import com.zhenqi.entity.Dept;

import java.util.List;

/**
 * Created by wuming on 2017/9/8.
 */
public interface DeptDao {

    public List<Dept> findAll();
}
