package edu.ppu.services;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListMaxServiceTest {

        @Test
        public void testMax(){

            List<Integer> list = Arrays.asList(5, 2, 10);
            ListMaxService listMax = new ListMaxService();
            int res = listMax.getMax(list);
            assertEquals(10, res);
            //comment
        }

}