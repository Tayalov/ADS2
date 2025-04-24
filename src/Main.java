import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(137);

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String keyName = "Key" + rand.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, keyName);

            String studentName = "Student" + rand.nextInt(1000);
            int grade = rand.nextInt(101);
            Student value = new Student(studentName, grade);

            table.put(key, value);
        }

        table.printBuckets();
    }
}
