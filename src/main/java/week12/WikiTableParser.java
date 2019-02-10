package week12;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WikiTableParser {

    public void parseTable() {
        try {
            String url = "https://en.wikipedia.org/wiki/List_of_songs_recorded_by_Bruno_Mars";
            Document document = Jsoup.connect(url).get();

            Elements elements = document.select("table.wikitable.sortable > tbody > tr");

            StringBuilder sb = new StringBuilder();
            for (Element element : elements) {
                Elements column = element.select("td");
                if (!column.isEmpty()){
                    System.out.println(element.select("td").get(2).text());
                }
                sb.append(element.attr("title"));
                sb.append("\n");
            }

            File file = new File("/Users/gokhanpolat/Developer/tallinn/wikiToFile.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(sb);

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WikiTableParser wikiTableParser = new WikiTableParser();

        wikiTableParser.parseTable();
    }
}
