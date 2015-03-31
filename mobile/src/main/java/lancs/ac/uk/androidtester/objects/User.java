package lancs.ac.uk.androidtester.objects;

public class User {

    private static User instance = new User();
    private boolean loggedIn = true;

    //make the constructor private so that this class cannot be
    //instantiated
    private User(){
    }

    //Get the only object available
    public static User getInstance(){
        return instance;
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }
}
