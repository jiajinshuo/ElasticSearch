package com.jiajinshuo.sbt_es.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author jiajinshuo
 * @create 2020-04-24 13:54
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;
}
