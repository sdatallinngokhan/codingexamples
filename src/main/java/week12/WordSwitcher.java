package week12;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WordSwitcher {

    public List<String> getFileContent() {
        List<String> lines = new LinkedList<>();
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn/wordSwitcherRead.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines;
    }

    public List<String> switchWords(List<String> lines) {
        List<String> switchedWords = new LinkedList<>();

        for (String line : lines) {
            String switchedLine = "";
            String[] lineArray = line.split(" ");
            if (lineArray.length % 2 == 1) {
                switchedLine = lineArray[lineArray.length - 1] + " ";
                for (int i = 0; i < lineArray.length - 1; i = i + 2) {
                    switchedLine += lineArray[i + 1] + " " + lineArray[i] + " ";
                }
            } else {
                for (int i = 0; i < lineArray.length - 1; i = i + 2) {
                    switchedLine += lineArray[i + 1] + " " + lineArray[i] + " ";
                }
            }

            switchedWords.add(switchedLine);
        }

        return switchedWords;
    }

    private void printResultToFile(List<String> result) {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn/wordSwitcherWrite.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (String line : result) {
                printWriter.println(line);
            }

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordSwitcher wordSwitcher = new WordSwitcher();

        List<String> fileContent = wordSwitcher.getFileContent();
        List<String> result = wordSwitcher.switchWords(fileContent);
        wordSwitcher.printResultToFile(result);
    }


}
