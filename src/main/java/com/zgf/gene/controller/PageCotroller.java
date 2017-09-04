package com.zgf.gene.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
* @Title: PageCotroller.java 
* @Package com.zgf.gene.controller 
* @Description: TODO(页面跳转controller) 
* @author guang
* @date 2017年7月24日 下午10:06:56 
* @version V1.0   
*/
@Controller
public class PageCotroller {

	@RequestMapping("/")
	public String indexpage(){
		
		return "index";
	}
}
