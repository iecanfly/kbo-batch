package com.iecanfly.kbo.dao.player;

import com.iecanfly.kbo.model.player.Player;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/2/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PlayerDAO {
    public void writePlayer(Player player) throws Exception;
}
