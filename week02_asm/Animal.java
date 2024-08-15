package week02_asm;

public class Animal {
    public String name;
    public int age;
    public String species;
    public static int animalCount=0;
    public void inputData(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species + "\n");
    }
}
