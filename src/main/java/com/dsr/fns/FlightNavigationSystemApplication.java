package com.dsr.fns;

import com.dsr.fns.service.FlightNavigationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightNavigationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightNavigationSystemApplication.class, args);
		new FlightNavigationService().startPubSub();
	}

}
