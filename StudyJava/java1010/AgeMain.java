package java1010;

import java.io.*;
import java.util.Scanner;

public class AgeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "x-windows-949");

        String str = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\java\\age4.csv"), "x-windows-949"));

            System.out.println("--------메뉴 선택--------");
            System.out.println("1. 전체 조회");
            System.out.println("2. 지역별 최대최소 인구 연령");
            System.out.println("3. 특정 연령대의 인구수 최대최소");
            System.out.println("-----------------------");
            System.out.print("선택 : ");
            int input = sc.nextInt();

            String[] strCnt = new String[0];

            while (true) {
                int data = br.read();
                if (data == -1)
                    break;
                str += (char) data;
            }

            strCnt = str.split("\\n");

            switch (input) {

                case 1:
                    if (strCnt.length > 0) {
                        // 컬럼 이름을 출력 (첫 번째 줄)
                        String[] columnNames = strCnt[0].split(",");
                        for (String columnName : columnNames) {
                            System.out.print(columnName + "\t");
                        }
                        System.out.println(); // 줄 바꿈
                    }

                    for (int i = 1; i < strCnt.length; i++)
                        System.out.println(strCnt[i]);

                    break;

                case 2: // 지역별 최대 최소 연령 구하기
                    if (strCnt.length == 0) {
                        System.out.println("데이터가 로드되지 않았습니다. 먼저 '1. 전체 조회'를 선택하여 데이터를 로드하세요.");
                        break;
                    }

                    for (int i = 0; i < strCnt.length; i++) {
                        String[] data = strCnt[i].split(",");
                        String areaName = data[0];
                        int maxAge = 0;
                        int minAge = Integer.MAX_VALUE;

                        for (int j = 2; j < data.length; j++) {
                            int age = Integer.parseInt(data[j].trim());
                            if (age > maxAge) {
                                maxAge = age;
                            }
                            if (age < minAge) {
                                minAge = age;
                            }
                        }

                        System.out.println(areaName + ": 최대 연령 " + maxAge + "세, 최소 연령 " + minAge + "세");
                    }

                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}