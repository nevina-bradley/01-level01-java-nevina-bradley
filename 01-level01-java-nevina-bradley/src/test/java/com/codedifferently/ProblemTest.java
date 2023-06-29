package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void doubleCharTest01(){
        Problem problem = new Problem();
        String input = "The";

        String expected = "TThhee";
        String actual = problem.doubleChar(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharTest02(){
        Problem problem = new Problem();
        String input = "AAbb";

        String expected = "AAAAbbbb";
        String actual = problem.doubleChar(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleCharTest03(){
        Problem problem = new Problem();
        String input = "Hi-There";
        String expected = "HHii--TThheerree";
        String actual = problem.doubleChar(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countHiTest01(){
        Problem problem = new Problem();
        String input = "abc hi ho";
        Integer expected = 1;
        Integer actual = problem.countHi(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countHiTest02(){
        Problem problem = new Problem();
        String input = "ABChi hi";
        Integer expected = 2;
        Integer actual = problem.countHi(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countHiTest03(){
        Problem problem = new Problem();
        String input = "hihi";
        Integer expected = 2;
        Integer actual = problem.countHi(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void catDogTest01(){
        Problem problem = new Problem();
        String input = "catdog";
        Boolean actual = problem.catDog(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void catDogTest02(){
        Problem problem = new Problem();
        String input = "catcat";
        Boolean actual = problem.catDog(input);
        Assertions.assertFalse(actual);
    }

    @Test
    public void catDogTest03(){
        Problem problem = new Problem();
        String input = "1cat1cadodog";
        Boolean actual = problem.catDog(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void countCodeTest01(){
        Problem problem = new Problem();
        String input = "aaacodebbb";
        Integer expected = 1;
        Integer actual = problem.countCode(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countCodeTest02(){
        Problem problem = new Problem();
        String input = "codexxcode";
        Integer expected = 2;
        Integer actual = problem.countCode(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countCodeTest03(){
        Problem problem = new Problem();
        String input = "cozexxcope";
        Integer expected = 2;
        Integer actual = problem.countCode(input);
        Assertions.assertEquals(expected, actual);
    }
}
