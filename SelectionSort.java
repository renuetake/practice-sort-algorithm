public class SelectionSort extends AbstractSort{
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 2};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("ソート前の配列: ");
        selectionSort.printArray(arr);

        selectionSort.sort(arr);

        System.out.println("\nソート後の配列: ");
        selectionSort.printArray(arr);
    }
    protected void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int k = i;
            System.out.println("\ti = " + i);
            System.out.println("\tk = " + k);
            for (int j = i; j < n; j++){
                System.out.println("\t\tj = " + j);
                if(arr[k] > arr[j]){
                    System.out.println("\t\t\t交換");
                    System.out.println("\t\t\tk = " + k + " → " + j);
                    k = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
            printArray(arr);
        }
    }

}
