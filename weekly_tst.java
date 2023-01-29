import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class weekly_tst {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String urlString = "https://jsonplaceholder.typicode.com/albums";
		
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(urlString)).build();
		
		HttpClient httpClient = HttpClient.newBuilder().build();
		
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(httpResponse.body());
	}

}
