package com.zipcodewilmington.looplabs;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);

    }

//    Given an object, IntegerDuplicateDeleter, with a composite Integer[] object, write a method
//    removeDuplicatesExactly which removes all values in the array which occur exactly the specified number of times.
//    removeDuplicates which removes all values in the array which occur at least the specified number of times.


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {



Integer[] newArr = new Integer[0];

    for (Integer x : array){
        if(getNumberOfOccurences(x) < maxNumberOfDuplications){
            int index = newArr.length;
            newArr = Arrays.copyOf(newArr,index+1);
            newArr[index] = x;
        }
    }
//        Integer[] firstArr = array;
//        Integer[] secArr = firstArr;
//        Integer[] resultArr = new Integer[array.length];
//
//        int count = 0;
//
//
//        Integer[] resultArr2;
//        for (int i = 0; i < array.length; i++) {
//            if (firstArr[i] == firstArr[i + 1]) {
//                count++;
//            }
//            if (firstArr[i] != firstArr[i + 1]) {
//                resultArr2 = new Integer[array.length-];
//                resultArr2[i] = array[i];
//
//            }
//
//        }
//
//
//        return resultArr2;
        return newArr;
    }

    public Integer getNumberOfOccurences(int numberOfOccurences){
        int count = 0;
        for (int x : array){
            if (x == numberOfOccurences){
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] newArr = new Integer[0];

        for (Integer x : array){
            if(getNumberOfOccurences(x) != exactNumberOfDuplications){
                int index = newArr.length;
                newArr = Arrays.copyOf(newArr,index+1);
                newArr[index] = x;
            }
        }
        return newArr;
    }
}
