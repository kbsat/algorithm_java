package sort;

import java.util.*;

public class book_180p {
    public static void main(String[] args) {
        // 나의 풀이 ( Map 이용 )
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

//        Map<String, Integer> dict = new HashMap<>();
//        for (int i = 0; i<num;i++){
//            String name = sc.next();
//            int score = sc.nextInt();
//
//            dict.put(name, score);
//        }
//
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(dict.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        list.forEach(entry -> {
//            System.out.print(entry.getKey()+" ");
//        });

        // 나동빈 풀이 ( class 이용 )
        List<Student> students = new ArrayList<>();

        for (int i = 0; i<num;i++){
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }
        Collections.sort(students);
        students.forEach(student -> System.out.print(student.getName() + " "));
    }


    private static class Student implements Comparable<Student> {
        private final String name;
        private final int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public int compareTo(Student other) {
            if (this.score > other.score) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}