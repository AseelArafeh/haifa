package edu.ppu.services;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;



public class ListSumServiceTest {

    @Test
    public void testSum() {
        List<Integer> list = Arrays.asList(5, 2, 10);
        ListSumService listSum = new ListSumService();
        int res = listSum.getSum(list);
        assertEquals(17, res);
    }
}