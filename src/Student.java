public class Student {
    String firstName, lastName, major;
    int yearGraduation;
    double GPA;

    public Student(String firstName, String lastName, int yearGraduation, double GPA, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearGraduation = yearGraduation;
        this.GPA = GPA;
        this.major = major;
    }

    public int yearOfGraduation(){
        this.yearGraduation++;
        return this.yearGraduation;
    }
}
