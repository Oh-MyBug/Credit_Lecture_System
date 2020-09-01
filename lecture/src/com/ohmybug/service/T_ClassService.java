package com.ohmybug.service;

import com.ohmybug.pojo.T_Class;

import java.util.List;

public interface T_ClassService {
    int addT_Class(T_Class t_class);

    int deleteT_ClassById(Integer id);

    int updateT_Class(T_Class t_class);

    T_Class queryT_ClassById(Integer id);

    List<T_Class> queryT_Classs();
}
