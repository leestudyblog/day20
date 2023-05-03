package pra;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentService {
	StudentDTO studto = new StudentDTO();
	ArrayList<StudentDTO> stulist = new ArrayList<>();
	//ArrayList<StudentDTO> Namelist = new ArrayList<>();
	//등급
	
	
	Scanner sc = new Scanner(System.in);
	String userName=null; int userNum=0; int userKo=0; int userEn=0; int userMa=0; String userGrade=null;
	boolean bool = true;
	
	public void intro() {
		System.out.println("학생등록 프로그램");
		System.out.println("1.학생등록");System.out.println("2.검색");System.out.println("3.모든학생보기");System.out.println("4.종료");
	}
	
	public void studentInput() {
		//이름등록
		System.out.println("이름: ");
		userName = sc.next();
		studto.setName(userName);
		stulist.add(studto);
		//학번등록
		System.out.println("학번: ");
		userNum = sc.nextInt();
		studto.setStuNum(userNum);
		stulist.add(studto);
		//국,영,수 등록
		System.out.println("국어 성적: ");
		userKo = sc.nextInt();
		studto.setKo(userKo);
		stulist.add(studto);
		
		System.out.println("영어 성적: ");
		userEn = sc.nextInt();
		studto.setKo(userEn);
		stulist.add(studto);
		
		System.out.println("수학 성적: ");
		userMa = sc.nextInt();
		studto.setKo(userMa);
		stulist.add(studto);
			
	}
	public void serch() {
		while(bool) {
			System.out.println("1.이름 검색");
			System.out.println("2.학번 검색");
			System.out.println("3.등급 검색"); 
			System.out.println("4.성적 검색");
			int num=sc.nextInt();
			switch(num) {
			case 1: 
				System.out.println("학번 입력 : ");
				int inputNum=sc.nextInt();
				for(StudentDTO dto: stulist) {
					if(!stulist.equals(inputNum)) {
						System.out.println("정보가 없습니다.");
					}else {
						//입력 번호에 해당하는 이름 가져오기
						for(StudentDTO dto1: stulist) {
							System.out.println("이름 : "+dto1.getName());
						}
					}
				}
				break;
			case 2: 
				System.out.println("이름 입력 : ");
				int inputNa=sc.nextInt();
				for(StudentDTO dto: stulist) {
					if(!stulist.equals(inputNa)) {
						System.out.println("정보가 없습니다.");
					}else {
						
						for(StudentDTO dto1: stulist) {
							System.out.println("학번 : "+dto1.getStuNum());
						}
					}
				}
				
				break;
			case 3: 
				System.out.println("이름 입력 : ");
				int inputk=sc.nextInt();
				for(StudentDTO dto: stulist) {
					if(!stulist.equals(inputk)) {
						System.out.println("정보가 없습니다.");
					}else {
					
						for(StudentDTO dto1: stulist) {
							System.out.println("국어성적 : "+dto1.getKo());
							System.out.println("영어성적 : "+dto1.getEn());
							System.out.println("수학성적 : "+dto1.getMa());
						}
					}
				}
				break;
			case 4: 
				studto.setGrade("A");
				studto.setGrade("B");
				
				System.out.println("이름 입력 : ");
				int inputg=sc.nextInt();
				for(StudentDTO dto: stulist) {
					if(!stulist.equals(inputg)) {
						System.out.println("정보가 없습니다.");
					}else {
						
						for(StudentDTO dto1: stulist) {
							//등급 기능
							
							System.out.println("등급 : "+dto1.getGrade());
						}
					}
				}
				break;
			}
		}
		
		
		
	}
	public void allStudent() {
		if(studto.getName()!=null) {
			for (StudentDTO dto: stulist) {
			System.out.println(dto.getName());
			System.out.println("모든 학생 보기");
		}
		}else {
			System.out.println("데이터 없음");
		}
		
		
	}
}
