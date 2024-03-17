package java1005;
import java.util.*;

public class ChangeToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 10진수 입력 받기
        System.out.print("10진수를 입력하세요: ");
        int decimalNumber = scanner.nextInt();

        // 10진수를 2진수로 변환하여 출력
        String binary = ""; // 2진수를 저장할 문자열

        int temp = decimalNumber; // 변환을 위한 임시 변수

        if (temp == 0) {
            binary = "0"; // 입력된 숫자가 0인 경우, 2진수도 0
        } else {
            while (temp > 0) {
                int remainder = temp % 2; // 10진수를 2로 나눈 나머지를 구함
                binary = remainder + binary; // 나머지를 2진수 문자열의 앞에 추가
                temp = temp / 2; // 10진수를 2로 나누어서 다음 계산을 준비
            }
        }

        System.out.println("2진수로 변환된 값: " + binary);

      
    }

		
}


