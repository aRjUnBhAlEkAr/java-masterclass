package dsa;

public class BubbleSortMain{
    public static void main(String[] args){
        int[] array = new int[10];

        BubbleSort object = new BubbleSort();
        object.acceptData(array);
        System.out.println("Before Bubble Sort: ");
        object.showData(array);

        object.bubbleSort(array);

        System.out.println("\nAfter Bubble Sort: ");
        object.showData(array);
    }
};