package SDA.javagda.basic.day3.Extras;

public class Email {
    private final String reciever;
    private final String title;
    private final String bodyMsg;
    private final String attachment;

    public Email(Builder b){
        this.reciever = b.reciever;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }


    @Override
    public String toString() {
        return "Email{" +
                "reciever='" + reciever + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public static class Builder{
        private String reciever;
        private String title;
        private String bodyMsg;
        private String attachment;

        public Builder reciever(String reciever){
            this.reciever = reciever;
            return this;
        }
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder bodyMsg(String bodyMsg){
            this.bodyMsg = bodyMsg;
            return this;
        }
        public Builder attachment(String attachment){
            this.attachment = attachment;
            return this;
        }

        public Email build(){
            return new Email(this);
        }
    }
}
