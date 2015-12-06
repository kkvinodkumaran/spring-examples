package com.vinod.service;

import org.apache.solr.client.solrj.beans.Field;

public class Location {
	private String locCd;
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
