public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 9, 55, 3};
        for (int e: arr){
            System.out.println(e);
        }
        System.out.println("");
        bubbleSort(arr);
        for (int e: arr){
            System.out.println(e);
        }

    }
    public static void bubbleSort(int[] arr){
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            check = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    check = true;
                }
            }
        }
    }
}
