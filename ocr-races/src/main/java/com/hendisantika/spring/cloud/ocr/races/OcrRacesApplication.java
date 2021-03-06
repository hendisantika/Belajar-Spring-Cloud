package com.hendisantika.spring.cloud.ocr.races;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy
public class OcrRacesApplication implements CommandLineRunner {
	private static List<Race> races = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(OcrRacesApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		races.add(new Race("Uchiha Sasuke", "212", "KNH", "Wano Kuni"));

		races.add(new Race("Uchiha Madara", "411", "RI", "Neverland"));

	}

	@RequestMapping("/")

	public List<Race> getRaces() {

		return races;

	}
}

class Race {

	private String name;

	private String id;

	private String state;

	private String city;

	public Race(String name, String id, String state, String city) {

		super();

		this.name = name;

		this.id = id;

		this.state = state;

		this.city = city;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public String getState() {

		return state;

	}

	public void setState(String state) {

		this.state = state;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

}
