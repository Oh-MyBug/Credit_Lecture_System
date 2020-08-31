package com.ohmybug.service.impl;

import com.ohmybug.dao.TypeDao;
import com.ohmybug.dao.impl.TypeDaoImpl;
import com.ohmybug.pojo.Type;
import com.ohmybug.service.TypeService;

import java.util.List;

/**
 * ClassName:   TypeServiceImpl
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class TypeServiceImpl implements TypeService {
    private TypeDao typeDao = new TypeDaoImpl();

    @Override
    public int addType(Type type) {
        return typeDao.addType(type);
    }

    @Override
    public int deleteTypeById(Integer id) {
        return typeDao.deleteTypeById(id);
    }

    @Override
    public int updateType(Type type) {
        return typeDao.updateType(type);
    }

    @Override
    public Type queryTypeById(Integer id) {
        return typeDao.queryTypeById(id);
    }

    @Override
    public List<Type> queryTypes() {
        return typeDao.queryTypes();
    }
}
