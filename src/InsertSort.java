public class InsertSort extends SortExample {
    protected void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int j=i-1;
            Comparable key=a[i];
            while(j>=0 && less(key,a[j])){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }

    public static void main(String[] args) {
        InsertSort is=new InsertSort();
        is.test();
    }
}