package com.dw.design.pattern.behavioral.iterator;

/**
 * Created by geely.
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    /**
     * 获取迭代器
     *
     * @return /
     */
    CourseIterator getCourseIterator();


}
