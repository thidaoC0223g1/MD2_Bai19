package emailcheck;

public class EmailExampleTest {
    private static EmaiExample emaiExample;
    private static final String[] validEmail = {"a@gmail.com", "b@yahoo.com", "abc@hotmail.com"};
    private static final String[] invalidEmail = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emaiExample = new EmaiExample();
        for (var email : validEmail) {
            boolean isValid = emaiExample.validate(email);
            System.out.println("email is " + email + " is valid " + isValid);
        }
        for (var email : invalidEmail) {
            boolean isValid = emaiExample.validate(email);
            System.out.println("email is " + email + " is valid " + isValid);
        }
    }
}


