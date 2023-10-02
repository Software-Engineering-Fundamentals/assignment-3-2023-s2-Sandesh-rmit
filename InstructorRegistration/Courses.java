package InstructorRegistration;
import java.util.ArrayList;

public class Courses {
    String title;
    String name;
    String description;
    boolean refundStatus;
    public ArrayList<String> questionList = new ArrayList<String>();
    public ArrayList<Object> fileList = new ArrayList<Object>();
    public ArrayList<String> examQuestionList = new ArrayList<String>();
    public ArrayList<String> MCQ_questionList = new ArrayList<String>();

    // the constructor classes for the courses class; they include mandatory information about the course such as the title, name, description and refund status
    public Courses() {
        title = null;
        name = null;
        description = null;
        refundStatus = false;
    }

    public Courses(String title, String name, String description, boolean refundStatus) {
        this.title = title;
        this.name = name;
        this.description = description;
        this.refundStatus = refundStatus;
    }

    // edits the title to be reflected in the website, does not need to return any object
    public void editTitle(String newTitle) {
        this.title = newTitle;
    }

    // edits the description to be reflected in the website
    public void editDescription(String newDescription) {
        this.description = newDescription;
    }

    // the course will have either a true or false flag for its refund status; if true then the student can apply for a refund after quitting the course; else, the student 
    // will not have a refund option
    public void eligibleForRefund(String status) {
        if (status.equals("True")) {
            this.refundStatus = true;
        }

        else {
            this.refundStatus = false;
        }
    }

    // questions are stored in question lists which can be called to display the questions in the course
    public void createQuestions(String question) {
        questionList.add(question);
    } 

    public void createExam(String examQuestion) {
        examQuestionList.add(examQuestion);
    }  
    
    public void createMCQ(String MCQ_question) {
        MCQ_questionList.add(MCQ_question);
    }

    // the videoFile variable is listed as a string to denote the file name, in actual application, it would be the specific file type; the fileList array list contains multiple
    // file types
    public void addVideo(String videoFile) {
        fileList.add(videoFile);
    }

    public void addSlide(String pdfFile) {
        fileList.add(pdfFile);
    }

    public void createProject(String projectFile) {
        fileList.add(projectFile);
    }
}
