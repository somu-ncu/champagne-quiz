package src;

import java.util.Scanner;

class userDetails {
    /*
     * userDetails class is solely dependent on user info processing. This
     * class consist of a construtor that takes in the user input and a method
     * that processes wether the user is eligible to take the quiz or not. The
     * class variables are name which stores the user's name, age which stores 
     * user's age and a boolean verified which is predefault set to false and
     * changes as the verifyUser method proceeds. 
     */

    String name;
    int age;
    boolean verified = false;

    userDetails(){
        
        Scanner sc = new Scanner(System.in);    // Scanner object to take in user input
        
        System.out.print("\nEnter your name : ");
        this.name = sc.next();
        System.out.print("Hi " + this.name + "!! Please enter your age : ");
        this.age = sc.nextInt();
    }

    public boolean verifyUser(){
        
        if (this.age >= 18){
            this.verified = true;   // If user is 18 years or older, he/she is verified
        }
        else{
            this.verified=false;
        }
        return this.verified;
    }
}


class questions {
    /*
     * questions class is devoted to operations involving questions and answers of the
     * quiz. All the correct answers are stored in a provate array ans user inputs are 
     * stored in another array.
     */

    Scanner quizConsole = new Scanner(System.in);
    private int[] correctAnswers = {1,1,3,4,5,6,7,8,9,10};
    int userChoice = 0;
    int score = 0;
    int[] userAnswers = new int[10];

    public void q1(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q2(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q3(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q4(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q5(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q6(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q7(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q8(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q9(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }

    public void q10(){
        System.out.println("\nQ1: India is what?");
        System.out.print("1. Country\n2.State\n3.UT\n4.City\nYour answer : ");
        userChoice = quizConsole.nextInt();
        
        if (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 1){
            System.out.println("Invalid input");
        }
        
        userAnswers[0] = userChoice;
        if (userChoice == correctAnswers[0]){
            score++;
        }
    }
    
    public void printScores(){
        System.out.println("QUESTION -> CORRECT ANSWER -> YOUR ANSWER ");
        int quesNo = 1;
        for (int i = 0; i < 10; i++){
            System.out.println("Q" + quesNo + " -> " + correctAnswers[i] + " -> " + userAnswers[i]);
            quesNo++;
        }
    }
}


class quizFrame {
    /*
     * quizFrame class works on the flow of running th script
     */

    public void runChampagne(){
        questions champagneQuestion = new questions();

        champagneQuestion.q1();
        champagneQuestion.q2();
        champagneQuestion.q3();
        champagneQuestion.q4();
        champagneQuestion.q5();
        champagneQuestion.q6();
        champagneQuestion.q7();
        champagneQuestion.q8();
        champagneQuestion.q9();
        champagneQuestion.q10();

        System.out.println("\n=====END OF QUIZ====");
        System.out.println("\nYour score = " + champagneQuestion.score);
        System.out.println("\nDETAILED SCORE CARD:\n");
        champagneQuestion.printScores();
    }
}