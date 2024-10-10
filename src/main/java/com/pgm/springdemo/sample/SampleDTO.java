package com.pgm.springdemo.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getter/setter 만들어줌
@NoArgsConstructor
@AllArgsConstructor
public class SampleDTO {
    private String name;
    private int age;
    private String[] hobby;
}
