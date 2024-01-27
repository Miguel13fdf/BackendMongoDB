package com.example.M5A.GenericService;

import java.io.Serializable;
import java.util.List;

public interface GenericService <T, ID extends Serializable>{
    public T save (T entity);
    public List<T> findByAll();
    public T findById(ID id);
	public void delete(ID id);
	

}