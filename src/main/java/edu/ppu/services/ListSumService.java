package edu.ppu.services;

import java.util.List;

public class ListSumService {
    int total = 0;
    public int sum(int[] nums){
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return total;
}
}