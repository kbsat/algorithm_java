package javatest.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(new Student(30, "A군"));
        pq.offer(new Student(90, "B양"));
        pq.offer(new Student(95, "C군"));
        pq.offer(new Student(50, "D군"));
        while (!pq.isEmpty()) {
            Student now = pq.poll();
            System.out.println(now.name + "의 점수는 " + now.score);
        }
    }

    public static class Student implements Comparable<Student> {
        private int score;
        private String name;

        public Student(int score, String name) {
            this.score = score;
            this.name = name;
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
