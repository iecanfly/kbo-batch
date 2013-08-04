package com.iecanfly.kbo.player;

import com.iecanfly.kbo.constants.KBOUrl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import java.util.Iterator;


@Component("playerInfoItemReader")
public class PlayerInfoItemReader implements ItemReader<Element> {
    private static final String PLAYER_LIST_SELECTOR = ".playerList>li>a";

    private Iterator<Element> playersIterator;

    public Element read() throws Exception {
        if(playersIterator == null) {
            Document doc = Jsoup.connect(KBOUrl.PLAYER_SEARCH_PITCHER.getUrl()).get();
            Elements elements = doc.select(PLAYER_LIST_SELECTOR);
            playersIterator = elements.iterator();
        }

        if (playersIterator.hasNext()) {
            return playersIterator.next();
        }

        return null;
	}

}
