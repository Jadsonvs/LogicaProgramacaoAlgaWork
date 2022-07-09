package com.algaworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {
	
	@GetMapping("/")
	public String index() {
		return "index";//index é o arquivo index.html que criei em templates.
	}

}
