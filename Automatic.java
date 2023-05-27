public class Automatic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Type \" K \" ");
		String string = new java.util.Scanner(System.in).nextLine();
		if (string.equals("K")) {
			System.out.println("Kenta Oshima 1.0");
		}
		System.out.println("\n" + "How many times will AI work?");
		int times = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < times; i++) {
			System.out.println("AI works!");
		}
		System.out.println("AI worked successfully");
	}

}
