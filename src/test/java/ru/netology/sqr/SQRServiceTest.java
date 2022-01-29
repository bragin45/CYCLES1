package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void SqrLimit200300() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.sqrCalc(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void SqrLimit200400() {
        SQRService sqrService = new SQRService();

        int expected = 6;
        int actual = sqrService.sqrCalc(200, 400);

        assertEquals(expected, actual);
    }

}