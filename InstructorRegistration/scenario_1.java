package InstructorRegistration;

public class scenario_1 {
    public static void main(String args[]) {
        // this file will be responsible for code related to the following scenario:
        // Instructor registers a course on the learning portal/website
        

        // in the actual implementation, the instructor has the ability to manually enter the information into the fields, however in this "demo" we hardcode the values
        // these are the hardcoded values for the parameters for the instructor and courses classes
        // this assumes that an instructor account already exists
        String email = "daniel@gmail.com";
        String name = "Daniel";
        String username = "Daniel_1";
        String title = "Maths";
        String description = "This is the class for Maths";
        boolean refundStatus = false;

        // creating new objects for each class
        Instructor teacher = new Instructor(email, name, username);
        Courses newCourse = new Courses(title, name, description, refundStatus);

        // adding course
        teacher.editPublishedCourses(newCourse.title);
        
        // add video
        String videoName = "lecture1_video.mp4";
        newCourse.addVideo(videoName);

        // add slide
        String slideName = "lecture1_slides.pdf";
        newCourse.addSlide(slideName);

        // adding content
        // adding questions
        String question1 = "What is the product of 2 multiplied by 4?";
        String question2 = "What is 2 + 2?";
        newCourse.createQuestions(question1);
        newCourse.createQuestions(question2);

        // adding mcq
        String mcq_question = "What is the product of 3 multiplied by 2?";
        String mcq_option1 = "2";
        String mcq_option2 = "6";
        String mcq_option3 = "3";
        String mcq_option4 = "7";

        newCourse.createMCQ(mcq_question, mcq_option1, mcq_option2, mcq_option3, mcq_option4);

        // create exam
        String exam_question = "List down all the prime numbers in the range of 1 to 100, with these numbers inclusive";
        newCourse.createExam(exam_question);

        // project
        String projectName = "pythagorean_theorem_project.pdf";
        newCourse.createProject(projectName);

    }
}