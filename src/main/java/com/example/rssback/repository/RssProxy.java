package com.example.rssback.repository;

import com.example.rssback.model.Item;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import lombok.extern.slf4j.Slf4j;
import org.jdom2.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class RssProxy {
    private static  String XML_FILE_NAME = "https://www.lemonde.fr/rss/en_continu.xml";
    /**
     * Returns the feed for the given URL.
     *
     * @return
     * @throws IOException
     * @throws FeedException
     */
    public static List<Item> getFeeds() {
        try {
            URL feedSource = new URL(XML_FILE_NAME);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));
            List<Item> list =  new ArrayList<>();
            feed.getEntries();
            for (SyndEntry entry : feed.getEntries()) {
             String   img="";
                List<Element> foreignMarkups = entry.getForeignMarkup();
                for (Element foreignMarkup : foreignMarkups) {
                    img = foreignMarkup.getAttribute("url").getValue();
                }                Item item = new Item(
                        entry.getTitle(),
                        entry.getLink(),
                        entry.getDescription().getValue(),
                        img,
                        entry.getPublishedDate()
                       );
                System.out.println(item.getTitle());

                list.add(item);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
