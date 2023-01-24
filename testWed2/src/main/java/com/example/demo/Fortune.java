package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;

@Controller
public class Fortune {
	@Autowired
	WeatherService weatherServie;
	
	@RequestMapping("/fortune")
	public String start() {
		return "sample.html";
		
	    // 気象データの取得
	    List<Weather> userDataList = weatherService.findAllWeatherData();
	    model.addAttribute("weatherDataList", userDataList);
		
	}
	
}
