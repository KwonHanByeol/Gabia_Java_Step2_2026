package chapter10.Multilnterface;

public interface Inter_Menu1 {

	abstract String jajang();
	
	String jjambbon();
	
	default void show() {
		System.out.println("맛집~~~");
	}
}
