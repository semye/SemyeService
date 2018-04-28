package com.cms.semye.util;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author 王竹叶
 *验证规则类
 */
public class ValidatorUtil {
	private static Pattern pattern = null;
	private static Matcher matcher = null;
	
	/**
	 * 手机号码验证
	 * @param strtel
	 * @return
	 */
	public static boolean mobileValidator(String strtel)
	{
//		pattern = Pattern.compile("^13\\d{9}|^14\\d{9}$|^15[0-9]\\d{8}|^18\\d{9}");
//		matcher = pattern.matcher(strtel);
//		
		return true;
	}
	
	/**
	 * 必须是1开头，只能是数字，并且是11位数字
	 * @return
	 */
	public static boolean phoneValidator(String strtel){
		pattern = Pattern.compile("^1\\d{10}$");
		matcher = pattern.matcher(strtel);
		
		return matcher.matches();
	}
	
	/**
	 * 手机号码or电话号码验证 只要为数字或-就可以
	 */
	public static boolean mobile2Validator(String strtel)
	{
		pattern = Pattern.compile("^[0-9|-]*$");
		matcher = pattern.matcher(strtel);
		
		return matcher.matches();
	}
	
	
	/**
	 * 电话号码验证
	 * @param strmobile
	 * @return
	 */
	public static boolean telValidator(String strmobile)
	{
		/*pattern = Pattern.compile("(^[0-9]{3,4}\\-[0-9]{3,8}$)|(^[0-9]{3,8}$)|(^\\([0-9]{3,4}\\)[0-9]{3,8}$)");
		matcher = pattern.matcher(strmobile);
		*/
		return true;
	}
	
	/**
	 * 电话号码验证
	 * @param strmobile
	 * @return
	 */
	public static boolean tel2Validator(String strmobile)
	{
		pattern = Pattern.compile("^[0-9]{3,4}[0-9]{3,8}$");
		matcher = pattern.matcher(strmobile);
		
		return matcher.matches();
	}
	
	/**
	 * 数字验证
	 * @param strnum
	 * @return
	 */
	public static boolean numValidator(String strnum)
	{
		boolean flag = false;
		if(!ValidatorUtil.isEmpty(strnum))
		{
			strnum = strnum.replaceAll("\\s", "");
			pattern = Pattern.compile("(^\\d+\\.\\d+$)|(^\\d+$)");
			matcher = pattern.matcher(strnum);
			flag = matcher.matches();
		}
		
		return flag;
	}
	
	/**
	 * 真实姓名验证
	 * @param realname
	 */
	public static boolean realnameValidator(String strrealname){
		pattern = Pattern.compile("^[a-zA-Z\u4e00-\u9fa5]+$");
		matcher = pattern.matcher(strrealname);
		
		return matcher.matches();
	}
	/**
	 * 用户名验证
	 * @param strnum
	 * @return
	 */
	public static boolean unameValidator(String struname)
	{
		pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*$");
		matcher = pattern.matcher(struname);
		
		return matcher.matches();
	}

	/**
	 * 整数验证
	 * @param strnum
	 * @return
	 */
	public static boolean integerValidator(String strnum)
	{
		if(strnum == null || "".equals(strnum.replaceAll("\\s", "")))
		{
			return false;
		}
		strnum = strnum.replaceAll(" ", "");
		pattern = Pattern.compile("(^\\d+$)");
		matcher = pattern.matcher(strnum);
		
		return matcher.matches();
	}
	
	/**
	 * 邮编验证
	 * @param strcode
	 * @return
	 */
	public static boolean postCodeValidator(String strcode)
	{
		if(strcode == null || "".equals(strcode))
		{
			return false;
		}
		strcode = strcode.replaceAll(" ", "");
		pattern = Pattern.compile("(\\d{6})");
		matcher = pattern.matcher(strcode);
		
		return matcher.matches();
	}
	
	
	/**
	 * 邮编验证
	 * @param strcode
	 * @return
	 */
	public static boolean emailValidator(String strcode)
	{
		if(strcode == null || "".equals(strcode))
		{
			return false;
		}
		strcode = strcode.replaceAll(" ", "");
		pattern = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$");
		matcher = pattern.matcher(strcode);
		
		return matcher.matches();
	}
	
	/**
	 * 快递单号验证
	 * @param strcode
	 * @return
	 */
	public static boolean kddhValidator(String strcode)
	{
		if(strcode == null || "".equals(strcode))
		{
			return false;
		}
		strcode = strcode.replaceAll(" ", "");
		pattern = Pattern.compile("(^[A-Za-z]+\\d+$)|\\d+");
		matcher = pattern.matcher(strcode);
		
		return matcher.matches();
	}
	
	/**
	 * 空值验证
	 * @param data
	 * @return true 空 false 非空
	 */
	public static boolean isEmpty(Object data)
	{
		boolean isEmpty = true;
		if(data == null || (data instanceof String && "".equals(((String)data).replaceAll("\\s", ""))))
		{
			isEmpty = true;
		}		
		else
		{
			isEmpty = false;
		}
		return isEmpty;
	}
	
	/**
	 * 长度验证,去除两端空格，不允许为空,合法返回false,但是上限有限制
	 * @param s
	 * @param len
	 * @return
	 */
	public static boolean checkLength(String str, int len) {
		if (str != null && !"".equals(str.trim()) && str.length() <= len) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * 验证长度。可以不输入，如果输入就判断长度是否超限
	 * @param str 字符串
	 * @param len 最大长度
	 * @return
	 */
	public static boolean checkLen(String str,int len){
		if (str==null||"".equals(str.trim())) {
			return false;
		}else if(str.length()>len){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean codeVali(String strcode)
	{
		if(strcode == null || "".equals(strcode.replaceAll(" ", "")))
		{
			return false;
		}
		strcode = strcode.replaceAll(" ", "");
		pattern = Pattern.compile("^[A-Za-z0-9#]+$");
		matcher = pattern.matcher(strcode);
		
		return matcher.matches();
	}
	
	public static String escapeStr(String str)
	{
		String temp = null;
		if(str != null)
		{
			//数字#全角转半角
			temp = ValidatorUtil.full2HalfChange(str);
			temp = temp.replaceAll("\\s", "");
			temp = temp.replaceAll("'", "’");
		}
		
		return temp.isEmpty() ? null : temp;
	}
	
	/**
	 * 全角/半角
	 * @param QJstr
	 * @return
	 */
	public static final String full2HalfChange(String QJstr)
	{
		StringBuffer outStrBuf = new StringBuffer("");
		String Tstr = "";
		byte[] b = null;
		for (int i = 0; i < QJstr.length(); i++) {
			Tstr = QJstr.substring(i, i + 1);
			// 全角空格转换成半角空格
			if (Tstr.equals("　")) {
				outStrBuf.append(" ");
				continue;
			}
			try {
				b = Tstr.getBytes("unicode");
				// 得到 unicode 字节数据
				if (b[2] == -1) 
				{
					// 表示全角
					b[3] = (byte) (b[3] + 32);
					b[2] = 0;
					outStrBuf.append(new String(b, "unicode"));
				} 
				else 
				{
					outStrBuf.append(Tstr);
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	
		} 
		return outStrBuf.toString();
	}
	
	/**
	 * 日期格式验证
	 * @param strcode
	 * @return
	 */
	public static boolean dateValidator(String strcode)
	{
		if(strcode == null || "".equals(strcode))
		{
			return false;
		}
		strcode = strcode.replaceAll(" ", "");
		//pattern = Pattern.compile("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)");
		pattern = Pattern.compile("^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$");
		matcher = pattern.matcher(strcode);
		
		return matcher.matches();
	}	
	/**
	 *日期比较大小
	 * @param args
	 * @throws ParseException
	 */
	public static boolean checkDate(Date valdate){
		SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyyMMdd");
		Integer nowdate = Integer.parseInt(sdfDateFormat.format(new Date()));
		Integer valdate1 = Integer.parseInt(sdfDateFormat.format(valdate));
		if(nowdate <= valdate1){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 两集合取差
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static List<String> getDiffrent(List<String> list1, List<String> list2) {  
        List<String> diff = new ArrayList<String>();  
        for (String str : list1) {  
            if (!list2.contains(str)) {  
                diff.add(str);  
            }  
        }  
        System.out.println(diff);  
        return diff;  
    }  
	
	/**
	 * 判断验证码是否为数字或者数字和字符组合
	 * @param ss
	 * @return
	 */
	public static boolean isPassword(String str) {
		if(str!=null&&!str.equals("")) {
			if(str.matches("[0-9]{6}$")) {
				return true;
			}
		}
		return false;
	}
}
