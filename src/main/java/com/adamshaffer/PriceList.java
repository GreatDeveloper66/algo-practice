package com.adamshaffer;

public class PriceList implements ListCalculationsInterface {

    private Integer[] list;

    public PriceList(Integer[] list) {
        this.list = list;
    }

    public Integer[] getList() {
        return list;
    }

    public void setList(Integer[] list) {
        this.list = list;
    }

    public Integer getElement(int index) {
        return list[index];
    }

    //implement SumInterface
    public Integer sum(Integer[] list) {
        Integer sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    //implement MinInterface
    public Integer min(Integer[] list) {
        Integer min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    //implement MaxInterface
    public Integer max(Integer[] list) {
        Integer max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    //implement AverageInterface
    public Integer average(Integer[] list) {
        return sum(list) / list.length;
    }

    //implement MedianInterface
    public Integer median(Integer[] list) {
        if (list.length % 2 == 0) {
            return (list[list.length / 2] + list[list.length / 2 - 1]) / 2;
        } else {
            return list[list.length / 2];
        }
    }

    //implement ModeInterface
    public Integer mode(Integer[] list) {
        Integer maxCount = 0;
        Integer mode = 0;
        for (int i = 0; i < list.length; i++) {
            Integer count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = list[i];
            }
        }
        return mode;
    }

    //implement SortInterface
    public Integer[] sort(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    Integer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

}
