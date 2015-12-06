package com.test.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.solr.client.solrj.SolrServer;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.convert.MappingSolrConverter;
import org.springframework.data.solr.core.mapping.SimpleSolrMappingContext;
import com.google.gson.Gson;
import com.mysolr.Employee;
import com.mysolr.Location;

public class SolrPushProcessor implements Processor {

	private SolrServer solrServer;
	private SolrTemplate locationsolrTemplate;
	private SolrTemplate employeesolrTemplate;

	public void setSolrServer(SolrServer solrServer) {
		this.solrServer = solrServer;
	}

	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		String header = (String) exchange.getIn().getHeader("entity");
		if (header != null && header.equals("employee")) {
			saveEmployee(body);
		}
		if (header != null && header.equals("location")) {
			saveLocation(body);
		}
	}

	public MappingSolrConverter solrConverter() {
		MappingSolrConverter solrConverter = new MappingSolrConverter(
				new SimpleSolrMappingContext());
		// solrConverter.setCustomConversions(customConversions());
		return solrConverter;
	}

	private void saveLocation(String body) throws Exception {
		SolrTemplate solrTemplate = getLocationTemplate();
		solrTemplate.setSolrConverter(solrConverter());
		Location loc = getGson().fromJson(body, Location.class);
		solrTemplate.saveBean(loc);
		solrTemplate.commit();
		System.out.println("data pushed to solr" + loc);
	}

	private SolrTemplate getLocationTemplate() {
		if (locationsolrTemplate == null) {
			locationsolrTemplate = new SolrTemplate(solrServer, "location");
		}
		return locationsolrTemplate;
	}

	private SolrTemplate getEmployeeTemplate() {
		if (employeesolrTemplate == null) {
			employeesolrTemplate = new SolrTemplate(solrServer, "employee");
		}
		return employeesolrTemplate;
	}

	private void saveEmployee(String body) {
		System.out.println("data PUSHING to solr" + body);
		SolrTemplate solrTemplate = getEmployeeTemplate();
		solrTemplate.setSolrConverter(solrConverter());
		Employee emp = getGson().fromJson(body, Employee.class);
		solrTemplate.saveBean(emp);
		solrTemplate.commit();
		System.out.println("data pushed to solr" + emp);
	}

	private Gson getGson() {
		Gson gson = new Gson();
		return gson;
	}
}
