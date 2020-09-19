package edu.ppu.services;

import java.util.List;

public class SumOverMaxService {

    private ListMaxService listMaxService;
    private ListSumService listSumService;

    public SumOverMaxService(ListMaxService listMaxService,
                             ListSumService listSumService) {
        this.listMaxService = listMaxService;
        this.listSumService = listSumService;
    }

    public float getSumOverMax(List<Integer> numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new RuntimeException("list is empty");

        } else if (listMaxService.getMax() == 0) {
            throw new RuntimeException("division by zero");

        } else
            return listSumService.sum(numbers) / listMaxService.getMax();
    }
}