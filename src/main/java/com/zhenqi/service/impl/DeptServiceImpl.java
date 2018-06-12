package com.zhenqi.service.impl;

import com.zhenqi.dao.DeptDao;
import com.zhenqi.entity.Dept;
import com.zhenqi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuming on 2017/9/8.
 */

@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> findall() {
        return deptDao.findAll();
    }
}
