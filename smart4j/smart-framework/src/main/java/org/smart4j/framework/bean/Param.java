package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by Think on 2017/7/9.
 */
public class Param {
    private Map<String , Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
