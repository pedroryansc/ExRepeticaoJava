public class Ex15 {
	public static void main(String[] args) {
		
		float termo;
		
		for(int x = 1; x <= 37; x++) {
			termo = (float) ((38 - x) * (39 - x)) / x;
			System.out.println(x + "º termo: (" + (38 - x) + " * " + (39 - x) + ") / " + x + " = " + termo);
		}
	}
}