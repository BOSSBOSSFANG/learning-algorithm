public class InsertSort extends SortExample {
    protected void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        InsertSort is=new InsertSort();
        is.test();
    }
}
