/**
 * 
 */
package com.example.courseDashboard.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author subha
 *
 */

@RestController
public class WelcomeController {
	
	@RequestMapping("/")
	public String dashboard() {
		return "Welcome to Mallick Academy";
	}

}
