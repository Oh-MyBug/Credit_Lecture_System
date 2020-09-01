package com.ohmybug.dao;

import com.ohmybug.pojo.T_Class;

import java.util.List;

public interface T_ClassDao {
    int addT_Class(T_Class t_class);

    int deleteT_ClassById(Integer id);

    int updateT_Class(T_Class t_class);

    T_Class queryT_ClassById(Integer id);

    List<T_Class> queryT_Classes();
}
