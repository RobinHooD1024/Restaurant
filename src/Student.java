public class Student {
    private String name;
    private String lastName;
    private int codeWarsRating = 0;
    private Subjects subjects;


    public Student(String name, String lastName, int codeWarsRating, Subjects subjects) {
        this.name = name;
        this.lastName = lastName;
        this.codeWarsRating = codeWarsRating;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCodeWarsRating() {
        return codeWarsRating;
    }

    public void setCodeWarsRating(int codeWarsRating) {
        this.codeWarsRating = codeWarsRating;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public void studentDetails() {
        System.out.println(name+" "+lastName+" имеет рейтинг в codewars "+codeWarsRating+" и посещает курс "+subjects.getCourse());
    }
}
