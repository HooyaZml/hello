package com.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.getSum(40));
        SpringApplication.run(TestApplication.class, args);
    }

}
class Sum{
    Integer getSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
