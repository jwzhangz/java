package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * Created by Think on 2017/7/9.
 */
public final class HelperLoader {
    public static void init() {
        Class<?> [] classList = {
            ClassHelper.class,
            BeanHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };

        for (Class<?> cls : classList) {
            //可以设置为false，提高性能
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
