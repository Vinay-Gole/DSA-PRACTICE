package PracticeQues;

import java.util.HashSet;
import java.util.Set;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
       
        for(int i:removeDuplicates()){
            System.out.println(i);
        }

    }

    static int[] removeDuplicates( ){
       int  array[]={1,8,8,7,8,7,8,7,8,7,8,7};

        Set<Integer> uniqElements=new HashSet<>();

        for(int num:array){
            uniqElements.add(num);
        }

        int uniqElementsArr[]=new int[uniqElements.size()];

    int index=0;
    for(int num:uniqElements){
        uniqElementsArr[index]=num;
        index++;
    }
    return uniqElementsArr;
    }
}