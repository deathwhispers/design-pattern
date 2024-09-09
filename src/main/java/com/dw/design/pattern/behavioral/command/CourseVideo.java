package com.dw.design.pattern.behavioral.command;

/**
 * 作为接收者，实现命令的相应操作
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程视频开放");
    }

    public void close() {
        System.out.println(this.name + "课程视频关闭");
    }
}
