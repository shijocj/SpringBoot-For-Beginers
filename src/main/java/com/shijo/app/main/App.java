/**
 * 
 */
package com.shijo.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shijo
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
