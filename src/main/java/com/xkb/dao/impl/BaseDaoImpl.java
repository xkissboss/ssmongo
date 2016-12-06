package com.xkb.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.xkb.entity.BaseEntity;
import com.xkb.util.Page;

/**
 * @Description:
 * @author 作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:28:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public abstract class BaseDaoImpl<T extends BaseEntity, PK extends Serializable> {

	private static final Logger logger = LoggerFactory
			.getLogger(BaseDaoImpl.class);

	protected static final String MongoPre = "[mongo dao] ";

	@SuppressWarnings("unchecked")
	Class<T> entityClass = (Class<T>) ((ParameterizedType) this.getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];

	@Autowired
	public MongoTemplate mongoTemplate;

	/**
	 * 根据主键删除
	 * @param pk 
	 * 			主键
	 * @return 
	 * 			影响的行数
	 */
	public int deleteById(PK pk) {
		Query query = buildPkQuery(pk);
		logger.info(MongoPre + "deleteById: " + query);
		return mongoTemplate.remove(query, entityClass).getN();
	}

	/**
	 * 增加实体
	 * @param t 实体
	 */
	public void insert(T t) {
		logger.info(MongoPre + "insert: " + t);
		mongoTemplate.save(t);
	}

	/**
	 * 根据主键查找
	 * @param pk
	 * 			主键
	 * @return
	 * 			查找的结果
	 */
	public T findById(PK pk) {
		logger.info(MongoPre + "findById: " + pk);
		return mongoTemplate.findById(pk, entityClass);
	}

	/**
	 * 根据主键列表查找
	 * @param idList
	 * 			主键列表
	 * @return
	 * 			查找的结果列表
	 */
	public List<T> findByIds(List<PK> idList) {
		Query query = new Query();
		query.addCriteria(new Criteria("_id").in(idList));
		logger.info(MongoPre + "findByIds: " + idList);
		return mongoTemplate.find(query, entityClass);
	}

	/**
	 * 更新或者保持
	 * @param t
	 * 			操作对象
	 */
	public void saveOrUpdate(T t) {
		logger.info(MongoPre + "saveOrUpdate: " + t);
		mongoTemplate.save(t);
	}

	/**
	 * 根据条件查找符合的条数
	 * @param query 
	 * 			查询条件
	 * @return
	 * 			符合条件的数量
	 */
	public long count(Query query) {
		logger.info(MongoPre + "count: " + query);
		return mongoTemplate.count(query, entityClass);
	}

	/**
	 * 根据条件查找符合的一个记录
	 * @param query 
	 * 			查询条件
	 * @return
	 * 			查询符合的结果
	 */
	public T findOne(Query query) {
		logger.info(MongoPre + "findOne: " + query);
		return mongoTemplate.findOne(query, entityClass);
	}

	/**
	 * 根据条例查找所有符合的记录
	 * @param query 
	 * 			查询条件
	 * @return
	 */
	public List<T> find(Query query) {
		logger.info(MongoPre + "find: " + query);
		return mongoTemplate.find(query, entityClass);
	}

	/**
	 * 根据条件进行单条记录更新
	 * @param query
	 * 			查询条件
	 * @param update
	 * 			更新数据
	 * @return
	 * 			影响的数量
	 */
	public long updateFirst(Query query, Update update) {
		logger.info(MongoPre + "updateFirst: " + query + "  " + update);
		return mongoTemplate.updateFirst(query, update, entityClass).getN();
	}

	/**
	 * 根据条件进行批量更新
	 * @param query
	 * 			查询条件
	 * @param update
	 * 			更新数据 
	 * @return
	 * 			影响的数量
	 */
	public long updateMuti(Query query, Update update) {
		logger.info(MongoPre + "updateMuti: " + query + "  " + update);
		return mongoTemplate.updateMulti(query, update, entityClass).getN();
	}

	/**
	 * 根据条件进行分页查找
	 * @param query
	 * 			查询条件
	 * @param pageSize
	 * 			每页大小
	 * @param pageNum
	 * 			页码
	 * @return
	 */
	public List<T> findByPage(Query query, int pageSize, int pageNum) {
		if (pageSize < 1)
			pageSize = 10;
		if (pageNum < 1)
			pageNum = 1;

		query.skip(pageSize * (pageNum - 1)).limit(pageSize);
		logger.info(MongoPre + "findByPage: " + query);
		return mongoTemplate.find(query, entityClass);
	}

	/**
	 * 根据条件进行分页查找
	 * @param query
	 * 			查询条件
	 * @param page
	 * 			页码信息
	 * @return
	 * 			分页对象
	 */
	public Page findByPage(Query query, Page page) {
		long count = this.count(query);
		List<T> list = this.findByPage(query, page.getPageSize(),
				page.getPageNum());
		page.setTotal(count);
		page.setResult(list);
		return page;
	}

	/**
	 * 批量保存
	 * @param tList
	 * 			保存对象
	 */
	public void insertBatch(List<T> tList) {
		logger.info(MongoPre + "insertBatch: " + tList);
		mongoTemplate.insert(tList, entityClass);
	}
	
	/**
	 * 根据主键更新数据
	 * @param pk
	 * 			主键
	 * @param update
	 * 			更新对象
	 * @return
	 */
	public long updateById(PK pk, Update update) {
//		QueryBuilder queryBuilder = new QueryBuilder();
		
		/*Aggregation agg = Aggregation.newAggregation(  
                Aggregation.match(Criteria.where("onumber").in(c)),  
                Aggregation.unwind("items"),  
                Aggregation.group("items.ino").sum("items.quantity").as("total"),  
                Aggregation.match(Criteria.where("total").gt(1))  
        );  */
		Query query = buildPkQuery(pk);
		return this.updateFirst(query, update);
	}
	
	protected Query buildPkQuery(PK pk) {
		Query query = new Query();
		return query.addCriteria(new Criteria("_id").is(pk));
	}
	
	
	public T findAndDelete(PK pk) {
		return this.findAndDelete(buildPkQuery(pk));
	}
	
	public T findAndDelete(Query query) {
		return mongoTemplate.findAndRemove(query, entityClass);
	}
	
	public boolean exists(PK pk) {
		return mongoTemplate.exists(buildPkQuery(pk), entityClass);
	}
	
	public T findAndModify(PK pk, Update update) {
		return this.findAndModify(buildPkQuery(pk), update);
	}
	
	public T findAndModify(Query query, Update update) {
		return mongoTemplate.findAndModify(query, update, entityClass);
	}
	
}
