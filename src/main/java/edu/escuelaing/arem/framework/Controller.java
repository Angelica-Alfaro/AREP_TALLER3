package edu.escuelaing.arem.framework;

import edu.escuelaing.arem.framework.Annotation.GetMapping;

public class Controller {
	
	 @GetMapping(uri="/personajes")
	 public static String getImage() {
		 return "https://ecupunto.com/wp-content/uploads/2020/02/1118494-tom-jerry-wallpapers-1920x1080-screen-780x405.jpg";
	 }
	 
	 @GetMapping(uri="/sentence")
	 public static String getText() {
		 return "Welcome to my first framework :)";
	 }
}
