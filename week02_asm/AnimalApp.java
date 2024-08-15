package week02_asm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class AnimalApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        Animal[] animalArray = new Animal[100];

        String flag;

        do {
            System.out.print("Enter animal name: ");
            String name = br.readLine();
            System.out.print("Enter animal age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter animal species: ");
            String species = br.readLine();

            Animal anm = new Animal();
            anm.name = name;
            anm.age = age;
            anm.species = species;

            animalArray[Animal.animalCount] = anm;
            Animal.animalCount++;

            System.out.print("Do you want to enter another animal? (yes / no): ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));

        System.out.println();
        System.out.println("Total number of animals: "+ Animal.animalCount);
        System.out.println();

        for (int i=0; i<Animal.animalCount; i++){
            System.out.println("Animal " + (i+1) + ":");
            animalArray[i].inputData();
        }

    }
}
