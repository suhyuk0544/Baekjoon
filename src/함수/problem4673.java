package 함수;

public class problem4673 {
    static int d(int n){
        int m = n;
        while (n > 0){
            m += n % 10;
            n /= 10;
        }
        return m;
    }

    public static void main(String[] args) {


        boolean[] a = new boolean[10036];

        for (int i = 0;i < 10000;i++){
            a[d(i)] = true;
        }
        for (int j = 0;j < 10000;j++){
            if (!a[j]){
                System.out.println(j);
            }
        }
    }
}
