package InstructorRegistration;

public class Courses {
    String title;
    String name;
    String description;

    public Courses() {
        title = null;
        name = null;
        description = null;
    }

    public Courses(String title, String name, String description) {
        this.title = title;
        this.name = name;
        this.description = description;
    }

    public void editTitle(String newTitle) {
        this.title = newTitle;
    }

    public void editDescription(String newDescription) {
        this.description = newDescription;
    }
}
