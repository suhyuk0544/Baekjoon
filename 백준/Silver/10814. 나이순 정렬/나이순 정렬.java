import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        User[] users = new User[n];
        int[] count = new int[201];
        User[] result = new User[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users[i] = new User(num,name);
        }
        for (int j = 0; j < n; j++) {
            count[users[j].getAge()]++;
        }
        for (int j = 1; j < count.length; j++) {
            count[j] += count[j-1];
        }
        for (int k = n-1; k >= 0; k--) {
            if (count[users[k].getAge()] != 0){
                count[users[k].getAge()]--;
                result[count[users[k].getAge()]] = new User(users[k].getAge(),users[k].getName());
            }
        }
        for (User user : result) {
            System.out.println(user);
        }
    }
    public static class User {
        int age;
        String name;
        User user;
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}