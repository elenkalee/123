package ru.netology.statistic;

public class StatsService {
    public long findMax (long[] purchases) {
        long currentMax = purchases [0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }
}
