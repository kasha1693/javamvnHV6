package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales;
    }

    long average(long[] sales) {
        long averageSales = sum(sales) / 12;

        return averageSales;
    }

    int maxSaleMonth(long[] sales) {
        int monthNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthNum]) {
                monthNum = i;
            }

        }
        return monthNum + 1;
    }

    int minSaleMonth(long[] sales) {
        int monthNum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthNum]) {
                monthNum = i;
            }

        }
        return monthNum + 1;
    }

    int salesBelowTheAverage(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                counter++;
            }

        }
        return counter;
    }

    int salesAboveAverage(long[] sales) {
        int counter = 0;
        long averageSales = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                counter++;
            }

        }
        return counter;
    }

}
