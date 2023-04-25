package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Studenthari;
import com.example.demo.model.Studentdata;

@RestController
public class Student {
	@Autowired
	Studenthari sh;
	
	@GetMapping("/fetchdata")
	public List<Studentdata> getalldetails()
	{
		return sh.findAll();
	}
	@PostMapping("/savedata")
	public Studentdata saveinfo(@RequestBody Studentdata regno)
	{
		return sh.save(regno);
	}
	@PutMapping("/savedata/{regno}")
	public Studentdata saveinfo1(@RequestBody Studentdata regno)
	{
		return sh.save(regno);
	}
	@DeleteMapping("/savedata/{regno}")
	public String det(@PathVariable int regno)
	{
		sh.deleteById(regno);
		return "Return Deleted";
	}

}
