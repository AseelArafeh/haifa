package edu.ppu.services;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSumServiceTest {

    @Test
    void getSum() {
        List<Integer> list = Arrays.asList(5, 2, 10);
        ListSumService listSum = new ListSumService();
        int res = listSum.getSum(list);
        assertEquals(17, res);
    }
}