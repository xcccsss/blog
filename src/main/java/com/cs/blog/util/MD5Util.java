package com.cs.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public static String code(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] byteDigest = messageDigest.digest();
            int i;
            StringBuffer buffer = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buffer.append("0");
                }
                buffer.append(Integer.toHexString(i));
            }
            //32位加密
            return buffer.toString();

            //16位加密
            //return buffer.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
