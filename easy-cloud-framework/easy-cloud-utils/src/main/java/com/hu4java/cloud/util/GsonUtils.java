package com.hu4java.cloud.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson 工具类
 * @author hu4java
 */
public class GsonUtils {

    public static String toJson(Object data) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(data);
    }
}
