package TH1;

public class Main {

    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExam emailExam = new EmailExam();
        for (String email : validEmail) {
            boolean isValid = emailExam.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExam.validate(email);
            System.out.println("Email is " + email + " is invalid");
        }
    }
}
