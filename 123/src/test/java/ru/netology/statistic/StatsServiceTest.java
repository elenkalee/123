package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();
        long [] purchases = {1000, 2000, 3000};
        long expected = 3000;
        long actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }
}