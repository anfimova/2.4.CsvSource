package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageSumSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSumSales(sales);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void salesLessAverageTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.salesLessAverage(sales);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void salesMoreAverageTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.salesMoreAverage(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

}