package SDA.javagda.basic.day3.Extras;

public class MainEmail {
    public static void main(String[] args) {

        Email email = new Email.Builder()
                .reciever("sda")
                .title("new course")
                .bodyMsg("Hello")
                .attachment("lesson.pdf")
                .build();

        System.out.println(email.toString());

        email = new Email.Builder()
                .reciever("sda")
                .bodyMsg("Witom")
                .build();
        System.out.println(email);
    }
}
