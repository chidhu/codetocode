package org.chidhu.spring;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Controller
@RequestMapping("/chidhu")
@EnableWebMvc
public class HelloController {
	@RequestMapping("/{hi}/{UN}")
	public ModelAndView helloWorld( @PathVariable Map<String,String> pathVars) {
		String hi=pathVars.get("hi");
		String name=pathVars.get("UN");
		ModelAndView model= new ModelAndView("HelloPage");
		model.addObject("msg", hi + name );
		return model;
	}
}

