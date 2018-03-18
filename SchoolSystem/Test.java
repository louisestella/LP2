public class Test{
    private double score1, score2;

    public Test(double score1, double score2){
        this.score1 = score1;
        this.score2 = score2;
    }

    public double calculateScore(){
        if ( this.score1 + this.score2 > 10.00 ){
            return 10.00;
        } else
            return this.score1 + this.score2;
    }
}
