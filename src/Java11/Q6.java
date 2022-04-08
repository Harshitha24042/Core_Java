package Java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Q6{
	public static void main(String[] args) {
		String url = "https://httpbin.org/get";
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		
		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> response;
		try {
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response);
			System.out.println(response.body());
			System.out.println(response.statusCode());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}