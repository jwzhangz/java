package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Think on 2017/7/8.
 */
public final class ArrayUtil {
    public static boolean isEmpty(Object[] objects) {
        return ArrayUtils.isEmpty(objects);
    }

    public static boolean isNotEmpty(Object[] objects) {
        return !ArrayUtils.isEmpty(objects);
    }
}
