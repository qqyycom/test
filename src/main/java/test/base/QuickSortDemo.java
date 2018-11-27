package test.base;

public class QuickSortDemo {
    static int [] a = new int[]{6,7,8,1,2,3,9,5,4,11,9,8,5};

    public static void main(String[] args) {
        quickSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
    }

    public static void quickSort(int[] a, int begin, int end){
        if (begin >= end || a == null || a.length <= 1) {
            return;
        }
        int key = a[(begin + end)/2];
        int i = begin, j = end;
        while( i <= j ){
            while(key > a[i]){
                i++;
            }
            while(key < a[j]){
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }else if(i == j){
//                a[i] = key;
                i++;
            }
        }
        quickSort(a, begin, j);
        quickSort(a, i, end);
    }

    @Deprecated
    public static void switchValue(int[] a, int position1, int position2){
        int temp ;
        temp = a[position1];
        a[position1] = a[position2];
        a[position2] = temp;
    }
}


