import java.util.ArrayList;
import java.util.HashMap;

public class Session {
    private ArrayList<Student> students;
    private ArrayList<FullTime> fullTimeStudents;
    private ArrayList<PartTime> partTimeStudents;

    Session(){
        students = new ArrayList<>();
        fullTimeStudents = new ArrayList<>();
        partTimeStudents = new ArrayList<>();
    }

    public void addFullTimeStudents(FullTime f){
        students.add(f);
        fullTimeStudents.add(f);
    }

    public void addPartTimeStudents(PartTime p){
        students.add(p);
        partTimeStudents.add(p);
    }

    public int sessionSize(){
        return students.size();
    }

    public double averageOfQuizScoreInWhole(){
        int numOfStudents = students.size();
        double sum = 0.0;
        for(int i = 0; i < numOfStudents; i++){
            sum += students.get(i).averageOfQuizzesScores();
        }
        return sum/numOfStudents;
    }

    public void printQuizzesScore(){
        System.out.println("The list of average quizzes score in ascending order:");
        HashMap<String,Double> quizzesScoreOfStudents = new HashMap<String,Double>();
        int numOfStudents = students.size();
        for(int i = 0; i < numOfStudents; i++){
            String currStudentName = students.get(i).getName();
            double currAverage = students.get(i).averageOfQuizzesScores();
            quizzesScoreOfStudents.put(currStudentName, currAverage);
        }
        while(quizzesScoreOfStudents.size() != 0){
            String studentWithLowestScore = "";
            for(String name: quizzesScoreOfStudents.keySet()){
                if(studentWithLowestScore.equals("")){
                    studentWithLowestScore = name;
                }
                if(quizzesScoreOfStudents.get(studentWithLowestScore) > quizzesScoreOfStudents.get(name)){
                    studentWithLowestScore = name;
                }
            }
            double score = quizzesScoreOfStudents.get(studentWithLowestScore);
            String result = String.format("%.2f", score);
            System.out.println(studentWithLowestScore + "\t" + result);
            quizzesScoreOfStudents.remove(studentWithLowestScore);
        }
    }

    public void printPartTimeStudents(){
        System.out.println("The Part-Time Students are as following:");
        int numOfStudents = partTimeStudents.size();
        for(int i = 0; i <numOfStudents; i++){
            System.out.println(partTimeStudents.get(i).getName());
        }
    }

    public void printFullTimeStudentsExamScore(){
        System.out.println("The Full-Time Students Exam Scores are as following:");
        int numOfStudents = fullTimeStudents.size();
        for(int i = 0; i <numOfStudents; i++){
            System.out.println(fullTimeStudents.get(i).getName() + "\t" + fullTimeStudents.get(i).getExamScore());
        }
    }
}
