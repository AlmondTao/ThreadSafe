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
public class ChildOne extends FatherClass {

    private static StringBuffer childStr = new StringBuffer("孩子静态变量");

    private StringBuffer childStr2 = new StringBuffer();

    {
        childStr2.append("");
    }

    static {
        childStr .append("");
    }

    public ChildOne(){
        childStr .append("");
    }

    public ChildOne(String str){
        childStr .append(str);
    }
}
