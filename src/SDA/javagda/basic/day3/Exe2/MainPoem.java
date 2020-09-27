package SDA.javagda.basic.day3.Exe2;

public class MainPoem {

    public static void main(String[] args) {


        Poem[] poems = new Poem[3];
        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Chotomska", "PL");
        Author author3 = new Author("Keats", "GB");

        poems[0] = new Poem(author1,24);
        poems[1] = new Poem(author2,32);
        poems[2] = new Poem(author3,16);



        String authorAsString = getSurnameWithMaxStropheNumber(poems);
        System.out.println(authorAsString);
    }

    private static String getSurnameWithMaxStropheNumber(Poem[] poems){
        int maxStrophe = Integer.MIN_VALUE;
//        String maxName = null;
//        String maxNationality = null;
        Author maxAuthor = null;
        for(Poem poem : poems) {
            poem.print();
            int currentSropheNumbers = poem.getStropheNumbers();    // tak dobrze przypisywac jak sie czesto odwolujemy
            if(maxStrophe < poem.getStropheNumbers()) {
                maxStrophe = poem.getStropheNumbers();
//                maxName = poem.getCreator().getSurname();
//                maxNationality = poem.getCreator().getNationality();
                maxAuthor = poem.getCreator();
            }
        }
//        return maxName + maxNationality;
        return maxAuthor.getSurname();
    }
}
