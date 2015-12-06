package com.mysolr;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;
@SolrDocument(solrCoreName="location")
public class Location {
	@Field("locCd")
	private String locCd;
	@Field("locNm")
	private String locNm;

	public String getLocCd() {
		return locCd;
	}

	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}

	public String getLocNm() {
		return locNm;
	}

	public void setLocNm(String locNm) {
		this.locNm = locNm;
	}

	public Location(String locCd, String locNm) {
		super();
		this.locCd = locCd;
		this.locNm = locNm;
	}

}
