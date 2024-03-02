package org.example;

import java.util.List;

/**
 * 일급 컬렉션 사용 : 리스트 형태로된 과목 정보만 인스턴스 변수로 가지는 클래스
 * 과목 정보를 가지고 처리할 수 있는 책임들을 Courses 라는 일급컬렉션으로 위임
 */
public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course-> Course.multiplyCreditAndCourseGrade())
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
