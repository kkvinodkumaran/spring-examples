package com.mysolr.repo;

import org.springframework.data.solr.repository.SolrRepository;

import com.mysolr.Location;

public class LocRepo implements SolrRepository<Location, String>
{

	public <S extends Location> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Location> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Location findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Location> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Location> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Location entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Location> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}

