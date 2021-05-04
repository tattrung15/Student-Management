package dao;

import java.util.Date;

public class Class {

    private Integer classId;
    private String className;
    private Date startTime;
    private Date endTime;
    private Course course;

    public Class() {
    }

    public Class(Integer classId, String className, Date startTime, Date endTime, Course course) {
        this.classId = classId;
        this.className = className;
        this.startTime = startTime;
        this.endTime = endTime;
        this.course = course;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Class{" + "classId=" + classId + ", className=" + className + ", startTime=" + startTime + ", endTime=" + endTime + ", course=" + course + '}';
    }

}
