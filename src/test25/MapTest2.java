package test25;

public class MapTest2 {
	private int size = 0;
	private String[] keys = new String[size];
	private String[] values = new String[size];
	
	String put(String key, String value) {
		
		size++;
		String[] tmpKey = keys;
		keys = new String[size];
		for(int i=0; i<tmpKey.length;i++) {
			keys[i]=tmpKey[i];
		}
		keys[size-1]=key;
		
		
		String[] tmpValue = keys;
		values = new String[size];
		for(int i=0; i<tmpKey.length;i++) {
			values[i]=tmpValue[i];
		}
		values[size-1]=value;
		return key;
	}
	int size() {
		return size;
	}
	
	int indexOf(String key) {
		for(int i=0; i<keys.length;i++) {
			if(key.equals(keys[i])) {
				return i;
			}
		}
		return -1;
	}
	
	String get(String key){
		int idx = indexOf(key);
		if(idx==-1) {
			return null;	
		}
		return values[idx];
	}
	
	public static void main(String[] args) {
		MapTest2 mt = new MapTest2();
		mt.put("이름", "홍길동");
		mt.put("주소", "서울");
		mt.put("직업", "왕");
		
		System.out.println(mt.get("이름"));
		System.out.println(mt.get("직업"));
		
		
	}
}
