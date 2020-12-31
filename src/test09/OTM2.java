package test09;

import java.util.Random;

public class OTM2 {

	public static void main(String[] args) {
		
		int[][] rooms = new int[4][];
		Random r = new Random();
		
		int MaxLength = 10;
		int MaxNum = 0;
		int MinNum = MaxLength;
		for(int i=0; i<rooms.length; i++) {
			int rNum = r.nextInt(MaxLength)+1;
			rooms[i] = new int[rNum];
			if(MaxNum<rNum) {
				MaxNum = rNum;
			}
			if(MinNum>rNum) {
				MinNum = rNum;
			}
		}
		for(int i =0; i<rooms.length; i++) {
			System.out.println(rooms[i].length);
		}
		System.out.println("제일많은방 "+MaxNum);
		System.out.println("제일많은방 "+MinNum);
	}
}
