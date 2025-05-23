package ProblemSolving2;

import java.util.Arrays;

public class Segregate0and1 {

    public void swap(int[] arr,int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


  public void segregate(int[] arr) {

        int start = 0;

        int end = arr.length - 1;

        while (start < end){

            if(arr[start] == 1 && arr[end] == 0){
                swap(arr,start,end);
                start++;
                end--;

            } else if (arr[start] == 0) {
                start++;

            } else if (arr[end] == 1) {
                end--;
            }

        }

    }

    public static void main(String[] args) {
        Segregate0and1 s = new Segregate0and1();
        int[] n = {1,1,1,1,0,0,0,0,0};
        s.segregate(n);

        System.out.println(Arrays.toString(n));


    }
 }





