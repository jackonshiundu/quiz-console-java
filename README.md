Documentation for this game console.
In this quiz game, we have a collection of questions, each with multiple possible answers, as well as the correct answer. We store these questions in an array of objects. Each object contains the question, a list of answer options, and the correct answer.

To run the game, we loop through each question, presenting the options to the user. The user's response for each question is stored. After the user answers all questions, we loop through the answers and compare them with the correct answers to calculate the score. Finally, the total score is displayed at the end of the game.

How to Run This Project
Follow the steps below to clone, set up, and run the quiz console game run this commands in your CMD:

1. Clone the Project
   Clone this repository to your local machine by running the following command in your terminal:

   git clone https://github.com/jackonshiundu/quiz-console-java.git

2. Open the Project
   Navigate to the cloned project directory and open it in your preferred code editor:

   cd quiz-console-java
   code .
   (Note: Replace code . with your editor's command if you're using a different one, e.g., subl . for Sublime Text or atom . for Atom.)

3. Compile the Java Files
   To compile the Java source code, run the following command in your terminal:

   javac Main.java

4. Run the Application
   Execute the program using the following command:

   java Main

5. Play the Quiz
   The program will display a series of questions with multiple choice options.
   Type your answer and hit Enter after each question.
   After you've answered all the questions, your final score will be displayed.

Lets Talk About each And everyfile and what it Does.

# Question.Java

In this file We have the Question class representing a single question in a quiz game. It stores the question, its multiple choice options, and the correct answer. This class provides methods for accessing and modifying the question's properties, including the question text, options, and the correct answer. The Question class can be used to build a collection of quiz questions for a game or test application.

Class Members
id: A unique identifier for each question (Integer).
question: The text of the quiz question (String).
opt1: The first multiple choice option (String).
opt2: The second multiple choice option (String).
opt3: The third multiple choice option (String).
opt4: The fourth multiple choice option (String).
answer: The correct answer for the question (String).
Constructors
Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer)
Constructor to initialize a Question object with the provided values:

id: The unique identifier for the question.
question: The text of the question.
opt1, opt2, opt3, opt4: The answer choices for the question.
answer: The correct answer.
Methods
getId()
Returns the ID of the question.

setId(int id)
Sets the ID of the question.

getQuestion()
Returns the text of the question.

setQuestion(String question)
Sets the text of the question.

getOpt1()
Returns the first answer option.

setOpt1(String opt1)
Sets the first answer option.

getOpt2()
Returns the second answer option.

setOpt2(String opt2)
Sets the second answer option.

getOpt3()
Returns the third answer option.

setOpt3(String opt3)
Sets the third answer option.

getOpt4()
Returns the fourth answer option.

setOpt4(String opt4)
Sets the fourth answer option.

getAnswer()
Returns the correct answer for the question.

setAnswer(String answer)
Sets the correct answer for the question.

toString()
Returns a string representation of the Question object, displaying its ID, question text, options, and correct answer.

# QuestionService.java

in this file we have the QuestionService class is responsible for managing the quiz game. It contains a collection of Question objects, presents the questions to the user, records their answers, and calculates the final score based on the correct answers.

The class consists of:

A method to start the quiz and collect user responses.
A method to calculate and display the final score based on the user's answers.
Class Members
questions: An array of Question objects (size 6), which holds the quiz questions along with their answer options and correct answers.
selection: An array of strings (size 6) to store the user's selected answers for each question.
Constructors
QuestionService()
The constructor initializes the questions array with six predefined Question objects, each containing a question, four answer options, and the correct answer.

Methods
startQuiz()
This method begins the quiz:

It loops through each question in the questions array.
For each question, it displays the question and its options to the user.
It prompts the user to input their answer, which is stored in the selection array.
After all questions are answered, the method ends, and the user's answers are stored for scoring.
getScore()
This method calculates the score:

It compares each user-selected answer with the correct answer from the questions array.
If the user's answer matches the correct answer, the score is incremented by 1.
Finally, it displays the total score at the end of the quiz.
Example Usage

public class Main {
public static void main(String[] args) {
// Create a new instance of QuestionService
QuestionService quizService = new QuestionService();

        // Start the quiz and collect answers
        quizService.startQuiz();

        // Calculate and display the final score
        quizService.getScore();
    }

}
Expected Output (Example)
The output for each question will look like this:

Question No. 1
What language was created by James Gosling in 1995?

1. Java
2. JavaScript
3. Python
4. C++
   After the user enters their answer, the next question will appear. Once all questions have been answered, the final score will be printed:

Your Final Score is 4
Dependencies
Question class should be implemented as described in the Question.java File.

# Main.java

The Main class is the entry point for the quiz game application. It creates an instance of QuestionService and starts the quiz by calling the startQuiz() method. After all the questions are answered, it calls the getScore() method to calculate and display the user's final score.

Main Class

public class Main {
public static void main(String[] args) {
// Create an instance of the QuestionService to handle quiz functionality
QuestionService service = new QuestionService();

        // Start the quiz, display questions and collect answers
        service.startQuiz();

        // After all questions have been answered, calculate and display the score
        service.getScore();
    }

}
Explanation of Code:
Creating the QuestionService instance:

The QuestionService class is instantiated as service. This object will handle all quiz operations, including managing questions and tracking user answers.
Starting the Quiz:

The startQuiz() method is called on the service object. This method will loop through all the quiz questions, present them to the user, and collect their answers.
Getting the Score:

After the user has answered all questions, the getScore() method is called on the service object. This method compares the user's answers to the correct ones, calculates the score, and prints the result.

So the finaly Output shoul be:
Your Final Score is 4(Depending on how you answered the questions).

Feel Free to modify this To soot your Needs. Happy Coding🏹♐.
