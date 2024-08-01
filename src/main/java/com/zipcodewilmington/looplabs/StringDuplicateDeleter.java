package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] newArr = new String[0];

        for (String x : array){
            if(getNumberOfOccurences(x) < maxNumberOfDuplications){
                int index = newArr.length;
                newArr = Arrays.copyOf(newArr,index+1);
                newArr[index] = x;
            }
        }
        return newArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] newArr = new String[0];

        for (String x : array){
            if(getNumberOfOccurences(x) != exactNumberOfDuplications){
                int index = newArr.length;
                newArr = Arrays.copyOf(newArr,index+1);
                newArr[index] = x;
            }
        }
        return newArr;
    }

    public Integer getNumberOfOccurences(String numberOfOccurences){
        int count = 0;
        for (String x : array){
            if (x.equalsIgnoreCase(String.valueOf(numberOfOccurences)) ){
                count++;
            }
        }
        return count;
    }
}
