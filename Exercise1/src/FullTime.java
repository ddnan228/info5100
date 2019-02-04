public class FullTime extends Student {
    private int examScore;
    private String typeOfStudent = "FullTime";

    FullTime(String a){
        name = a;
    }

    public void setExamScore(int a){
        examScore = a;
    }

    public double getExamScore(){
        return examScore;
    }

    public String getTypeOfStudent(){
        return typeOfStudent;
    }
}
