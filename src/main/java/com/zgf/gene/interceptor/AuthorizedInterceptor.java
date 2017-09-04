package com.zgf.gene.interceptor;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;



/**   
* @Title: GlobalException.java 
* @Package cn.cz.workhub.interceptor 
* @Description: TODO(全局异常处理器) 
* @author guang
* @date 2017年6月14日 下午8:47:39 
* @version V1.0   
*/
public class AuthorizedInterceptor implements HandlerExceptionResolver {

	private static final Logger logger = LoggerFactory.getLogger(AuthorizedInterceptor.class);
	
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			Exception ex) {
		//打印控制台
		Exception clientException = null;
		if(ex instanceof Exception){  
		    clientException=(Exception)ex;  
		          
		}else{  
		    //如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）。  
		    clientException=new Exception("未知错误");  
		}  
		ex.printStackTrace();
		//写日志
		logger.debug("测试输出日志····");
		logger.info("系统发生异常了····");
		logger.error("系统发生异常",ex);
		
		//发邮件，发短信
		//使用jmail工具包。发短信使用第三方的webservice
		//显示错误页面
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(ex.getMessage());
		request.getCharacterEncoding();
		request.setAttribute("ex", ex.getMessage());
		modelAndView.setViewName("404");
		return modelAndView;
	}

}
