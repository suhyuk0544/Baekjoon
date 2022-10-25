package 브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class problem7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        People[] arr = new People[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i] = new People(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < arr.length; i++) {
            People people = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (people.getK() > arr[j].getK()){

                }else {
                    if (people.getN() < arr[j].getN()){
//                        people.setU();
                    }
                }
            }
        }


    }

    public static class People{
        int k;
        int n;
        int u;
        public int getK() {
            return k;
        }
        public int getN() {
            return n;
        }
        public int setU(int u){
            return this.u = u;
        }
        public People(int k, int n){
            this.k = k;
            this.n = n;
        }
    }
}
