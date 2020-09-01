package com.ohmybug.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * ClassName:   WebUtils
 * Data:        2020/8/6
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class WebUtils {
    public static <T> T copyParamToBean(Map value, T bean) {
        try {
            ConvertUtils.register((aClass, o) -> {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
                Date date = null;
                try {
                    date = format.parse(o.toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return date;
            }, Date.class);
            BeanUtils.populate(bean, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String strInt, int defaultValue) {
        try {
            if (strInt != null)
                return Integer.parseInt(strInt);
        } catch (NumberFormatException e) {
            System.out.println("Catch -> java.lang.NumberFormatException: null");
        }
        return defaultValue;
    }
}
