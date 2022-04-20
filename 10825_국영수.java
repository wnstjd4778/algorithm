import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static class Student implements Comparable<Student> {

        String name;
        int Korean;
        int English;
        int math;

        Student(String name, int Korean, int English, int math) {
            this.name = name;
            this.Korean = Korean;
            this.English = English;
            this.math = math;
        }
        @Override
        public int compareTo(Student o) {
            if(this.Korean == o.Korean) {
                if(this.English == o.English) {
                    if(this.math == o.math) {
                        return this.name.compareTo(o.name);
                    } else {
                        return o.math - this.math;
                    }
                } else {
                    return this.English - o.English;
                }
            } else {
                return o.Korean - this.Korean;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int Korean = Integer.parseInt(st.nextToken());
            int English = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Student(name, Korean, English, math));
        }

        Collections.sort(list);
        for(Student student : list) {
            System.out.println(student.name);
        }
    }
}
