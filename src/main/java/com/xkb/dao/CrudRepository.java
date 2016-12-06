package com.xkb.dao;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

/**
 * @Description:
 * @author 作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月1日 上午10:32:37
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface CrudRepository<T, ID extends Serializable> extends
		Repository<T, ID> {

	<S extends T> S save(S entity);

	T findOne(ID primaryKey);

	Iterable<T> findAll();

	Long count();

	void delete(T entity);

	boolean exists(ID primaryKey);

	// … more functionality omitted.
}
