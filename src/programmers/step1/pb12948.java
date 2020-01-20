package programmers.step1;

// 핸드폰 번호 가리기
public class pb12948 {

	public static void main(String[] args) {
		String pn = "027778888";
		System.out.println(solution(pn));
	}
	
	public static String solution(String phone_number) {
	      char[] arr = phone_number.toCharArray();
	      StringBuffer sb = new StringBuffer();
	      
	      for(int i=0; i<arr.length - 4; i++) {
	          sb.append('*');
	      }
	      sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));
	      
	      return sb.toString();
	  }
	
}
