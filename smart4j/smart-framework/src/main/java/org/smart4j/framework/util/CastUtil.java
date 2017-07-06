package org.smart4j.framework.util;

/**
 * Created by Think on 2017/7/2.
 */
public class CastUtil {
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        if (obj == null) {
            return defaultValue;
        }
        return String.valueOf(obj);
    }

    public static double castDouble(Object obj){
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue){
        double doubleVal = defaultValue;
        if (obj == null) {
            return doubleVal;
        }

        String strVal = CastUtil.castString(obj);
        if (StringUtil.isEmpty(strVal)) {
            return doubleVal;
        }

        try {
            doubleVal = Double.parseDouble(strVal);
        } catch (NumberFormatException e){
            doubleVal = defaultValue;
        }

        return doubleVal;
    }

    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0);
    }

    public static long castLong(Object obj, long defaultValue) {
        long longVal = defaultValue;

        if (obj == null) {
            return longVal;
        }

        String strValue = CastUtil.castString(obj);

        if (StringUtil.isEmpty(strValue)) {
            return longVal;
        }

        try {
            longVal = Long.parseLong(strValue);
        } catch (NumberFormatException e) {
            longVal = defaultValue;
        }
        return longVal;
    }

    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    public static int castInt(Object obj, int defaultValue) {
        int intVal = defaultValue;
        if (obj == null) {
            return intVal;
        }

        String strValue = CastUtil.castString(obj);
        if (StringUtil.isNotEmpty(strValue)) {
            try {
                intVal = Integer.parseInt(strValue);
            } catch (NumberFormatException e) {
                intVal = defaultValue;
            }
        }

        return intVal;
    }

    public static boolean castBoolean(Object object) {
        return castBoolean(object, false);
    }

    public static boolean castBoolean(Object object, boolean defaultValue) {
        boolean bValue = defaultValue;
        if (object == null) {
            return bValue;
        }

        String strValue = CastUtil.castString(object);
        if (StringUtil.isNotEmpty(strValue)) {
            try {
                bValue = Boolean.parseBoolean(strValue);
            } catch (NumberFormatException e) {
                bValue = defaultValue;
            }
        }

        return bValue;
    }
}
