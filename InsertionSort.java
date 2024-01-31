public class InsertionSort extends AbstractSort {
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 2};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("ソート前の配列: ");
        insertionSort.printArray(arr);

        insertionSort.sort(arr);

        System.out.println("\nソート後の配列: ");
        insertionSort.printArray(arr);
    }
    protected void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            System.out.println("\ti = " + i);
            for (int j = i; j > 0 ; j--){
                System.out.println("\t\tj = " + j);
                System.out.println("\t\tarr[" + j + "] = " + arr[j]);
                System.out.println("\t\tarr[" + (j - 1) + "] = " + arr[j - 1]);
                if (arr[j - 1] > arr[j]){
                    System.out.println("\t\t\t交換");
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;    
                }
                printArray(arr);
            }
            
        }
    }

    
}
