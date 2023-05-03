package pra;
/*
ArrayList 방식으로 만드세요
일단 동작먼저 되게 만들고 이 후 DTO, Service, Main 파일 분리

1. 학생 등록
2. 검색
3. 모든 학생 보기
4. 종료
--출력---
학번, 이름, 국, 영, 수, 등급
등급은 평균 90>= A , 80>= B
*/

import java.util.ArrayList;
import java.util.Scanner;

class Student01{
	
}
public class PraClass03 {
	public static void main(String[] args) {
		StudentDTO studto = new StudentDTO();
		StudentService stuSer = new StudentService();
		Scanner sc = new Scanner(System.in);
		Student01 student01 = new Student01();
		
		boolean bool=true;
		while (bool) {
			stuSer.intro();
			int num;
			num=sc.nextInt();
			switch(num) {
			case 1 : 
					stuSer.studentInput();
				 break;
			case 2 : 
					stuSer.serch();
				break;
			case 3 : 
					stuSer.allStudent();
					break;
			case 4 : System.out.println("종료"); bool = false; break;
			}
		}
		
		

	}

}
