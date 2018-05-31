package com.jacson.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacson.entities.Pais;
import com.jacson.repository.PaisRepository;

@Controller
public class PaisController {
	
	@Autowired
	private PaisRepository paisRepo;
	
	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
		model.addAttribute("data", paisRepo.findAll(new PageRequest(page, 4)));
		model.addAttribute("currentPage", page);
		return "index";
	}

	
	@PostMapping("/save")
	public String save(Pais p) {
		paisRepo.save(p);
		return "redirect:/";
	}
	
	
	@GetMapping("/delete")
	public String deletePais(Integer id) {
		paisRepo.deleteById(id);
		return "redirect:/";
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Pais> findOne(Integer id) {
		return paisRepo.findById(id);
	}
	
}
