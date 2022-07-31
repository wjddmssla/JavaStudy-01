package J03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		/*
		 * 윤년
		 * 해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수일때
		 */
		
		int year = 2002; //왼쪽은 입력년도, 밑 String식은 윤년 구분 식
		String result = year%4==0 
				&& (year %100 != 0 || year % 400 ==0) ? "윤년"
						: "윤년아님";
		//String 대신 int일때 1 : 0;
		//String 대신 boolean 일때 true: false;
		//string 일때 "윤년" : "윤년아님";
		System.out.println(result);
		
		System.out.println(year > 2000 ? "2000보다 큼"
				: year > 1000? "1000보다 큼"
				: year > 500 ? "500보다 큼" 
				: "500이하");
	
		//조건 연산자 앞에서 줄 바꾸기
		/*ex)
		 * int a=190;
		 * a+10
		 *+20
		 *+30
		 *+10
		 */
		

	}

}
