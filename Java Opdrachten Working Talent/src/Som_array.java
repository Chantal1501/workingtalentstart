public class Som_array {
	public static void main(String [] args) {
		Integer [] getallenlijst = {1, 2, 3, 4, 20, 500, 12};
		int som_getallen = 0;
		for (int x = 0; x < getallenlijst.length - 1; x ++) {
			som_getallen += getallenlijst[x];
			System.out.print(getallenlijst[x]);
			System.out.print("+");
		}
		som_getallen += getallenlijst[getallenlijst.length - 1];
		System.out.print(getallenlijst[getallenlijst.length - 1] + "=" + som_getallen);
	}
}
