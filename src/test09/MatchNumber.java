package test09;

public class MatchNumber {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,4,5};
		int[] fNums = {1,2,6};
		int[] cnts = new int[fNums.length]; // 초기값은 0이어야함 카운터이기때문에 방갯수만 지정
		//list, map, set -> 배열의 확장판이라
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<fNums.length;j++) {
				if(nums[i]==fNums[j]) {
					cnts[j]++;
				}
			}
		}
		for(int i=0; i<fNums.length;i++) {
			System.out.println(fNums[i]+" 개수는 " + cnts[i]);	
		}
	}
}
// 1월 6일에 이거 시험나온다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
