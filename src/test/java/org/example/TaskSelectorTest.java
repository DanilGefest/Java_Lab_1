package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskSelectorTest {

    @Test
    void fizzBuzzTask() {
        String[] testArray = {"1", "2","3","4","fizz","6","buzz",};
        List<String> test = Arrays.asList(testArray);
        assertEquals(test, TaskSelector.fizzBuzzTask(7));
    }

    @Test
    void reverseStringTask() {
        String testString ="llatsni ekam";
        assertEquals(testString, TaskSelector.reverseStringTask());
    }

    @Test
    void solveQuadraticEquation() {
        double a, b, c;
        a = -6; b = 0; c = 54;
        Double[] testArray1 = {-3.0, 3.0};
        List<Double> test1 = Arrays.asList(testArray1);
        assertEquals(test1, TaskSelector.solveQuadraticEquation(a, b, c));
    }
}