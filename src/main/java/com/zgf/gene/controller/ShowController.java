package com.zgf.gene.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zgf.gene.pojo.S1Chicken;
import com.zgf.gene.pojo.S1Human;
import com.zgf.gene.pojo.S1Mouse;
import com.zgf.gene.pojo.S1Xenopus;
import com.zgf.gene.pojo.S1Zebrafish;
import com.zgf.gene.pojo.S2Kegg;
import com.zgf.gene.pojo.S3OmimDisease;
import com.zgf.gene.pojo.S5Sheet1;
import com.zgf.gene.pojo.S6Chicken;
import com.zgf.gene.pojo.S6Human1;
import com.zgf.gene.pojo.S6Human2;
import com.zgf.gene.pojo.S6Mouse;
import com.zgf.gene.pojo.S6Xeopus;
import com.zgf.gene.pojo.S6Zebrafish1;
import com.zgf.gene.pojo.S6Zebrafish2;
import com.zgf.gene.pojo.S7Chicken;
import com.zgf.gene.pojo.S7Human;
import com.zgf.gene.pojo.S7Mouse;
import com.zgf.gene.pojo.S7Xenopus;
import com.zgf.gene.pojo.S7Zebrafish;
import com.zgf.gene.service.ShowAllService;
import com.zgf.gene.util.JsonUtils;

/**   
* @Title: ShowController.java 
* @Package com.zgf.gene.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author guang
* @date 2017年7月25日 上午9:02:41 
* @version V1.0   
*/
@Controller
public class ShowController {

	@Autowired
	private ShowAllService showAllService;
	
	@RequestMapping(value="/gene")
	public String showSearch(Model model,String kind, String id, String name){
		if(kind.equals("human")){
			List<S1Human> humanList = showAllService.showS1Human(id);
			model.addAttribute("list", humanList);
			model.addAttribute("kind", kind);
			return "gene";
		}
		if(kind.equals("chicken")){
			List<S1Chicken> chickenList = showAllService.showS1Chcken(id);
			model.addAttribute("list", chickenList);
			model.addAttribute("kind", kind);
			return "gene";
		}
		if(kind.equals("mouse")){
			List<S1Mouse> mouseList = showAllService.showS1Mouse(id);
			model.addAttribute("list", mouseList);
			model.addAttribute("kind", kind);
			return "gene";
		}
		if(kind.equals("xenopus")){
			List<S1Xenopus> xenopusList = showAllService.showS1Xenopus(id);
			model.addAttribute("list", xenopusList);
			model.addAttribute("kind", kind);
			return "gene";
		}
		if(kind.equals("zebrafish")){
			List<S1Zebrafish> zebrafishList = showAllService.showS1Zebrafish(id);
			model.addAttribute("list", zebrafishList);
			model.addAttribute("kind", kind);
			return "gene";
		}
		return null;
	}
	
	@RequestMapping("/ortholog")
	public String showOrtholog(Model model,String kind, String id){
		if(kind.equals("human")){
			List<S7Human> humanList = showAllService.showS7Human(id);
			List<String> ortholog = Arrays.asList("human", "mouse", "chicken", "xenopus", "zebrafish");
			model.addAttribute("List", humanList);
			model.addAttribute("ortholog", ortholog);
			return "ortholog";
		}
		if(kind.equals("chicken")){
			List<S7Chicken> chickenList = showAllService.showS7Chicken(id);
			List<String> ortholog = Arrays.asList("chicken", "human", "mouse", "xenopus", "zebrafish");
			model.addAttribute("List", chickenList);
			model.addAttribute("ortholog", ortholog);
			return "ortholog";
		}
		if(kind.equals("mouse") ){
			List<S7Mouse> mouseList = showAllService.showS7Mouse(id);
			List<String> ortholog = Arrays.asList("mouse", "human", "chicken", "xenopus", "zebrafish");
			model.addAttribute("List", mouseList);
			model.addAttribute("ortholog", ortholog);
			return "ortholog";
		}
		if(kind.equals("xenopus")){
			List<S7Xenopus> xenopusList = showAllService.showS7Xenopus(id);
			List<String> ortholog = Arrays.asList("xenopus", "human", "mouse", "chicken", "zebrafish");
			model.addAttribute("List", xenopusList);
			model.addAttribute("ortholog", ortholog);
			return "ortholog";
		}
		if(kind.equals("zebrafish")){
			List<S7Zebrafish> zebrafishList = showAllService.showS7Zebrafish(id);
			List<String> ortholog = Arrays.asList("zebrafish", "human", "mouse", "chicken", "xenopus");
			model.addAttribute("List", zebrafishList);
			model.addAttribute("ortholog", ortholog);
			return "ortholog";
		}
		return null;
	}
	
	@RequestMapping("/searchgene")
	public String showSearchGene(){
		return "searchgene";
	}
	
	@RequestMapping("/searchortholog")
	public String showSearch(){
		return "searchortholog";
	}
	
	
	@RequestMapping("/s2")
	public String showS2(Model model){
		List<S2Kegg> list = showAllService.showS2();
		model.addAttribute("s2", list);
		return "s2";
	}
	
	@RequestMapping("/s3")
	public String showS3(Model model){
		List<S3OmimDisease> list = showAllService.showS3();
		model.addAttribute("s3", list);
		return "s3";
	}
	
	@RequestMapping("/s5")
	public String showS5(Model model){
		List<S5Sheet1> list = showAllService.showS5();
		model.addAttribute("s5", list);
		return "s5";
	}
	
	@RequestMapping("/s6/zebrafish")
	public String showS6z(Model model){
		List<S6Zebrafish1> zebrafish1 = showAllService.showS6Zebrafish1();
		List<S6Zebrafish2> zebrafish2 = showAllService.showS6Zebrafish2();
		model.addAttribute("z1", zebrafish1);
		model.addAttribute("z2", zebrafish2);
		return "s6zebrafish";
	}
	
	@RequestMapping("/s6/human")
	public String showS6h(Model model){
		List<S6Human1> human1 = showAllService.showS6Human1();
		List<S6Human2> human2 = showAllService.showS6Human2();
		model.addAttribute("h1", human1);
		model.addAttribute("h2", human2);
		return "s6human";
	}
	
	@RequestMapping("/s6/chicken")
	public String showS6c(Model model){
		List<S6Chicken> chicken = showAllService.showS6Chicken();
		model.addAttribute("ListChicken", chicken);
		return "s6chicken";
	}
	
	@RequestMapping("/s6/mouse")
	public String showS6m(Model model){
		List<S6Mouse> mouse = showAllService.showS6Mouse();
		model.addAttribute("ListMouse", mouse);
		return "s6mouse";
	}
	
	@RequestMapping("/s6/xenopus")
	public String showS6x(Model model){
		List<S6Xeopus> xenopus = showAllService.showS6Xeopus();
		model.addAttribute("ListXenopus", xenopus);
		return "s6xenopus";
	}
	
	@RequestMapping("/download")
	public String showDownload(Model model){
		return "download";
	}
	
	@RequestMapping("/contact")
	public String showContact(Model model){
		return "contact";
	}
	
	
}
