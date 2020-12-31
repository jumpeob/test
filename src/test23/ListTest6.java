package test23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest6 {

	public static void main(String[] args) {
		List<String> strList1 = new ArrayList<String>(); // 순차출력,입력이 빠름, 많이사용
		List<String> strList2 = new LinkedList<String>(); // 순차출력,입력이 느림, 중간내용 삭제수정에 용이함
	}
}
