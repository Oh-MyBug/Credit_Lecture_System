package com.ohmybug.service.impl;

import com.ohmybug.dao.T_ClassDao;
import com.ohmybug.dao.impl.T_ClassDaoImpl;
import com.ohmybug.pojo.T_Class;
import com.ohmybug.service.T_ClassService;

import java.util.List;

/**
 * ClassName:   T_ClassServiceImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class T_ClassServiceImpl implements T_ClassService {
    private T_ClassDao t_classDao = new T_ClassDaoImpl();

    @Override
    public int addT_Class(T_Class t_class) {
        return t_classDao.addT_Class(t_class);
    }

    @Override
    public int deleteT_ClassById(Integer id) {
        return t_classDao.deleteT_ClassById(id);
    }

    @Override
    public int updateT_Class(T_Class t_class) {
        return t_classDao.updateT_Class(t_class);
    }

    @Override
    public T_Class queryT_ClassById(Integer id) {
        return t_classDao.queryT_ClassById(id);
    }

    @Override
    public List<T_Class> queryT_Classs() {
        return t_classDao.queryT_Classes();
    }
}
