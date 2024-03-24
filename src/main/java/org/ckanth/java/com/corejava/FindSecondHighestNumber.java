package org.ckanth.java.com.corejava;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        new FindSecondHighestNumber().findSecondHighest();
    }
    public void findSecondHighest() {
        int largest = 0, secondLargest = 0;
        int arr[] = new int[] {1,2,3,10,4,8,9,100};
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Number is :"+largest + "\nSecond Largest Number is :"+ secondLargest);
    }
}
