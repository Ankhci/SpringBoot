package com.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description 
 *  * @param null
 * @Return
 * @Exception   
 * @Author      Ankhci
 * @Date        2019/12/25 22:35
 */
@SpringBootApplication
@MapperScan("com.hp.mapper")
public class Application {
    public static void main(String[] args) {
        //启动
        SpringApplication.run(Application.class,args);
    }
}
