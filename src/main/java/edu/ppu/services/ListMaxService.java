package edu.ppu.services;

import java.util.List;

public class ListMaxService {
    public int getMax(List<Integer> numbers) {
        int max = numbers.indexOf(0);
        for(int i = 1; i < numbers.size();i++) {
            if(numbers.indexOf(i) > max)
        {
            max = numbers.indexOf(i);
        }
        }
        return max;
    }
}