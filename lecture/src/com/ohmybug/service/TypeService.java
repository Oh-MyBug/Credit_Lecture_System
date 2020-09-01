package com.ohmybug.service;

import com.ohmybug.pojo.Type;

import java.util.List;

public interface TypeService {
    int addType(Type type);

    int deleteTypeById(Integer id);

    int updateType(Type type);

    Type queryTypeById(Integer id);

    List<Type> queryTypes();

    Integer queryIdByType(String type);
}
