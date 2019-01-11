package com.artificialunintelligent.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 4:27 PM 2019/1/4
 */
@Data
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private Integer age;

}
