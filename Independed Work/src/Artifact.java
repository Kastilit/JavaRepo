public class Artifact {

    int number;
    String cult;
    int age;

    public Artifact (int number){
        this.number = number;
    }
     public Artifact(int number, String cult){
        this.number = number;
        this.cult = cult;
     }

     public Artifact(int number, String cult, int age){
        this.number = number;
        this.cult = cult;
        this.age = age;
     }


    public static void main(String[] args) {
      Artifact vaza = new Artifact(12234, "HEWQJGRFEQW", 123);
      System.out.println(vaza.number);
      System.out.println(vaza.cult);
      System.out.println(vaza.age);


    }
}
