package Creational.Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 URL url1 = new URL.Builder("https", "example.com")
	                .setPort(8080)
	                .setPathParam("users")
	                .setQueryParam("id", "123")
	                .build();
	        System.out.println("URL 1: " + url1);
	        
	        // Example 2: Without port
	        URL url2 = new URL.Builder("http", "mywebsite.com")
	                .setPathParam("profile")
	                .setQueryParam("user", "John")
	                .build();
	        System.out.println("URL 2: " + url2);

	}

}
