package module2.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Books implements Print {
    private String title;
    private String author;
    private String text;

    public String getText() {
        return text;
    }

    public Books(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }


    @Override
    public void printToPDF() {
        File file = new File("file.pdf");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(getText());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void printToWord() {
        File file = new File("file.doc");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(getText());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Books book = new Books("Java", "Ekkel", "there is much text");
        book.printToPDF();
        book.printToWord();
    }

}
