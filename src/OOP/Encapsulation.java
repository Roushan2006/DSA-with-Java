public static class Encapsulation {

    // Private fields (data hiding - core of encapsulation)
    private int id, age, nos;
    private String name;
    private String gf;

    // Parameterized constructor
    public Encapsulation(int id, int age, String name, int nos, String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // Getter methods (controlled read access)
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getNos() {
        return nos;
    }

    public String getName() {
        return name;
    }

    public String getGf() {
        return gf;
    }

    // Setter methods (controlled write access, can add validation)
    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    // Public behaviors
    public void study() {
        System.out.println(name + " is studying");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void bunk() {
        System.out.println(name + " is bunking");
    }

    private void gfChatting() {
        System.out.println(name + " is gfChatting");
    }
}

    // Main method must be inside a public class and static
    public static void main(String[] args) {
        Encapsulation a = new Encapsulation(5, 35, "Roushan", 5, "Aparna");

        // Access via getters (encapsulation barrier)
        System.out.println("Name: " + a.getName());
        System.out.println("Age:  " + a.getAge());
        System.out.println("ID:   " + a.getId());
        System.out.println("NOS:  " + a.getNos());
        System.out.println("GF:   " + a.getGf());

        a.study();
        a.sleep();
        a.bunk();
        a.gfChatting();

    }

