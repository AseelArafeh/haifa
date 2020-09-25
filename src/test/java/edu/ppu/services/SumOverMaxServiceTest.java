package edu.ppu.services;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SumOverMaxServiceTest {

        @Test
        public void testSumOverMax(){
            
            List<Integer> list = Arrays.asList(5, 2, 10);
            SumOverMaxService sumOverMax = new SumOverMaxService();
            float res = sumOverMax.getSumOverMax(list);
            assertEquals(1.7, res);
        }

}