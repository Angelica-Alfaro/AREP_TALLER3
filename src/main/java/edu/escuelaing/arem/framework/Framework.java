package edu.escuelaing.arem.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.HashMap;

import edu.escuelaing.arem.framework.Annotation.GetMapping;

public class Framework {
	private static HashMap<String, Method> resources = new HashMap<String, Method>();
	
	public static void startFramework(String[] args) {
		try {
			Class c = Class.forName(args[0]);
			
			for (Method m : c.getDeclaredMethods()) {
				if ( m.isAnnotationPresent(GetMapping.class)) {
					String uri = m.getAnnotation(GetMapping.class).uri();
					resources.put(uri, m);
				}
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found.");
		}
	}
	
	public static String getComponentResource(URI resourceURI) {
		String response = "";
		try {
			String classPath = resourceURI.getPath().toString().replaceAll("/api", "");
			if (resources.containsKey(classPath)) {
				response = resources.get(classPath).invoke(null).toString();
			}
		}catch(InvocationTargetException e) {
			e.printStackTrace();
			
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		return response;
	}
}
