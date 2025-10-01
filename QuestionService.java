import java.util.Scanner;
public class QuestionService {

	    Question[] questions = new Question[5];
	    String[] selection = new String[5];

	    public QuestionService() {
	        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
	        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
	        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
	        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
	        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");


	    }
	    public void playQuiz() {
	    	
	    	    int i = 0;
	    	    Scanner sc = new Scanner(System.in);

	    	    for (Question q : questions) {
	    	        System.out.println("--------------------------------------------------");
	    	        System.out.println("Question no. : " + q.getId());
	    	        System.out.println(q.getQuestion());
	    	        System.out.println("1. " + q.getOpt1());
	    	        System.out.println("2. " + q.getOpt2());
	    	        System.out.println("3. " + q.getOpt3());
	    	        System.out.println("4. " + q.getOpt4());

	    	        //  Show marks information
	    	        System.out.println("[Correct Answer = +4 marks | Wrong Answer = -1 mark]");
	    	        System.out.print("Your Answer: ");

	    	        selection[i] = sc.nextLine();
	    	        i++;
	    	    }

	        for (String s : selection) {
	            System.out.println(s);
	        }

	    }

	    public void printScore() {
	    	    int score = 0;
	    	    int totalMarks = questions.length * 4; // Each question is +4 marks

	    	    for (int i = 0; i < questions.length; i++) {
	    	        Question que = questions[i];
	    	        String answer = que.getAnswer();
	    	        String userAnswer = selection[i];

	    	        if (answer.equals(userAnswer)) {
	    	            score += 4;  // Correct → +4
	    	        } else {
	    	            score -= 1;  // Wrong → -1
	    	            System.out.println("You got Question " + que.getId() + " wrong.");
	    	            System.out.println("   Correct Answer: " + answer);
	    	            System.out.println();
	    	        }
	    	    }

	    	    // Print final score out of total marks
	    	    System.out.println(" Your final score is: " + score + " out of " + totalMarks);
	    	}
		
		}
	