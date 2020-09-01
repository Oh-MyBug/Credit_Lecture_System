package com.ohmybug.dao.impl;

import com.ohmybug.dao.T_ClassDao;
import com.ohmybug.pojo.T_Class;

import java.util.List;

/**
 * ClassName:   T_ClassDaoImpl
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class T_ClassDaoImpl extends BaseDao implements T_ClassDao {
    @Override
    public int addT_Class(T_Class t_class) {
        String sql = "insert into `t_class`(`t_class`) values(?)";
        return update(sql, t_class.getT_class());
    }

    @Override
    public int deleteT_ClassById(Integer id) {
        String sql = "delete from `t_class` where `id` = ?";
        return update(sql, id);
    }

    @Override
    public int updateT_Class(T_Class t_class) {
        String sql = "update `t_class` set `t_class` = ? where `id` = ?";
        return update(sql, t_class.getT_class(), t_class.getId());
    }

    @Override
    public T_Class queryT_ClassById(Integer id) {
        String sql = "select `id`, `t_class` from `t_class` where `id` = ?";
        return queryForOne(T_Class.class, sql, id);
    }

    @Override
    public List<T_Class> queryT_Classes() {
        String sql = "select `id`, `t_class` from `t_class`";
        return queryForList(T_Class.class, sql);
    }
}
