package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class problem10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while (true){
            if ((str = bf.readLine()) == null){
                break;
            }else {
                StringTokenizer st = new StringTokenizer(str);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n");
            }
        }
        bf.close();
        bw.flush();
        bw.close();

    }
}
