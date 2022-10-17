import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void divisionThree() {
        int number = 9;

        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void divisionFive() {
        int number = 10;

        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void divisionFiveAndThree() {
        int number = 15;

        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void divisionRemainder() {
        int number = 16;

        String expected = "so ban dau la :"+number;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void negative() {
        int number = -16;

        String expected = "can nhap so lon hon 0";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

}