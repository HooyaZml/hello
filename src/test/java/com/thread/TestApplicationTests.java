package com.thread;

import com.thread.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println("01====="+aClass);

        Class<?> clazz3 = null;
        try {
            clazz3 = Class.forName("com.thread.pojo.Person");
        } catch (ClassNotFoundException e) {
            // 当找不到指定类时，会抛出此异常
            e.printStackTrace();
        }
        System.out.println("03 - " + clazz3);
    }

}
