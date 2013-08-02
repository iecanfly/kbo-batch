package com.iecanfly.kbo.player;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.nodes.Element;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Dummy {@link org.springframework.batch.item.ItemWriter} which only logs data it receives.
 */
@Component("playerInfoItemWriter")
public class PlayerInfoItemWriter implements ItemWriter<Element> {

	private static final Log log = LogFactory.getLog(PlayerInfoItemWriter.class);

	/**
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	public void write(List<? extends Element> data) throws Exception {
		log.info(data);
	}

}
