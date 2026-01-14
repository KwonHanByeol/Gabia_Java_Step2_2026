package chapter08;

public class DmbCellphoneMain_07 {

	public static void main(String[] args) {
		
		//11 Java폰 블랙		
		DmbCellphone dmb = new DmbCellphone(11, "Java폰", "검정");
		
		//상속받은 필드
		System.out.println("모델: "+ dmb.model);
		System.out.println("색상: "+ dmb.color);
		
		//자식클래스 필드
		System.out.println("채널: "+ dmb.channel);
		
		//전화통화 구현
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("안녕하세요. 000기업의 홍길동입니다. 박길동님 되시나요?");
		dmb.receiveVoice("전화받았습니다. 박길동입니다.");
		dmb.sendVoice("1월 6일 면접 가능하신가요?");
		dmb.receiveVoice("네 가능합니다.");
		dmb.hangUp();
		dmb.changeChannelDmb(5);
		dmb.turnOffDmb();
		
		

	}

}
