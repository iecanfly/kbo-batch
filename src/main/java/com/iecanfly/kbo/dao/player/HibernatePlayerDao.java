package com.iecanfly.kbo.dao.player;

import org.hibernate.SessionFactory;
import com.iecanfly.kbo.model.player.Player;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatListener;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/2/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernatePlayerDao implements PlayerDAO, RepeatListener {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void write(Object player) throws Exception {
        writePlayer((Player) player);
    }

    @Override
    public void writePlayer(Player player) throws Exception {
        sessionFactory.getCurrentSession().save(player);
    }

    @Override
    public void before(RepeatContext repeatContext) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void after(RepeatContext repeatContext, RepeatStatus repeatStatus) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void open(RepeatContext repeatContext) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onError(RepeatContext repeatContext, Throwable throwable) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void close(RepeatContext repeatContext) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
