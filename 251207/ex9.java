package ex;

import java.util.ArrayList;
import java.util.Scanner;
public class ex9 {
	
	public static void main(String[] args) {
		new ex9_box().result();
		
	}
}

class ex9_box extends ex9_abstrcat{
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void add_subject(String adds) {
		
		if(this.subject.contains(adds)) {
			System.out.println("이미 등록된 과목명 입니다.");
		}
		else {
			this.subject.add(adds);
			System.out.println("해당 과목을 추가 하였습니다.");
		}
	}
  
	@Override
	public void del_subject(String dels) {
		if(this.subject.contains(dels)) {
			this.subject.remove(dels);
			System.out.println("정상적으로 삭제 되었습니다.");
		}
		else {
		System.out.println("삭제할 과목명이 없습니다.");
		}
	}
  
	@Override
	public void all_subject() {
		if(this.subject.isEmpty() == true) {
			System.out.println("과목리스트가 비어있습니다.");
		}
		else {
			System.out.println(this.subject);
		}
	}
	
	public void result() {
		for (;;) {
			System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 선택 해주세요 : ");
			String user = this.sc.next();
			if (user.equals("1")) {

				System.out.println("과목명을 입력하세요 : ");
				String adds = this.sc.next();
				this.add_subject(adds);
			} 
			
			else if (user.equals("2")) {
				System.out.println(this.subject);
				System.out.println("삭제할 과목명을 입력하세요 ");
				String dels = this.sc.next();
				this.del_subject(dels);
			} 
			
			else if (user.equals("3")) {
			this.all_subject();
			} 
			
			else {
			System.out.println("1에서 3번만 선택가능합니다. 프로그램을 다시 실행해 주세요.");
			this.sc.close();
			break;
		}
	}
}

}
