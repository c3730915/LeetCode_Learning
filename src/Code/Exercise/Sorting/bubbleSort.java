package Code.Exercise.Sorting;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public void bubbleSortOrginal(int arr[]) {
        int n =arr.length;
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public  void bubbleSortOpt(int[] arr) {
        // 初始时 swapped 为 true，否则排序过程无法启动
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            // 如果没有发生过交换，说明剩余部分已经有序，排序完成
            if (!swapped) break;
            // 设置 swapped 为 false，如果发生交换，则将其置为 true
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 表示发生了交换
                    swapped = true;
                }
            }
        }
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0||k==0){
            return new int[0];
        }
        int[] result = new int[k];
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }

            }
            result[k-1-i]=arr[n-1-i];

            if (i==k-1){
                break;
            }
        }
        System.out.println(Arrays.toString(result));

        return result;


    }


    public void bubbleSortOpt2(int[] arr) {
        boolean swapped = true;
        // 最后一个没有经过排序的元素的下标
        int indexOfLastUnsortedElement = arr.length - 1;
        // 上次发生交换的位置
        int swappedIndex = -1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    // 表示发生了交换
                    swapped = true;
                    // 更新交换的位置
                    swappedIndex = i;
                }
            }
            // 最后一个没有经过排序的元素的下标就是最后一次发生交换的位置
            indexOfLastUnsortedElement = swappedIndex;
        }
    }
    @Test
    public void run(){
//       bubbleSortOrginal(new int[]{64, 34, 25, 12, 22, 11, 90});
        getLeastNumbers(new int[]{0,1,2,1},1);
    }
}
