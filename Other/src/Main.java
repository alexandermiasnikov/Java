import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String S = String.valueOf(num);
        System.out.println(S.charAt(1));

        Person person = new Person("Alex", 30);
        System.out.println("Old age: " + person.getAge());
        person.setAge(-50);
        person.setAge(31);
        System.out.println("New age: " + person.getAge());

    }

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age){
            if (age >=0){
                this.age = age;
            } else {
                System.out.println("Error! Age can not be negative!");
            }
        }
    }
}
