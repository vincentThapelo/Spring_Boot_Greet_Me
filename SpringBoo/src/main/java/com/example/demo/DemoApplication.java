package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String HomePage(@RequestParam(value = "myName", defaultValue = "no input")String name,@RequestParam(value = "mySurname", defaultValue = "world")String surname)
	{
		return "<html><head><meta><title>Hello name</title></head><body ><h1 style='color:blue' >Welcome to the page <br>" +  String.format(name + " " +surname)+"</h1><h2 style='color:red' >Calculate your Age </h2><form action='/hel' method='get' id='nameFor'><div style='text-align:center'><label for='nameFiel'>Whats your Date of Birth : <input name = 'myBirthDate' id='nameFiel'></label><br><br><label for=nameFie>Whats your current Year : <input name = 'myCurrent' id='nameFie'><br><br><br></label><button style='background-color:lime;font-size:16px;border-radius:14px'>Calculate Age !</button></div></form></body></html>";

	}
	@GetMapping("/hel")
	public String CalculateAge(@RequestParam(value = "myBirthDate", defaultValue = "no input")String birthDay,@RequestParam(value = "myCurrent", defaultValue = "world")String currentYear)
	{

		int age=Integer.parseInt(currentYear);
		int current=Integer.parseInt(birthDay);
		int totalAge=age-current;
		String ageOutput= String.valueOf(totalAge);
		return "<html><head><meta><title>Calculate Age</title></head><body style='background-image:url('p.jpg');background-repeat: repeat'><h1 style='color:lime'>You are " +String.format( ageOutput)  +" Years old </h1><form action='/hel' method='get' id='nameFor'><div style='text-align:center'><label for='nameFiel'>Whats your Date of Birth : <input name = 'myBirthDate' id='nameFiel'></label><br><br><label for=nameFie>Whats your current Year : <input name = 'myCurrent' id='nameFie'><br><br><br></label><button style='background-color:lime;font-size:16px;border-radius:14px'>Calculate Age !</button></div></form><form action='index.html' method='get' id='nameFor'><button style='background-color:lime;font-size:16px;border-radius:14px;text-align:center'>Return to Home Screen !</button></form></body></html>";


	}

}
