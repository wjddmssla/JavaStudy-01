package J05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * 이름:                   next()       name
		 * 나이:                   nextInt()    age
		 * 주소:                   nextLine()   address
		 * 연락처:                 next()       phone
		 * 
		 * 
		 * 사용자의 이름은 ㅇㅇㅇ 이고 나이는 00살 입니다.
		 * 주소는 부산 동래구 사직동에 거주합니다.
		 * 연락처는 010-0000-0000입니다.
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name=null;
		int age=0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name=scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		/*
		 * nextLine() 자체가 버퍼(엔터)를 비워주기 때문에 
		 * 그 전에 버퍼를 남겨주는 행위를 하는 애들은 
		 * 엔터를 날려줘야함
		 * 그래서 주소 위 나이는 scanner를 붙여주기.
		 */
		System.out.print("주소: ");
		address=scanner.nextLine();
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는" + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " +phone + "입니다.");
		

		

	}

}
