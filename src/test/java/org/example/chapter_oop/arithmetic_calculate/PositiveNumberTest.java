package org.example.chapter_oop.arithmetic_calculate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {

    @Test
    @ValueSource(ints ={0, -1})
    void createTest(int value) {
        assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
