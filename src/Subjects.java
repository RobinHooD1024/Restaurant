public class Subjects {
    private String course;
    private String teacher;
    private int complete;

    public Subjects(String course, String teacher, int complete) {
        this.course = course;
        this.teacher = teacher;
        this.complete = complete;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public void subjectDetails() {
        System.out.println(course+" ведет учитель "+teacher+" и он уже окончен на "+complete+"%");
    }

}
