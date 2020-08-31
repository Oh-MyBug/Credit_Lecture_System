package com.ohmybug.dao.impl;

import com.ohmybug.dao.TypeDao;
import com.ohmybug.pojo.Type;

import java.util.List;

/**
 * ClassName:   TypeDaoImpl
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class TypeDaoImpl extends BaseDao implements TypeDao {
    @Override
    public int addType(Type type) {
        String sql = "insert into `lecture_type`(`type`) values(?)";
        return update(sql, type.getType());
    }

    @Override
    public int deleteTypeById(Integer id) {
        String sql = "delete from `lecture_type` where id = ?";
        return update(sql, id);
    }

    @Override
    public int updateType(Type type) {
        String sql = "update `lecture_type` set `type` = ? where id = ?";
        return update(sql, type.getType(), type.getId());
    }

    @Override
    public Type queryTypeById(Integer id) {
        String sql = "select `id`, 'type' from `lecture_type` where id = ?";
        return queryForOne(Type.class, sql, id);
    }

    @Override
    public List<Type> queryTypes() {
        String sql = "select `id`, `type` from `lecture_type`";
        return queryForList(Type.class, sql);
    }
}
