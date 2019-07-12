package com.infotel.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccueilController { // c'est la servlet
	@RequestMapping("/")//  "/" racine de projet
	public String index() {
		return "index";
}
}