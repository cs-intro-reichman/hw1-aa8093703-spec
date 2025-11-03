// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * range);
		int b = (int) (Math.random() * range);
		int c = (int) (Math.random() * range);

		System.out.println(a + " " + b + " " + c);

		System.out.print(Math.min(Math.min(a, b), Math.min(b,c)));
		System.out.print(" ");

		System.out.print(
			Math.min(Math.min(Math.max(c, b), Math.max(a,c)), Math.min(Math.max(a, b), Math.max(b,c)))
			);

		System.out.print(" ");
		System.out.println(Math.max(Math.max(a, b), Math.max(b,c)));
		
	}
}
