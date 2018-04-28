package com.cms.semye.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期相关工具类
 * @author yinlijun
 *
 */
public class TimeUtil {
	
	/**
	 * 获取精确到天的日期字符串yyyy-MM-dd
	 * @return
	 */
	public static String getDayStr() {
		Date date = new Date();
		return formatDateToDay(date);
	}

	/**
	 * 格式化日期yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String formatDateToDay(Date date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
	
	/**
	 * 获取精确到秒的字符串yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getDateStr() {
		Date date = new Date();
		return formatDateToSecond(date);
	}

	/**
	 * 格式化日期yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String formatDateToSecond(Date date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}
	
	/**
	 * 获取精确到毫秒的字符串yyyyMMddHHmmsssss
	 * @return
	 */
	public static String getDateStrToMillNoSeparator() {
		Date date = new Date();
		return formatDateToMillNoSeparator(date);
	}

	
	/**
	 * 格式化日期yyyyMMddHHmmsssss
	 * @param date
	 * @return
	 */
	public static String formatDateToMillNoSeparator(Date date) {
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmsssss");
		return format.format(date);
	}
	
	
	/**
	 * 获取精确到秒的字符串yyyyMMddHHmmss
	 * @return
	 */
	public static String getDateStrToSecNoSeparator() {
		Date date = new Date();
		return formatDateToSecNoSeparator(date);
	}

	
	/**
	 * 格式化日期yyyyMMddHHmmss
	 * @param date
	 * @return
	 */
	public static String formatDateToSecNoSeparator(Date date) {
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return format.format(date);
	}
	
	/**
	 * 获取精确到天的日期字符串yyyyMMdd
	 * @return
	 */
	public static String getDayStrNoSeparator() {
		Date date = new Date();
		return formatDateToDayNoSeparator(date);
	}

	/**
	 * 格式化日期yyyyMMdd
	 * @param date
	 * @return
	 */
	public static String formatDateToDayNoSeparator(Date date) {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(date);
	}
	
	public static Timestamp getCurrentTime() {
		return new Timestamp(System.currentTimeMillis());
	}
}
