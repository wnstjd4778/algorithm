import java.io.*;
import java.util.*;


public class Main {

    public static class Person {
        int age;
        String name;
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Person[] person = new Person[size];
        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            person[i] = new Person(age, name);
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        for(int i = 0; i < size; i++) {
            System.out.println(person[i].age + " " + person[i].name);
        }
    }
}
