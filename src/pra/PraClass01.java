package pra;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	
	public void student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

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

//ArrayList
public class PraClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stu=null;
		Student student= new Student();
		String name;
		boolean bool=true;
		while (bool) {
			System.out.println("학생등록 프로그램");
			System.out.println("1.학생등록");System.out.println("2.검색");System.out.println("3.모든학생보기");System.out.println("4.종료");
			int num;
			num=sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.println("등록: ");
				name= sc.next();
				for(int i=0; i<stu.size(); i++) {
					if(!stu.equals(name)) {
					stu.add(name);
					System.out.println("등록 완료");
				}else if(name.equals(stu)) {
					System.out.println("이미 존재하는 이름입니다.");
				}else {System.out.println("잘못된 입력입니다.");}
				}
				
				
				 break;
			case 2 : 
				try {
				System.out.println("이름 입력: ");
				name= sc.next();
				if(!name.equals(stu)) {
					System.out.println("학생 등록 필요");
				}else {
					System.out.println("검색 완료");
				}
				} catch (Exception e) {
					System.out.println("다시 입력");
					sc.nextLine();
				}
				
				break;
			case 3 : 
				for(int i=0; i<stu.size(); i++) {
					System.out.println(stu.get(i));
				}
				System.out.println("모든 학생 보기"); break;
			case 4 : System.out.println("종료"); 
			bool = false; break;
			}
		}
		
		
		
	}

}
