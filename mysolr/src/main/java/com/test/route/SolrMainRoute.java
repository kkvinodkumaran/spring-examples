package com.test.route;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.data.solr.core.SolrTemplate;

import com.mysolr.Location;

public class SolrMainRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jetty:http://localhost:8182/solrPushService").to("seda:recordProcessor").process(new Processor(){

			public void process(Exchange exchange) throws Exception {
				exchange.getOut().setBody("Data send to Solr server");				
			}
			
		});
		from("vinodActivemq:locationQueue").beanRef("solrPushProcessor");
		from("seda:recordProcessor").beanRef("solrPushProcessor");;

	}

}
