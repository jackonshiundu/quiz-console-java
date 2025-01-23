import java.util.Scanner;

public class QuestionService {
    Question[] questions=new Question[6];
    String selection[]=new String[6];
    public QuestionService(){
        questions[0]=new Question(1,"What language was created by James Gosling in 1995?","Java","JavaScript","Python","C++","Java");
        questions[1]=new Question(2,"Which planet is known as the Red Planet?","Earth","Mars","Jupiter","Venus","Mars");
        questions[2]=new Question(3,"What is the largest mammal in the world?","Elephant","Blue Whale","Giraffe","Shark","Blue Whale");
        questions[3]=new Question(4,"Who wrote the play 'Romeo and Juliet'?","Shakespeare","Dickens","Austen","Hemingway","Shakespeare");
        questions[4]=new Question(5,"Which country is known as the Land of the Rising Sun?","South Korea","China","Japan","Thailand","Japan");
        questions[5]=new Question(6,"What is the capital of France?","Berlin","Madrid","Rome","Paris","Paris");

    }
    public void startQuiz(){
        int i=0;
        for(Question q: questions){
            System.out.println("Question No. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine();
            i++;

            for(String s:selection){
                System.out.println(s);
            }
        }
    }
    public void getScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String actualAswer=que.getAnswer();
            String userAnswer=selection[i];
            if(actualAswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Youe DFinal Score is "+score);
    }
}
