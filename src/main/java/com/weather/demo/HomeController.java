package com.weather.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.weather.demo.models.Weather;

@Controller
public class HomeController {

    @Value("${weather.api.key}")
    String apiKey;
    @Value("${weather.base.url}")
    String baseUrl;


    private final RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("weather",getWeather());
        return "index";
    }

    private com.weather.demo.models.Weather getWeather() {

        System.out.println("get weather for "+baseUrl+"\n");
        var response = restTemplate.getForEntity(baseUrl, Weather.class);
        System.out.println(response.getBody());

        return response.getBody();
    }
}
