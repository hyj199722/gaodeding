package mju.hyj326;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EnableTransactionManagement	//开启事务管理

public class Hyj326Application {

    public static void main(String[] args) {

        SpringApplication.run(Hyj326Application.class, args);
    }

}
