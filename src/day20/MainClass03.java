package day20;

import java.util.ArrayList;
import java.util.Scanner;
//클래스 + ArrayList + for-each 예제
class Member03{
	private String name;
	public String getname() {return name;}
	public void setName(String name) {
		this .name =name;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Member03> list = new ArrayList<>();
	String name;
	int num;
	while(true) {
		System.out.println("1. 등록");
		System.out.println("2. 모든 내용 출력");
		num = sc.nextInt();
		switch(num) {
		case 1 : 
			System.out.println("name input");
			name = sc.next();
			Member03 m =new Member03();
			m.setName(name);
			list.add(m);
			System.out.println("저장 완");
			break;
		case 2 : 
			for (Member03 mm: list) {
				System.out.println(mm.getname());
				System.out.println("-------------");
			}
			break;
			}
		
          }
	}
}
