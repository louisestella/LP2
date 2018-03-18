public class SchoolSystem{
    public static void main(String[] args){
    
       Test testA1 = new Test(4.0, 2.5);
       Test testA2 = new Test(1.0, 7.0);
       Student studentA = new Student(testA1, testA2);

       Test testB1 = new Test(6.5, 3.5);
       Test testB2 = new Test(0.0, 3.0);
       Student studentB = new Student(testB1, testB2);

       Test testC1 = new Test(5.0, 4.0);
       Test testC2 = new Test(6.0, 1.5);
       Student studentC = new Student(testC1, testC2); 

       Class class305 = new Class(studentA, studentB, studentC);

       System.out.println(class305.classScore() );
    }    
}
