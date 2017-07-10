package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;
/**
 * Created by Think on 2017/7/2.
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String string, String rex) {
        return StringUtils.split(string, rex);
    }
}
