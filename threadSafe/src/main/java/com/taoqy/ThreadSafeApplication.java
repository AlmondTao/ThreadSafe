package com.taoqy;

import com.taoqy.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2020/7/13
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */
@SpringBootApplication
public class ThreadSafeApplication {



    public static void main(String[] args) {
        ChildOne childOne = new ChildOne("123");
        ChildTwo childTwo = new ChildTwo();
        synchronized (new Object()){

        }
        ReentrantLock lock = new ReentrantLock();

        Condition condition = lock.newCondition();


        lock.lock();
        try {

        }finally {
            lock.unlock();
        }





        SpringApplication.run(ThreadSafeApplication.class,args);
    }



    public static C method(A a, B b)
    {return null;}

    public static D method(C c)
    {return null;}

    public static A method(D d)
    {return null;}


}
