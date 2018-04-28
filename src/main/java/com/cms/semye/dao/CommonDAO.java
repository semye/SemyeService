package com.cms.semye.dao;

import java.util.List;
import java.util.Map;


public interface CommonDAO {
	
	/**
	 * 注意当更新条件仅为id时调用此方法 且entity参数中id必须赋�?
	 * 更新属�?值不等于空的字段�?默认以id作为更新条件
	 * @param entity 更新数据实体
	 * @param gstr 分组标识
	 * @throws Exception 
	 */
	public void update(Object entity, String gstr) throws Exception;
	
	public void update(Object entity, String gstr, Map<String, Object> cond) throws Exception;
	
	public void delete(Object entity, Integer id, String gstr) throws Exception;
	
	public int coutRecordBySQL(Map<String, Object> sqlMap);
	
	public int coutRecordBySQL(String sql, String countfield);
	
	public int coutRecordBySQL(String sql);
	
	public List<Map> queryRecordBySQL(String sql, Object rsql, String orderString,Map map);
	
	public List<Map> queryRecordBySQL(String sql, Object rsql, int pagesize, int startrecord, String orderString,Map map);
	
	public List selRecordBySQL(String sql, Object modelClass, String orderfield);
	
	public List selRecordBySQL(String sql, Object modelClass);
	
	public List selRecordBySQL(String sql, Object modelClass, int pagesize, int startrecord, String orderString);
	
	public void save(Object entity, String gstr) throws Exception;
	

	
}