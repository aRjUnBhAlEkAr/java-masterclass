package dsa;

public class SelectionSortMain{
    public static void main(String[] args){
        SelectionSort object = new SelectionSort();

        int[] array = new int[5];
        object.acceptData(array);

        System.out.println("Before selection sort: ");
        object.showData(array);

        object.selectionSort(array);

        System.out.println("\nAfter selection sort: ");
        object.showData(array);
    }
};