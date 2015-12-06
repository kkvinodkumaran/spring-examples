package com.mysolr;

import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.collections.Factory;
//import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.BinaryRequestWriter;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.support.SimpleSolrRepository;

import com.mysolr.repo.LocRepo;

public class SolrPush {

	public static void main(String[] args) throws Exception {

		ApplicationContext factory = new
		 ClassPathXmlApplicationContext("context.xml");
		// System.out.println(factory.getBean(SimpleSolrRepository.class));
		Location loc = new Location("NEW1", "new1 States of America");
		 SolrTemplate solrTemplate = factory.getBean(SolrTemplate.class);
		 solrTemplate.saveBean(loc);
		 solrTemplate.commit();
		// SimpleSolrRepository<Location, String> simpleSolrRepository =
		// factory.getBean(SimpleSolrRepository.class);
		// simpleSolrRepository.save(loc);

		SolrInputDocument document = new SolrInputDocument();
		document.addField("locCd", "GK");
		document.addField("locNm", "Sasi cheese wheel");
		// SolrClient httpSolrClient = new
		// HttpSolrClient("http://localhost:8983/solr/");
		// System.out.println(httpSolrClient.add("location", document));
		// System.out.println(httpSolrClient.commit(false,false));

		/*HttpSolrServer httpSolrServer = new HttpSolrServer(
				"http://localhost:8983/solr/");
		httpSolrServer.add("location", document);
		httpSolrServer.commit("location", true, false); */
		System.out.println("done");
	}

}
