package com.taoqy.service;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2020/7/14
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */
public class FatherClass {

    private static StringBuffer fathStr = new StringBuffer("父亲静态变量");

    private StringBuffer fathStr2 = new StringBuffer("父亲静态变量");

    {
        fathStr2.append("");
    }

    static {
        fathStr .append("");
    }

    FatherClass(){
        fathStr .append("");
    }

    FatherClass(String str){
        fathStr .append(str);
    }
}
