package com.cms.semye.dao;



import java.util.List;
import java.util.Map;


public interface ObjectDao {
	
	/**
	 * 根据hql语句查询集合列表
	 * @param hql
	 * @return
	 */
	public List<Object> getObjectsByHql(String hql);
	
	/**
	 * 根据sql语句查询集合列表
	 * @param sql
	 * @return
	 */
	public List<Object> getObjectsBysql(String sql,Class<?> classObj);
	
	/**
	 * 根据sql语句查询集合列表
	 * @param sql
	 * @return
	 */
	public List<Map<String, Object>> getMapOfObjectsBysql(String sql);
	
	/**
	 * 根据sql语句查询集合列表,带分�?
	 * @param sql
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Map<String, Object>> getMapOfObjectsBysql(String sql,Integer start, Integer size);
	
	/**
	 * 根据hql语句查询唯一对象
	 * @param hql
	 * @return
	 */
	public Object getObjectByHql(String hql);
	
	/**
	 * 根据sql语句查询唯一对象
	 * @param sql
	 * @return
	 */
	public Object getObjectBysql(String sql,Class<?> classObj);
	
	/**
	 * 根据ID查询唯一对象
	 * @param objclass
	 * @param id
	 * @return
	 */
	public Object getObjectById(Class<?> objclass, Integer id);
	
	/**
	 * 使用hql语句统计数量
	 * @param hql
	 * @return
	 */
	public int countNumByHql(String hql);
	
	/**
	 * 使用sql语句统计数量
	 * @param sql
	 * @return
	 */
	public int countNumBySql(String sql);
	
	/**
	 * 传参Object进行更新
	 * @param object
	 */
	public void updateObject(Object object);
	
	/**
	 * 使用hql语句进行更新操作
	 * @param hql
	 */
	public void updateByHql(String hql);
	
	/**
	 * 使用sql语句进行更新操作
	 * @param sql
	 */
	public void updateBySql(String sql);
	
	
	/**
	 * 新增�?��对象
	 * @param object
	 */
	public void addObjecy(Object object);
	
	/**
	 * 删除�?��对象
	 * @param object
	 */
	public void delObjecy(Object object);
	
	/**
	 * 根据ID删除�?��对象
	 * @param objclass
	 * @param id
	 */
	public void delObjectById(Class<?> objclass, Integer id);
	
	/**
	 * 根据hql语句查询返回�?��List<String>
	 * @param hql
	 * @return
	 */
	public List<String> getStringListByHql(String hql);
	
	/**
	 * 根据hql语句查询返回�?��List<Object[]>
	 * @param hql
	 * @return
	 */
	public List<Object[]> getStringArrayListByHql(String hql);
	
}
