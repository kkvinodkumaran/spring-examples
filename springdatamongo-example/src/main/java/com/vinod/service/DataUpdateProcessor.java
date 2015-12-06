package com.vinod.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

public class DataUpdateProcessor implements Processor {

	private BusinessService businessService;

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		System.out.println("data pushing to mongodb" + body);
		businessService.updateData(body);
		System.out.println("data pushed to mongodb" + body);
		exchange.getOut().setBody("Data updated successfull");
	}

}
