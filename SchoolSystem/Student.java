public class Student{
    private Test test1, test2;

    public Student(Test t1, Test t2){
        this.test1 = t1;
        this.test2 = t2;
    }

    public double finalScore(){
        return ( this.test1.calculateScore() + this.test2.calculateScore() )/2;
    }
}
