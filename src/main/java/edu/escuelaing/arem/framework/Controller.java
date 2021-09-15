package edu.escuelaing.arem.framework;

import edu.escuelaing.arem.framework.Annotation.GetMapping;

public class Controller {
	
	 @GetMapping(uri="/mafalda")
	 public static double mafalda() {
		 return 2.0;
	 }
}
