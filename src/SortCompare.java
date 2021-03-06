import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.Selection;

public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        switch (alg) {
            case "Insertion" -> Insertion.sort(a);
            case "Shell" -> Shell.sort(a);
            case "Merge" -> Merge.sort(a);
            case "Quick" -> Quick.sort(a);
            case "Heap" -> Heap.sort(a);
            case "Selection" -> Selection.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg,int N,int T){
        double total=0.0;
        Double[] a = new Double[N];
        for(int t=0;t<T;t++){
            for(int i=0;i<N;i++){
                a[i]=StdRandom.uniform();
            }
            total+=time(alg,a);
        }
        return total;
    }

    public static void main(String[] args){
        String alg1=args[0];
        String alg2=args[1];
        int N=Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1=timeRandomInput(alg1,N,T);
        double t2=timeRandomInput(alg2,N,T);
        StdOut.printf("%s cost %.1f s,%s cost %.1f s\n",alg1,t1,alg2,t2);
        StdOut.printf("For %d random doubles\n %s is",N,alg1);
        StdOut.printf("%.1f times faster than %s \n",t2/t1,alg2);
    }
}
