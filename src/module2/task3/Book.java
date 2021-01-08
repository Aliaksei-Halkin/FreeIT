package module2.task3;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Book extends PrintToFile {

    private String title;
    private String author;
    private String text;

    public String getText() {
        return text;
    }

    public Book(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }


    @Override
    public void printToPDF() {
        File file = new File("file2.pdf");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(getText());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        Book book = new  Book("Java", "Ekkel", "I like this book");
        book.printToPDF();
        printToWord(book);
    }

}

