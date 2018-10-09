import java.util.Arrays;
import java.lang.Object;

public class BubbleSort
// Java program for implementation of Bubble Sort
{
    // Driver method to test above
    public static void main(String args[]) {
        int Total = 50000;
        int totalRun = 10;
        BubbleSort ob = new BubbleSort();
        //1.setup array
        int[] numbers = new int[Total];
        long[] recordswith = new long[totalRun];
        long[] recordswithout = new long[totalRun];
        for (int i = 0; i < totalRun; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = (int) (Math.random() * 2000000);
            }//end for loop
            //copy array
            int[] copyNumber = Arrays.copyOfRange(numbers, 0, Total);
            recordswith[i] = ob.runWithSplit(numbers);
            recordswithout[i] = ob.runWithoutSplit(numbers);
        }

        ob.printArray(recordswithout);
        ob.printArray(recordswith);
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    /* Prints the array */
    void printArray(long arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    //run without split
    long runWithoutSplit(int arr[]) {
        long time1 = System.currentTimeMillis();
        bubbleSort(arr);
        long time2 = System.currentTimeMillis();

        return time2 - time1;
    }
    //run with split
    long runWithSplit(int arr[]) {
        int len = arr.length;
        int a[] = Arrays.copyOfRange(arr, 0, len / 2);
        int b[] = Arrays.copyOfRange(arr, (len / 2), len);
        long time1 = System.currentTimeMillis();
        bubbleSort(a);
        bubbleSort(b);
        long time2 = System.currentTimeMillis();
        int[] combined = new int[len];
        System.arraycopy(a, 0, combined, 0, len / 2);
        System.arraycopy(b, 0, combined, len / 2, len / 2);
        long time3 = System.currentTimeMillis();
        bubbleSort(combined);
        long time4 = System.currentTimeMillis();
        return time2 - time1 + time4 - time3;
    }
}