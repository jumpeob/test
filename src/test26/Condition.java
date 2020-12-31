package test26;

public class Condition {

	public static void main(String[] args) {

		
		int age = 21;
		if(age/10==0) {
			System.out.println("유아기");
		}else if(age/10==1) {
			System.out.println("질풍노도");
		}else if(age/10==2) {
			System.out.println("사회생활병아리");
		}else if(age/10==3) {
			System.out.println("쓰디쓴나이");
		}else if(age/10>=4) {
			System.out.println("허망한나이..");
		}
// 1.7이후부턴는 switch에 int char String 가능		
		int gener = age/10;
		switch(gener) {
		case 0:
			System.out.println("유아기");
			break;
		case 1:
			System.out.println("질풍노도");
			break;
		case 2:
			System.out.println("병아리");
		case 3:
			System.out.println("쓴맛");
		default :
			System.out.println("허망함..");
		}//switch는 break문 없으면 결과값 밑에까지 다실행함 디폴트는 if문으로 치면 else격
	}
}
