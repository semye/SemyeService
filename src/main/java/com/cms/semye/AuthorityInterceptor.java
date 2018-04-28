//package com.jht.jhterp.interceptor;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.struts2.ServletActionContext;
//
//import com.opensymphony.xwork2.Action;
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
///**
// *  拦截用户登录的拦截器
// * @author Administrator
//  */
//@SuppressWarnings("serial")
//public class AuthorityInterceptor extends AbstractInterceptor{
//   
//	public String intercept(ActionInvocation invocation) throws Exception {
//		
//		//取得请求相关的ActionContext实例
//		ActionContext ctx = invocation.getInvocationContext();
//		String invocationAction=invocation.getAction().getClass().getName();
//		String invocationName=invocationAction.substring(invocationAction.lastIndexOf(".")+1,invocationAction.length());
//		
//		Map session = ctx.getSession();
//		//取出名为user的Session属性
//		//User user = (User)session.get("user");
//		//如果没有登陆，都返回重新登陆,用户注册、验证码请求不进行过滤//||user!= null
//		if (invocationName.equals("LoginAction"))
//		{
//		     return invocation.invoke();
//		}
//		//没有登陆，将服务器提示设置成一个HttpServletRequest属性
//		ctx.put("tip" , "请输入用户名、密码、验证码登陆系统!");
//		//直接返回login的逻辑视图 此处和配置文件对应
//		return Action.LOGIN;
//
//	}
//
//}
