package com.ohmybug.test;

import com.ohmybug.utils.WebUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class WebUtilsTest {

    @Test
    public void copyParamToBean() {
        Map<String, String[]> map = new HashMap<>();
        map.put("name", new String[]{"123"});
        map.put("age", new String[]{"123"});
        A a = new A();
        try {
            BeanUtils.populate(a, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }

    @Test
    public void parseInt() {
    }

    public static class A {
        private String name;
        private Integer age;

        public A() {
        }

        public A(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}