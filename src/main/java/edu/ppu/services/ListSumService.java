package edu.ppu.services;

import java.util.List;

public class ListSumService {

    public int getSum(List<Integer> nums){
        int total = 0;
        for (int i = 0; i < nums.size(); i++){
            total = total + nums.get(0);

        }
        return total;
}
}