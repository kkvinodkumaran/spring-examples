package com.test.solr;

import org.apache.solr.common.SolrInputDocument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;

import com.mysolr.Location;

public class SolrPushExample {
	public static void main(String args[]) {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"context.xml");
		Location loc = new Location("KANNUR", "PERAVOOR");
		SolrTemplate solrTemplate = factory.getBean(SolrTemplate.class);
		solrTemplate.saveBean(loc);
		solrTemplate.commit();

		System.out.println("done");

	}
}
