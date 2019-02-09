package week12;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInputToFileWriter {

    public void takeInputAndWriteToFile() {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("/Users/gokhanpolat/Developer/tallinn/inputToFile.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String input = "";
            while (!input.equals("EoF")) {
                System.out.print("Your input(nl for new line, EoF for termination) : ");
                input = scanner.nextLine();
                if (input.equals("nl")){
                    printWriter.println();
                    continue;
                }
                printWriter.print(input);
            }

            printWriter.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserInputToFileWriter userInputToFileWriter = new UserInputToFileWriter();

        userInputToFileWriter.takeInputAndWriteToFile();
    }
}
