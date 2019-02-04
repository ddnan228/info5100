public class Student {
    protected int[] quizzesScores;
    protected String name;

    Student(){}

    Student(String a){
        name = a;
        quizzesScores = new int[15];
    }

    public void putInQuizzesScores(int[] Scores){
        quizzesScores = Scores;
    }

    public double averageOfQuizzesScores(){
        int num = quizzesScores.length;
        double sum = 0.0;
        for(int i = 0; i < num; i++){
            sum += quizzesScores[i];
        }
        return sum/num;
    }

    public String getName(){
        return name;
    }
}
