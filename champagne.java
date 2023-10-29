package src;

public class champagne {
    // Main champagne quiz run
    
    public static void main(String[] args) {
        content serve = new content();
        
        serve.welcomeChampagne();

        userDetails champagneUser = new userDetails();
        quizFrame champagneFrame = new quizFrame();

        if (champagneUser.verifyUser()){
            serve.bestWishesChampagne();
            champagneFrame.runChampagne();
        }
        else{
            System.out.println("Please be atleast 18 years old to play the quiz");
        }
    }
}