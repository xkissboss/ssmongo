package com.xkb.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import com.xkb.dao.BaseDao;
import com.xkb.entity.BaseEntity;
import com.xkb.util.Page;


/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午6:00:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class BaseServiceImpl <T extends BaseEntity , DAO extends BaseDao<T, PK>, PK extends Serializable>{

	protected abstract DAO getDao();
	
	public int deleteById(PK pk) {
		return this.getDao().deleteById(pk);
	}

	public void insert(T t) {
		this.getDao().insert(t);
	}

	public T findById(PK pk) {
		return this.getDao().findById(pk);
	}

	public List<T> findByIds(List<PK> idList) {
		return this.getDao().findByIds(idList);
	}

	public void saveOrUpdate(T t) {
		this.getDao().saveOrUpdate(t);
	}
	
	public Page findByPage(Page page) {
		Query query = new Query(); //Sort st = new Sort(Direction.ASC, "a");
		return this.getDao().findByPage(query, page);
	}
	
	public void insertBatch(List<T> tList) {
		this.getDao().insertBatch(tList);
	}
}
