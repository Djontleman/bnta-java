package com.djontleman.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {

    private BracketChecker bracketChecker;

    @BeforeEach
    void setUp() {
        bracketChecker = new BracketChecker();
    }

    @Test
    void canCheckCorrectNumberOfBrackets() {
        // given
        String input = "({})";

        // when
        boolean actual = bracketChecker.bracketChecker(input);

        // then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckIncorrectNumberOfBrackets() {
        // given
        String input = "([)";

        // when
        boolean actual = bracketChecker.bracketChecker(input);

        // then
        assertThat(actual).isFalse();
    }

    @Test
    @Disabled
    void canCheckWhenInputIsEmpty() {
        // given
        String input = "";

        // when
        boolean actual = bracketChecker.bracketChecker(input);

        // then
        assertThat(actual).isTrue();
    }
}