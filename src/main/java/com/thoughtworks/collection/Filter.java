package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    	List<Integer> result = new ArrayList<Integer>();
    	for (Integer item : this.array) {
			if (item % 2 == 0) {
				result.add(item);
			}
		}
    	return result;
    }

    public List<Integer> filterMultipleOfThree() {
    	List<Integer> result = new ArrayList<Integer>();
    	for (Integer item : this.array) {
			if (item % 3 == 0) {
				result.add(item);
			}
		}
    	return result;
    }
    
}
