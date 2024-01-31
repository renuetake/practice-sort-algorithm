public class BubbleSort extends AbstractSort {
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 2};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("ソート前の配列: ");
        bubbleSort.printArray(arr);

        bubbleSort.sort(arr);

        System.out.println("\nソート後の配列: ");
        bubbleSort.printArray(arr);
    }
    
    protected void sort(int[] arr){
        int n = arr.length;

        for (int i = n; i >= 2; i--){
            System.out.println("\ti = " + i);
            for (int j = 0; j < i -1; j++){
                System.out.println("\t\tj = " + j);
                // 隣り合った要素を比較し、順序が逆であれば交換
                if (arr[j] > arr[j + 1]){
                    System.out.println("\t\t\t交換実施");
                    System.out.println("\t\t\tarr[" + j + "](" + arr[j] + ")とarr[" + (j+1) + "](" + arr[j+1] + ")を交換します。");
                    // 交換
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
