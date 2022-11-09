package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

/*
 * 전략 패턴
 */
public class App {
    public static void main(String[] args) {
        Teacher t1 = new JavaTeacher();
        t1.수업시작();

        System.out.println("==========");

        Teacher t2 = new PythonTeacher();
        t2.수업시작();
    }
}
