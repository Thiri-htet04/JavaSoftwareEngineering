package assignment3_day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Library {
    static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    static Book[] bookArr = new Book[100];
    static Book book;

    public static Book bookInfo() throws IOException {
        System.out.print("Enter details for a new book: Title: ");
        String title = br.readLine();
        System.out.print("Subtitle (or press Enter to skip) : ");
        String subTitle = br.readLine();
        if(subTitle.isEmpty()){
            book = new Book(title);
        }else{
            book = new Book(title, subTitle);
        }
        return book;
    }
    public static void display(){
        System.out.println("Library Inventory: ");
        for (int i=0; i<Book.getCount(); i++){
            bookArr[i].display();
            System.out.println();
        }
        System.out.println("\nTotal number of books created: " + Book.getCount());
    }

    public static void main(String[] args) throws IOException {
        String flag;

        do{
            bookArr[Book.getCount()] = bookInfo();
            System.out.print("Do you want to enter another book? (yes/no): ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
        display();
    }
}
