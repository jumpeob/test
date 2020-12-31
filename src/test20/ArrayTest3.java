package test20;

class Food{
	String name;
}
public class ArrayTest3 {
	void add(Food[] fs, String name) {
		
	}
	public static void main(String[] args) {
		Food[] fs = new Food[2];
		fs[0] = new Food();
		fs[1] = new Food();
		fs[0].name = "볶음밥";
		fs[1].name = "짜장면";
		Food[] tmpFs = fs;
		
		fs = new Food[4];
		for(int i=0; i<tmpFs.length; i++) {
			fs[i]= tmpFs[i];
		}
		fs[2] = new Food();
		fs[3] = new Food();
		fs[2].name="짬뽕";
		fs[3].name="탕수육";
		for(int i=0; i<fs.length; i++) {
			System.out.println(fs[i].name);
		}
	}
}
