package com.iecanfly.kbo.player;

import com.iecanfly.kbo.model.player.Player;
import org.jsoup.nodes.Element;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/2/13
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("playerInfoItemProcessor")
public class PlayerInfoItemProcessor implements ItemProcessor<Element, Player> {

    public Player process(Element element) throws Exception {
        Player player = new Player();
        player.setName(element.text());
        return player;
    }
}
