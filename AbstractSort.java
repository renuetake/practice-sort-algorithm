abstract class AbstractSort {
    abstract protected void sort(int[] arr);

    public void printArray(int[] arr){
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
