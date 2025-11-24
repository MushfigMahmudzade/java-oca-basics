package school.management;

public class SchoolTest {
    public static void main(String[] args) {

        //  Teacher obyekti yaradırıq
        Teacher teacher = new Teacher();
        teacher.name = "Nicat teacher";
        teacher.subject = "Mathematics";
        teacher.teach();

        //  Student obyekti yaradırıq
        Student student = new Student();
        student.name = "Huseyn";
        student.grade = 5;
        student.study();
    }
}