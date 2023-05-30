package 백트래킹;

import java.io.*;

import java.util.StringTokenizer;

public class problem15650 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer stringTokenizer;

    static {
        try {
            stringTokenizer = new StringTokenizer(bf.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static int M = Integer.parseInt(stringTokenizer.nextToken());

    static boolean[] booleans = new boolean[M];

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= M; i++) {
            bw.write(i);
            select(i);
        }

        bw.flush();
        bf.close();
        bw.close();
    }

    public static void select(int num) throws IOException {
        if (num >= M)
            return;

        for (int i = 1;i < M; i++){
            if (!booleans[i] || i != num)
                bw.write(i + " ");
        }
        bw.write("\n");
        select(num + 1);
    }
}