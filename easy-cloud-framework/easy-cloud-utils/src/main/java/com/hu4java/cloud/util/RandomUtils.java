package com.hu4java.cloud.util;

import java.security.SecureRandom;
import java.util.Random;

/**
 * 随机工具类
 * @author hu4java
 */
public class RandomUtils {

    private static final String RANDOM_STRING = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String RANDOM_NUMBER = "0123456789";
    private static final Random RANDOM = new SecureRandom();

    /**
     * 生成随机字符串
     * @param length    长度
     * @return          随机字符串
     */
    public static String generateString(int length) {
        return generateString(length, RANDOM_STRING);
    }

    /**
     * 生成随机数字符串
     * @param length    长度
     * @return          随机数字符串
     */
    public static String generateNumber(int length) {
        return generateString(length, RANDOM_NUMBER);
    }

    /**
     * 生成随机字符串
     * @param length    长度
     * @param source    随机字符串源
     * @return          随机字符串
     */
    private static String generateString(int length, String source) {
        char[] chars = new char[length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = source.charAt(RANDOM.nextInt(source.length()));
        }
        return new String(chars);
    }
}
