package test04;

public class ArrayTest6 {

	public static void main(String[] args) {
		
		String[] menus = new String[3];
		menus[0]="아이스크림";
		menus[1]="치킨";
		menus[2]="피자";
		
		String[] tmpMenus = menus;
		
		menus = new String[4];

		for(int a=0 ;a<tmpMenus.length ;a++ ) {
			menus[a]=tmpMenus[a];
		}
		//tmpMenus.length 를 쓴 이유는 menus의 길이가 다르기때문에
		
		
		menus[3] = "맥주";
		
		for(int i=0; i<menus.length;i++) {
			System.out.println(menus[i]);
		}
		
	}
}
