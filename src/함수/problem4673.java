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

        boolean[] a = new boolean[10000];

        for (int i = 1;i < 10000;i++){
            a[d(i) - 1] = true;
        }
        for (int j = 0;j < 10000;j++){
            if (!a[j]){
                System.out.println(j + 1);
            }
        }
    }

}
