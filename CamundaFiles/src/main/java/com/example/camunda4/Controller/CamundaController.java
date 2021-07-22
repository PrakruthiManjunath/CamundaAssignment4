package com.example.camunda4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.camunda4.Service.CamundaService;

@RestController
@RequestMapping("/api")
public class CamundaController {
	
	@Autowired
	CamundaService camundaService;
	
	@GetMapping("/process/{activityName}/{name}")
	public Object getEmployeeData(@PathVariable String activityName, @PathVariable String name)
	{
		return camundaService.triggerProcess(activityName, name);
	}

}
