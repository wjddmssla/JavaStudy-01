package J04_문자열;

public class String1 {

	public static void main(String[] args) {
		//자바 이스케이프 문자
		System.out.println("\"\t안녕하세요\""); //"\t"=탭(tab)인식
		//'\"'=""안에 ""를 담고 싶을때 \"
		
		
		//문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		String address = "부산시 동래구 사직동"; //(012 456 8910)
		int index = address.indexOf("동"); //시는 몇번째 글자인가
		//lastIndexOf = 뒤에서 몇번째인가
		
		//해당 문자열에서 범위를 지정하여 문자를 잘라줌
		int index2 = address.lastIndexOf("동");
		String subAddress = address.substring(index, index2 + 1);
		String subAddress2 = address.substring(index, index2 +1);
		System.out.println(index2);
		//String subAddress = address.substring(0,5); //0번째에서 5번째 전 글자
		System.out.println(subAddress);
		System.out.println(subAddress2);
		
		//해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '_');
		System.out.println(replaceAddress);
		replaceAddress =address.replaceAll(" ", "_");
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010", "011"); //010을 011로 바꾸기
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2=phoneNumbers.replaceAll("010","011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);
		

	}

}
