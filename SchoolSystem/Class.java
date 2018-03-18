public class Class{
    private Student student1, student2, student3;

    public Class(Student s1, Student s2, Student s3){
        this.student1 = s1;
        this.student2 = s2;
        this.student3 = s3;
    }

    public double classScore(){
        return ( this.student1.finalScore() + this.student2.finalScore() + this.student3.finalScore() )/3;
    }
}
