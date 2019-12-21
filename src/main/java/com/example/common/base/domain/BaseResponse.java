package com.example.common.base.domain;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回数据
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午9:59:27
 */
public class BaseResponse extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    public static final int SUCCESS = 200;
    public static final int ERROR = 500;
    public static final int NO_PATH = 404;
    public static final String SUCCESS_MSG = "success";

    public BaseResponse() {
        put("code", SUCCESS);
        put("msg", SUCCESS_MSG);
    }

    @NotNull
    public static BaseResponse error() {
        return error(ERROR, "未知异常，请联系管理员");
    }

    @NotNull
    public static BaseResponse error(String msg) {
        return error(ERROR, msg);
    }

    @NotNull
    public static BaseResponse noPath(String msg) {
        return error(NO_PATH, msg);
    }

    @NotNull
    public static BaseResponse error(int code, String msg) {
        BaseResponse r = new BaseResponse();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    @NotNull
    public static BaseResponse ok(String msg) {
        BaseResponse r = new BaseResponse();
        r.put("msg", msg);
        return r;
    }

    @NotNull
    public static BaseResponse ok(Map<String, Object> map) {
        BaseResponse r = new BaseResponse();
        r.putAll(map);
        return r;
    }

    @NotNull
    @Contract(" -> new")
    public static BaseResponse ok() {
        return new BaseResponse();
    }

    public static BaseResponse list(List list) {
        return new BaseResponse().put("list", list);
    }

    public static BaseResponse info(Object o) {
        return new BaseResponse().put("info", o);
    }

    @Override
    public BaseResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
