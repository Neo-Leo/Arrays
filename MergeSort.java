public class MergeSort {

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=low, j=mid+1, k=0;
        // Two partitions: [i,mid] and [mid+1, j]
        while(i<=mid && j<=high) {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i<=mid) temp[k++] = arr[i++];
        while (j<=high) temp[k++] = arr[j++];
        k = low;
        for(int idx=0; idx<temp.length; idx++) {
            arr[k++] = temp[idx];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        for (int e : arr) System.out.print(e);
    }
}
