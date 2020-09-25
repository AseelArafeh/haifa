package edu.ppu.services;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SumOverMaxServiceTest {

    @Test(expected = RuntimeException.class)
    public void testSumOverMaxEmptyArray() {
        SumOverMaxService sumOverMax = new SumOverMaxService(null, null);
        List<Integer> list = new ArrayList<>();
        float rest = sumOverMax.getSumOverMax(list);

    }

    @Test
    public void testSumOverMax(){
        ListMaxService mockMAX = mock(ListMaxService.class);
        ListSumService mockSUM = mock(ListSumService.class);
        SumOverMaxService sumOverMax = new SumOverMaxService(mockMAX, mockSUM);
        List<Integer> list = Arrays.asList(5, 2, 10);
        when(mockMAX.getMax(list)).thenReturn(10);
        when(mockSUM.getSUM(list)).thenReturn(17);
        float res = sumOverMax.getSumOverMax(list);
        assertEquals(1.7, res);
    }

}