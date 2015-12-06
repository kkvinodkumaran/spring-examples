package com.vinod.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.data.solr.core.SolrTemplate;

public class DataUpdateRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("jetty:http://localhost:8181/dataInsertService").beanRef("dataUpdateProcessor");

	}

}
