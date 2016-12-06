package com.xkb.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.xkb.entity.BaseEntity;
import com.xkb.util.Page;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:12:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface BaseDao<T extends BaseEntity, PK extends Serializable> {

	public int deleteById(PK pk);
	
	public void insert(T t);
	
	public T findById(PK pk);
	
	public List<T> findByIds(List<PK> idList);
	
	public void saveOrUpdate(T t);
	
	public long count(Query query);
	
	public T findOne(Query query);
	
	public List<T> find(Query query);
	
	public long updateFirst(Query query, Update update);
	
	public long updateById(PK pk, Update update);
	
	public long updateMuti(Query query, Update update);
	
	public List<T> findByPage(Query query, int pageSize, int pageNum);
	
	public Page findByPage(Query query, Page page);
	
	public void insertBatch(List<T> tList);
	
	public T findAndDelete(PK pk);
	
	public T findAndDelete(Query query);
	
	public T findAndModify(PK pk, Update update);
	
	public T findAndModify(Query query, Update update);
	
	public boolean exists(PK pk);
	
}
