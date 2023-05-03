package day20;

import java.util.ArrayList;

//클래스 + ArrayList
class Member{
	private String name, addr;

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getAddr() {return addr;}

	public void setAddr(String addr) {this.addr = addr;}
	  
}

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		//list.add(null)
		
		Member m1 = new Member();//객체 생성 후
		m1.setAddr("home");//객체에 값 추가
		m1.setName("lee");
		list.add(m1);//리스트에 값 추가
		
		Member m01 = list.get(0); 
		System.out.println(m1.getName()); //출력
		System.out.println(m1.getAddr());
		
		
		Member m2 = new Member();
		m2.setAddr("work");
		m2.setName("kim");
		list.add(m2);
		
		System.out.println("==============");
		
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			System.out.println("==============");
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAddr());
			
		}
		System.out.println("=======for each=======");
		ArrayList<String> str = new ArrayList<>();
		str.add("aaa"); str.add("bbb");
		for(String s : str) {
			System.out.println(s);
		}
		System.out.println("=======lisr for each=======");
		for (Member mm : list) {//Member Class
			System.out.println(mm.getAddr());
			System.out.println(mm.getName());
		}
	
	}
}
