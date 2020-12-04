package test04;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		//strs[i] = 
		for(int i=0 ;i<strs.length ;i++) {
			if(strs[i].length()==2) {
				System.out.println(strs[i]);
//배열은 length메서드가 없음, string length함수가 없음				
			}
		}
	}
}
