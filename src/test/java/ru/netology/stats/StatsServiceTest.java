package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

/*
    @ParameterizedTest
    @MethodSource("sumSalesTestArguments")
    void sumSalesTest(int expected, int[] actual) {
        assertEquals(180, service.sumSales(sales));
    }

    static Stream<Arguments> sumSalesTestArguments() {
        int[] sales1 = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] sales2 = {8, 15, 15, 13, 17, 20};
        return Stream.of(Arguments.of(180, sales1),
                Arguments.of(85, sales2)
        );
    }
*/

    @Test
    void sumSalesTest() {
        assertEquals(180, service.sumSales(sales));
    }

    @Test
    void averageSumSalesTest() {
        assertEquals(15, service.averageSumSales(sales));
    }

    @Test
    void maxSalesTest() {
        assertEquals(8, service.maxSales(sales));
    }

    @Test
    void minSalesTest() {
        assertEquals(9, service.minSales(sales));
    }

    @Test
    void salesLessAverageTest() {
        assertEquals(5, service.salesLessAverage(sales));
    }

    @Test
    void salesMoreAverageTest() {
        assertEquals(5, service.salesMoreAverage(sales));
    }

}