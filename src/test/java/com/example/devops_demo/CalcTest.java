package com.example.devops_demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testAdd(){
        Calc calc = new Calc();
        long result = calc.add(10, 20);

        Assertions.assertThat(result).isEqualTo(30);
    }
}
