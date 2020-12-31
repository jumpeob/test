package test09;

import java.util.Random;

public class CountRooms {

	public static void main(String[] args) {
		int[][] rooms = new int[4][];
		Random r = new Random();
		
		
		for(int i=0;i<rooms.length;i++) {
			rooms[i]=new int[r.nextInt(10)+1];
			
			
		}
		for(int i=0;i<rooms.length;i++) {
			System.out.println(i+"층 방갯수: "+rooms[i].length);
		}
		int count=0;
		for(int i=0;i<rooms.length;i++) {
			count += rooms[i].length;
			//총방갯수
			
		}System.out.println("총 방 개수 :"+count);
		
	}
}
