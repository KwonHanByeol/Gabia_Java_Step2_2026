package chapter09;

public class HttpServletMain_03 {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());
		
	}
	//method
	public static void method(HttpServlet http) {
		http.serevice();
	}

}
