package week12;


import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Date;

public class ReadRssPeriodically {

    public void readRssAndWriteToFile(Date date) {
        try {
            String url = "http://feeds.bbci.co.uk/news/world/rss.xml"; // define the URL
            XmlReader xmlReader = new XmlReader(new URL(url)); // create a URL and bind it to XmlReader to fetch XML content from the URL
            SyndFeed syndFeed = new SyndFeedInput().build(xmlReader); // parse the XML and convert it to splitted form

            StringBuilder sb = new StringBuilder(); // create a StringBuilder to put RSS data in it
            for (SyndEntry syndEntry : syndFeed.getEntries()) { // is used to iterate all nodes of XML
                sb.append(syndEntry.getTitle()); // get title from XML node
                sb.append("\n");
                sb.append(syndEntry.getLink()); // get link from XML node
                sb.append("\n");
                sb.append(syndEntry.getDescription().getValue()); // get description from XML node
                sb.append("\n");
                sb.append("\n");
            }

            File file = new File("/Users/gokhanpolat/Developer/tallinn/rssToFile.txt"); // create a file
            FileWriter fileWriter = new FileWriter(file); // bind file to FileWriter
            PrintWriter printWriter = new PrintWriter(fileWriter); // bind FileWriter to PrintWriter

            printWriter.println(date); // put Date to file
            printWriter.println(); // put an enter
            printWriter.println(); // put an enter
            printWriter.println(sb); // put RSS information to file

            printWriter.close(); // save and close the file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ReadRssPeriodically readRssPeriodically = new ReadRssPeriodically(); // create instance of class

        while (true) { // create an infinite loop
            Date date = new Date(); // get current Date and Time
            readRssPeriodically.readRssAndWriteToFile(date); // call method
            Thread.sleep(30000); // make program waiting for 30 seconds until next call
        }
    }
}
