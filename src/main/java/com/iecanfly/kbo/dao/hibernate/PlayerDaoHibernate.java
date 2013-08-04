package com.iecanfly.kbo.dao.hibernate;

import com.iecanfly.kbo.dao.GenericDao;
import com.iecanfly.kbo.model.Player;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/3/13
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("playerDao")
public class PlayerDaoHibernate extends GenericDaoHibernate<Player, Long> implements GenericDao<Player, Long>, PlayerDao {

    public PlayerDaoHibernate() {
        super(Player.class);
    }

    public void savePlayer(Player player) {
        save(player);
    }

}
