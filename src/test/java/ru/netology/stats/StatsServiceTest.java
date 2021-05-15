package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

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

    @Test
    void averageSumSalesTest() {
        assertEquals(13, service.averageSumSales(sales));
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
        assertEquals(2, service.salesLessAverage(sales));
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