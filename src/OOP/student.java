public static class student {
    // Attribute
     public int id, age, nos;
     public String name;


     // Default constructor
//    public student(){
//        System.out.println(" Student Default Constructor");
//    }
    // parameterised constructor
     public student(int id, int age, String name, int nos){
         this.id = id;
         this.age = age;
         this.name = name;
         this.nos = nos;
     }



    // Methods / Behaviors
     public void study(){
         System.out.println(name + " Studying");
     }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }

    }
static void main() {
    student A = new student(5,35,"Roushan",5);
    System.out.println(A.name);
    System.out.println(A.age);
    System.out.println(A.id);
    System.out.println(A.nos);

    A.study();
    A.sleep();
    A.bunk();
}
