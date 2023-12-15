package com.guangjian.design.pattern.behavioral.command;

/**
 * 命令的具体类，实现命令接口
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
