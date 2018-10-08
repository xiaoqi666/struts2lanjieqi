package com.xiaoqi.a_interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 拦截器:第一种创建方式implements Interceptor
 * 拦截器生命周期:随项目的启动而创建,随项目关闭而销毁
 */
public class MyInterceptor implements Interceptor {

    @Override
    //初始化
    public void init() {

    }

    @Override
    //核心拦截方法
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        return null;
    }

    @Override
    //销毁
    public void destroy() {

    }

}
