class Selectionsort{
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {9,8,2,1,3};

       //selection sort
        for(int i=0; i<arr.length-1; i++) {
            int smallest=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                   //swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr);
    }
}
