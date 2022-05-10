package 함수;


import java.util.Arrays;

public class problem4673new {
    static int d(int n){
        int m = n;
        while (n > 0){
            m += n % 10;
            n /= 10;
        }
        return m;
    }

    public static void main(String[] args) {

        int[] result = new int[10036];
        for (int n = 0; n < 10000; n++) {
            result[n] = n;
        }
        for (int i = 0;i < 10000;i++){
            result[d(i)] = -1;
        }
        int[] newresult = Arrays.stream(result).distinct().toArray();
        for (int j = 0; j < newresult.length; j++){
            if (newresult[j] != -1 && newresult[j] != 0){
                System.out.println(newresult[j]);
            }

        }
    }
}
