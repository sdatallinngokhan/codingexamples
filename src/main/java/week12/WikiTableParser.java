package week12;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WikiTableParser {

    public void parseTable() {
        try {
            String url = "https://en.wikipedia.org/wiki/List_of_songs_recorded_by_Adele";
            Document document = Jsoup.connect(url).get();

            Elements elements = document.select("table.wikitable.sortable > tbody > tr > td");

            for (Element element : elements){
                System.out.println(element.text());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WikiTableParser wikiTableParser = new WikiTableParser();

        wikiTableParser.parseTable();
    }
}
