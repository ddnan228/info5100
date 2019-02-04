import java.util.Random;

public class Tester {
    public static void main(String[] args){
        Session s = new Session();

        //put 10 full time students in s, with random name, 15 quizzes scores and 1 exam score.
        for(int i = 0; i < 10; i++){
            Random r = new Random();
            int[] quzzScores = new int[15];
            for(int j = 0; j < 15; j++){
                quzzScores[j] = r.nextInt(41) + 60;
            }
            int examScore = r.nextInt(41) + 60;
            int nameR = r.nextInt(500) + 100;
            String name = "F" + nameR;
            FullTime f = new FullTime(name);
            f.putInQuizzesScores(quzzScores);
            f.setExamScore(examScore);
            s.addFullTimeStudents(f);
        }
        //put 10 part time students in s, with random name and 15 quizzes scores.
        for(int i = 0; i < 10; i++){
            Random r = new Random();
            int[] quzzScores = new int[15];
            for(int j = 0; j < 15; j++){
                quzzScores[j] = r.nextInt(41) + 60;
            }
            int nameR = r.nextInt(500) + 100;
            String name = "P" + nameR;
            PartTime p = new PartTime(name);
            p.putInQuizzesScores(quzzScores);
            s.addPartTimeStudents(p);
        }

        //print average quizzes scores for the whole class
        double average = s.averageOfQuizScoreInWhole();
        String result = String.format("%.2f", average);
        System.out.println("The average quiz scores in the whole class is " + result);

        //print the list of quiz scores in ascending order
        s.printQuizzesScore();

        //print names of part-time students
        s.printPartTimeStudents();

        //print exam scores of full-time students
        s.printFullTimeStudentsExamScore();

    }
}
