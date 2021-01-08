package module2.task3;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class PrintToFile {
   abstract  void printToPDF();

    public static void printToWord(Book book) {
        File file = new File("file2.doc");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(book.getText());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
