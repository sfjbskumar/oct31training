<<<<<<< HEAD
package com.falguni.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {	
	    @RequestMapping("/hello")
	    public String index() {
	        return "Hello from controller";
	    }

		@GetMapping("/get")
		public String indexdata() {
			return "getting data from controller";
		}

		@PostMapping("/post")
		public String indexpost() {
			return "getting post from controller";
		}

	     @PutMapping("/put")
	     public String indexput() {
		return "getting put from controller";
	}

}
=======
package com.falguni.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {	
	    @RequestMapping("/hello")
	    public String index() {
	        return "Hello from controller";
	    }

		@GetMapping("/get")
		public String indexdata() {
			return "getting data from controller";
		}

		@PostMapping("/post")
		public String indexpost() {
			return "getting post from controller";
		}

	     @PutMapping("/put")
	     public String indexput() {
		return "getting put from controller";
	}

}
>>>>>>> e4fbf5beee5c498f6e26d1abd48d7de3240df450
