package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void findMaxIfArrSameNumbers() {
        StatisticsService service = new StatisticsService();

        long expected = 77;
        long actual = service.findMax(new long[]{44, 12, 15, 77});
        Assertions.assertEquals(expected, actual);
    }
}