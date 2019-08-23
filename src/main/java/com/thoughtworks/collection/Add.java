package com.thoughtworks.collection;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	//求leftBorder 和rightBorder之间的偶数和
    	int sum = 0;
    	if( leftBorder > rightBorder) {
    		int temp = rightBorder;
    		rightBorder = leftBorder;
    		leftBorder = temp;
    	}    	
    	for (int i = leftBorder; i <= rightBorder; i++) {
			if (i %2 == 0) {
				sum += i;
			}
		}
    	return sum;
    }
//求数组中每个元素的3倍加2的和
    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	int sum=0;
    	for (int temp  : arrayList) {
    		sum+=(temp*3)+2;
		}
    	return sum;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
    	int sum=0;
    	int count=0;
    	for (int temp  : arrayList) {
			if(temp%2==0){
				sum+=temp;
				count++;
			}
		}
    	return sum/count;
    }
}
