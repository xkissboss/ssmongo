package com.xkb.service;

import java.io.Serializable;
import java.util.List;

import com.xkb.entity.BaseEntity;
import com.xkb.util.Page;

/**
 * @Description:
 * @author 作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午5:56:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public interface IBaseService<T extends BaseEntity, PK extends Serializable> {

	public int deleteById(PK pk);

	public void insert(T t);

	public T findById(PK pk);

	public List<T> findByIds(List<PK> idList);

	public void saveOrUpdate(T t);
	
	public Page findByPage(Page page);
	
	public void insertBatch(List<T> tList);
}
