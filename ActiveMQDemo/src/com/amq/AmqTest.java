package com.amq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmqTest extends Thread{

    public static void main(String[] args) {
        Thread thread1=new AmqTest();
        thread1.start();
    }

    @Override
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/amq/app-jms.xml");
    }
}
