package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int averageSumSales(int[] sales) {
        int countMonth = sales.length;
        int averageSumSales = sumSales(sales) / countMonth;
        return averageSumSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesLessAverage(int[] sales) {
        int countSalesLessAverage = 0;
        int averageSumSales = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                countSalesLessAverage += 1;
            }
        }
        return countSalesLessAverage;
    }

    public int salesMoreAverage(int[] sales) {
        int countSalesMoreAverage = 0;
        int averageSumSales = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales) {
                countSalesMoreAverage += 1;
            }
        }
        return countSalesMoreAverage;
    }

}
