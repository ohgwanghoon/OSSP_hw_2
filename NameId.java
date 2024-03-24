import java.util.Scanner;
public class NameId {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int id;
		
		System.out.print("이름을 입력하세요: ");
		name = scanner.next();
		System.out.print("학번을 입력하세요: ");
		id = scanner.nextInt();
		
		System.out.println("");
		System.out.println("<출력>");
		System.out.println("이름: " + name);
		System.out.println("학번: " + id);
		
		scanner.close();
	}
}
