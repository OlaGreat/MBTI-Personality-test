package mbtiPersonalityTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MbtiQuestions {
    private int countForQ1A;
    private  int countForQ1B;
    private int countForQ2A;
    private  int countForQ2B;
    private int countForQ3A;
    private  int countForQ3B;
    private int countForQ4A;
    private  int countForQ4B;
    private String name;

    private List<String> usersChoice = new ArrayList<>();
    private List<String> usersChoice1 = new ArrayList<>();
    private List<String> usersChoice2 = new ArrayList<>();
    private List<String> usersChoice3 = new ArrayList<>();
    List<Questions> questions = new ArrayList<>();



    public void addQuestions(){
        questions.add(new Questions("A. Expand energy, Enjoy group"," B. Conserve energy, Enjoy one-on-One"));
        questions.add(new Questions("A. more outgoing, think out loud " ," B. more reserved, think to yourself"));
        questions.add(new Questions("A.seek many tasks, public activities, interaction with others " , "B.seek private solitary activities with quiet to concentrate"));
        questions.add(new Questions("A.external, communicative, express yourself "," B. internal, reticent, keep to yourself"));
        questions.add(new Questions("A.facts, things, what is  ideas, dreams ", " B. what could be, philosophical"));


        questions.add(new Questions("A. Interpret literally", "B.  look for meaning and possibilities:"));
        questions.add(new Questions("A.practical, realistic, experiential ", " B. imaginative, innovative, theoretical"));
        questions.add(new Questions("A.standard, usual,conventional "," B. different, novel, unique"));
        questions.add(new Questions("A.tough-minded, just "," B.global perspective, big picture"));
        questions.add(new Questions("A.matter of fact, issue-oriented "," B. sensitive, people-oriented, compassionate"));

        questions.add(new Questions("A. logical, thinking,questioning", "B. empathetic, feeling, accommodating:"));
        questions.add(new Questions("A. candid, straightforward "," B. frank tactful, kind, encouraging "));
        questions.add(new Questions("A.firm, tend to criticize, hold the line ", " B. gentle, tend to appreciate, conciliate"));
        questions.add(new Questions("A.preparation, plan ahead "," B. go with the flow,adapt as you go"));
        questions.add(new Questions("A.control, govern ", " B. latitude, freedom"));

        questions.add(new Questions("A. organized, orderly " ,  " B. flexible, adaptable"));
        questions.add(new Questions("A.plan, schedule", " B.unplanned, spontaneous"));
        questions.add(new Questions("A.regulated, structured easygoing " , " B. live and let live"));
        questions.add(new Questions("A.active, initiate "," B. reflective, deliberate"));
        questions.add(new Questions("A. focus on here and now "," B. look to the future,global perspective, big picture"));
    }

    public void outputQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
         this.name = input.nextLine();
        int count = 1;
        addQuestions();
        for (Questions question : questions){
            System.out.println(question);
            String choice = input.nextLine().toUpperCase();

            while (!Objects.equals(choice, "A")& !Objects.equals(choice, "B")){
                System.out.println("Please enter A or B");
                System.out.println(question);
                choice = input.nextLine();
            }


            if (choice.equalsIgnoreCase("A") & count <= 5 ){
                usersChoice.add(question.getQuestion1());
                countForQ1A++;
                count++;
            }
            if (choice.equalsIgnoreCase("B") & count <= 5){
                usersChoice.add(question.getQuestion2());
                countForQ1B++;
                count++;
            }
            if (choice.equalsIgnoreCase("A") & count > 5 & count <=10){
                usersChoice1.add(question.getQuestion1());
                countForQ2A++;
                count++;
            }
            if (choice.equalsIgnoreCase("B") & count > 5 & count <=10){
                usersChoice1.add(question.getQuestion2());
                countForQ2B++;
                count++;
            }
            if (choice.equalsIgnoreCase("A") & count > 10 & count <=15){
                usersChoice2.add(question.getQuestion1());
                countForQ3A++;
                count++;
            }
            if (choice.equalsIgnoreCase("B") & count > 10 & count <=15){
                usersChoice2.add(question.getQuestion2());
                countForQ3B++;
                count++;
            }
            if (choice.equalsIgnoreCase("A") & count > 15 & count <=20){
                usersChoice3.add(question.getQuestion1());
                countForQ4A++;
                count++;
            }
            if (choice.equalsIgnoreCase("B") & count > 15 & count <=20){
                usersChoice3.add(question.getQuestion2());
                countForQ4B++;
                count++;
            }


        }
    }
    public void outputUsersChoice(){
        System.out.println(name + " Your picks for the 20 questions are as follows");
        for (String choice : usersChoice){
            System.out.println(choice);
        }
        outputGenerated(countForQ1A, countForQ1B, usersChoice1, countForQ2A, countForQ2B);

        for (String choice : usersChoice2){
            System.out.println(choice);
        }
        outputGenerated(countForQ3A, countForQ3B, usersChoice3, countForQ4A, countForQ4B);

        personalityChecker();



    }

    private void outputGenerated(int countForQ1A, int countForQ1B, List<String> usersChoice1, int countForQ2A, int countForQ2B) {
        System.out.println("Numbers of A picked -> " + countForQ1A);
        System.out.println("Numbers of B picked -> " + countForQ1B);

        System.out.println();

        for (String choice : usersChoice1){
            System.out.println(choice);
        }
        System.out.println("Numbers of A picked -> " + countForQ2A);
        System.out.println("Numbers of B picked -> " + countForQ2B);

        System.out.println();


    }

    public void personalityChecker(){
        switch (personalityTypeDeterminate()){
            case "INTJ":
                architect();
                break;
            case "INTP":
                logician();
                break;
            case "ENTJ":
                commander();
                break;
            case "ENTP":
                debater();
            case "INFJ":
                advocate();
            case "INFP":
                mediator();
                break;
            case "ENFJ":
                protagonist();
                break;
            case "ENFP":
                campaigner();
                break;
            case "ISTJ":
                logistician();
                break;
            case "ISFJ":
                defender();
                break;
            case "ESTJ":
                executive();
                break;
            case "ESFJ":
                consul();
                break;
            case "ISTP":
                virtuoso();
                break;
            case "ISFP":
                adventurer();
                break;
            case "ESTP":
                entrepreneur();
            case "ESFP":
                entertainer();
                break;

        }

    }


    private String personalityTypeDeterminate(){
        String personalityType = "";
        if (countForQ1A > countForQ1B){
            personalityType += "E";
        }else
            personalityType += "i";
        if(countForQ2A > countForQ2B){
            personalityType+="S";
        }else personalityType+="N";
        if(countForQ3A > countForQ3B){
            personalityType+="T";
        }else personalityType+="F";
        if(countForQ4A > countForQ4B){
            personalityType+="J";
        }else personalityType+="P";

        return personalityType;
    }
    private void architect(){
        System.out.println("Your personality is Architect");
        System.out.println("\n An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits." +
                " These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. " +
                "Their inner world is often a private, complex one.");
        System.out.println();
    }
    private void logician(){
        System.out.println("Your personality is Logician");
        System.out.println("A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. These flexible" +
                " thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to " +
                "experiment with personal creativity.");
        System.out.println();
    }
    private void commander(){
        System.out.println("Your personality is Commander");
        System.out.println("""
                A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits.
                 They are decisive people who love momentum and accomplishment.\s
                They gather information to construct their creative visions but rarely hesitate for long before acting on them.""");
        System.out.println();
    }
    private void debater(){
        System.out.println("Your personality is Debater");
        System.out.println("""
                A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking,
                 and Prospecting personality traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.\s
                They pursue their goals vigorously despite any resistance they might encounter.""");
        System.out.println();
    }
    private void campaigner(){
        System.out.println("Your personality is Campaigner");
        System.out.println("""
                A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting
                 personality traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.
                 Their vibrant energy can flow in many directions.""");
        System.out.println();
    }
    private void protagonist(){
        System.out.println("Your personality is Protagonist");
        System.out.println("""
                A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality
                 traits. These warm, forthright types love helping others, and they tend to have strong ideas and values.
                 They back their perspective with the creative energy to achieve their goals.""");
        System.out.println();
    }
    private void mediator(){
        System.out.println("Your personality is Mediator");
        System.out.println("""
                A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting\s
                personality traits. These rare personality types tend to be quiet, open-minded, and imaginative,
                 and they apply a caring and creative approach to everything they do.""");
        System.out.println();
    }
    private void advocate(){
        System.out.println("Your personality is Advocate");
        System.out.println("""
                An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits.
                 They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet,\s
                principled version of humanism guide them in all things.""");
        System.out.println();
    }
    private void consul(){
        System.out.println("Your personality is Consul");
        System.out.println("""
                A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits.\s
                They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values,\s
                and they willingly offer guidance to others.""");
        System.out.println();
    }
    private void executive(){
        System.out.println("Your personality is Logician");
        System.out.println("""
                An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits.
                 They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others,\s
                able to offer solid direction amid adversity.""");
        System.out.println();
    }
    private void defender(){
        System.out.println("Your personality is Defender");
        System.out.println("""
                A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits.
                 These people tend to be warm and unassuming in their own steady way.
                 They’re efficient and responsible, giving careful attention to practical details in their daily lives.""");
        System.out.println();
    }
    private void logistician(){
        System.out.println("Your personality is Logistician");
        System.out.println("""
                A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits.
                 These people tend to be reserved yet willful, with a rational outlook on life.\s
                They compose their actions carefully and carry them out with methodical purpose.""");
        System.out.println();
    }
    private void entertainer(){
        System.out.println("Your personality is Entertainer");
        System.out.println("""
                An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits.
                 These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
                 They can be very social, often encouraging others into shared activities.""");
        System.out.println();
    }
    private void entrepreneur(){
        System.out.println("Your personality is Entrepreneur");
        System.out.println("""
                An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits.\s
                They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities,\s
                whether socializing with others or in more personal pursuits.""");
        System.out.println();
    }
    private void adventurer(){
        System.out.println("Your personality is Adventurer");
        System.out.println("""
                An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling,
                 and Prospecting personality traits. They tend to have open minds, approaching life, new experiences,
                 and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.""");
        System.out.println();
    }
    private void virtuoso(){
        System.out.println("Your personality is Virtuoso");
        System.out.println("""
                A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits.\s
                They tend to have an individualistic mindset, pursuing goals without needing much external connection.
                 They engage in life with inquisitiveness and personal skill, varying their approach as needed.""");
    }

    public void main(){
        outputQuestion();
        outputUsersChoice();
    }


}
