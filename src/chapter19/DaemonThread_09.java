package chapter19;

public class DaemonThread_09 implements Runnable{

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonThread_09 dm = new DaemonThread_09(); //일반객체
		Thread t = new Thread(dm); //일반객체를 스레드로 변환 -> run()을 star()로 변경
		t.setDaemon(true); //데몬 스레드로 변환 (데몬 스레드는 메인이 종료되면 같이 종료)
		t.start(); //데몬스레드 실행
		
		for(int i=0; i<15; i++) {
			//메인스레드
			try {
				Thread.sleep(1000); //1초에 한번
			} catch (Exception e) {
				e.printStackTrace();
			}//
			
			System.out.println(i); //메인스레드
			if (i==3) {
				autoSave=true;
			}
		}
		
	}

	
	//----------------------------------------------------------
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); //3초
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			
			if(autoSave) {
				System.out.println("자동 저장 됩니다.");
			}//if
			
			
		}//while
	}//run
	
	
	
}
