package test21;

public class ArrayTest3 {
	

	public static void main(String[] args) {
		double[] dbs = new double[0];
		
		dbs = ArrayUtill.add(dbs,0.1);
		dbs = ArrayUtill.add(dbs,0.2);
		dbs = ArrayUtill.add(dbs,0.3);
		dbs = ArrayUtill.add(dbs,0.4);
		ArrayUtill.printArray(dbs);
	}
}
