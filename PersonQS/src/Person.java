public class Person implements Comparable<Person> {
    private String firstN;
    private String lastN;
    private int age;

    public Person(String lastN, String firstN, int age) {
        this.lastN = lastN;
        this.firstN = firstN;
        this.age = age;
    }

    public String getFirstName() {
        return firstN;
    }

    public String getLastName() {
        return lastN;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + lastN + ", " + firstN + ", Age: " + age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public static int compareByLastName(Person p1, Person p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }

    public static int compareByAge(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
