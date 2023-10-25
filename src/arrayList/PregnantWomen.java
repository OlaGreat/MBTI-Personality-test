package arrayList;

public class PregnantWomen {
    private String name;
    private int age;
    private String monthIn;

    public PregnantWomen(String name, int age, String monthIn) {
        this.name = name;
        this.age = age;
        this.monthIn = monthIn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nPregnantWomen{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age= ").append(age);
        sb.append(", monthIn= ").append(monthIn);
        sb.append("}\n");
        return sb.toString();
    }
//    public String toString(){
//        return String.format("%s",
//                """
//                [name -> ,name
//                """);
//    }
}
