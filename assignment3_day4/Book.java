package assignment3_day4;

public class Book {
    private String title;
    private String subTitle;
    private static int bookCount;
    public Book(String title){
        this.title = title;
        bookCount += 1;
    }
    public Book(String title, String subTitle){
        this.title = title;
        this.subTitle = subTitle;
        bookCount += 1;
    }
    public void setBookDetails(String title, String subTitle){
        this.title = title;
        this.subTitle = subTitle;
    }
    public String getBookDetails(){
        return "Title: " + this.title + "Subtitle: " +this.subTitle;
    }
    public static int getCount(){
        return bookCount;
    }

    public void display(){
        System.out.println("Title: " + this.title);
        if (this.subTitle != null ){
            System.out.println("Subtitle: " + this.subTitle );
        }
    }
}
