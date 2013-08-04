package com.iecanfly.kbo.player;

import com.iecanfly.kbo.dao.hibernate.PlayerDao;
import com.iecanfly.kbo.dao.hibernate.PlayerDaoHibernate;
import com.iecanfly.kbo.model.Player;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.nodes.Element;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("playerInfoItemWriter")
public class PlayerInfoItemWriter implements ItemWriter<Player> {
    private static final Log log = LogFactory.getLog(PlayerInfoItemWriter.class);

    @Autowired
    private PlayerDao playerDao;

	public void write(List<? extends Player> player) throws Exception {
        playerDao.savePlayer(player.get(0));
		log.info(player.get(0).getName());
	}

}
