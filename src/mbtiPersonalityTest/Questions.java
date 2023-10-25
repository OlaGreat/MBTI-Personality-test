package mbtiPersonalityTest;

public class Questions {
    private String question1;
    private String question2;
    int count = 1;

    public Questions(String question1, String question2) {
        this.question1 = question1;
        this.question2 = question2;


    }

    public String getQuestion1(){
        return question1;
    }
    public String getQuestion2(){
        return question2;
    }

    @Override
    public String toString(){
        count++;

       return String.format("%s=[%s,    %s]%n","Question ->",question1,question2);
    }

}
