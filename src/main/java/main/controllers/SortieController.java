package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.classes.Sortie;
import main.services.SortiesService;

@RestController
@RequestMapping("api/")
public class SortieController {
@Autowired
SortiesService sortieService;
	@PostMapping("/sortie/{nomcomplet}")
	public void addSortie(@PathVariable Long id,@RequestBody Sortie a) {
		
		 sortieService.CréerSortie(a);
	}
	
	@GetMapping("/sortie")
	public List<Sortie> getAll() {
		return sortieService.afficherTouteLesSorties();
	}
	
}

