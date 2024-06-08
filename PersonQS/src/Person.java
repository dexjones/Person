public class Person {
    private String firstN;
    private String lastN;
    private int age;

    public Person(String lastN, String firstN, int age) {
        this.lastN = lastN;
        this.firstN = firstN;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + lastN + ", " + firstN + ", Age: " + age;
    }
}
