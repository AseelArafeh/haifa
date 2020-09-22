package edu.ppu.services;

import java.util.List;

public class ListMaxService {
    public int getMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size();i++) {
            if(numbers.get(i) > max)
        {
            max = numbers.get(i);
        }
        }

        return max;
    }
}