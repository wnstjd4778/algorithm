import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            boolean[] check = new boolean[n + 1];
            ArrayList<Student> students = new ArrayList<>();

            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                Student student = new Student(start, end);
                students.add(student);
            }

            Collections.sort(students);

            int index = 0;
            int bookCount = n;
            while (index < m && bookCount > 0) {
                Student s = students.get(index);
                for(int i = s.start; i <= s.end; i++) {
                    if(!check[i]) {
                        count++;
                        check[i] = true;
                        bookCount--;
                        break;
                    }
                }
                index++;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    static class Student implements Comparable<Student> {
        int start;
        int end;
        int gap;
        Student(int start, int end) {
            this.start = start;
            this.end = end;
            this.gap = end - start + 1;
        }

        @Override
        public int compareTo(Student o) {
            if(this.end < o.end) {
                return -1;
            } else if(this.end == o.end) {
                return this.gap < o.gap ? -1 : 1;
            } else {
                return 1;
            }
        }
    }
}

