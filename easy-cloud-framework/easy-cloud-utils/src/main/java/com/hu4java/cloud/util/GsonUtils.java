package com.hu4java.cloud.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gson 工具类
 * @author hu4java
 */
public class GsonUtils {

    private static final Gson GSON;
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    static {
        GSON = new GsonBuilder().enableComplexMapKeySerialization()
                .setDateFormat(DATE_FORMAT)
                .disableHtmlEscaping()
                .create();
    }

    public static Gson getGson() {
        return GSON;
    }

    /**
     * json字符串
     * @param data  数据
     * @return      json字符串
     */
    public static String toJson(Object data) {
        return GSON.toJson(data);
    }

    /**
     * 转成对象
     * @param json      json字符串
     * @param classOfT  对象类型
     * @param <T>       类型
     * @return          对象
     */
    public static <T> T toBean(String json, Class<T> classOfT) {
        return GSON.fromJson(json, classOfT);
    }

    /**
     * 转成list
     * @param json      json字符串
     * @param <T>       类型
     * @return          List
     */
    public static <T> List<T> toList(String json, Class<T> classOfT) {
        return GSON.fromJson(json, TypeToken.getParameterized(List.class, classOfT).getType());
    }

    /**
     * 转成Map
     * @param json      json字符串
     * @param classOfT  对象类型
     * @param <T>       类型
     * @return          Map
     */
    public static <T> Map<String, T> toMap(String json, Class<T> classOfT) {
        return GSON.fromJson(json, TypeToken.getParameterized(Map.class, String.class, classOfT).getType());
    }

    /**
     * 转成Map
     * @param json      json字符串
     * @param classOfK  Key类型
     * @param classOfV  Value类型
     * @param <K>       Key类型
     * @param <V>       Value类型
     * @return          Map<K, V>
     */
    public static <K, V> Map<K, V> toMap(String json, Class<K> classOfK, Class<V> classOfV) {
        return GSON.fromJson(json, TypeToken.getParameterized(Map.class, classOfK, classOfV).getType());
    }

    public static <T extends Map<K, V>, K, V> T toMap(String json, Class<T> classOfT, Class<K> classOfK, Class<V> classOfV) {
        return GSON.fromJson(json, TypeToken.getParameterized(classOfT, classOfK, classOfV).getType());
    }

    public static <T> HashMap<String, T> toHashMap(String json, Class<T> classOfT) {
        return toMap(json, HashMap.class, String.class, classOfT);
    }

}
