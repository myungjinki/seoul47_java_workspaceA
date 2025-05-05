package chapter13.collection.ex.blank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class User_method {
	Scanner scan = new Scanner(System.in);
	// 유저등록 리스트
	List<User> userList = new ArrayList<>();
	

	public void printMenu() {
		// 메뉴를 출력하는 코드 작성.
		System.out.println();
		System.out.println("== 유저관리 프로그램 ==");
		System.out.println("   1. 유저정보 등록");
		System.out.println("   2. 유저정보 조회");
		System.out.println("   3. 전체정보 조회");
		System.out.println("   0. 종       료");
		System.out.println("==================");
		System.out.print("-> 메뉴의 번호 : ");
	
	}

	public void createUser() {
		/*
			유저정보를 등록하는 코드 작성.
			1. 아이디, 비밀번호, 이름, 핸드폰, 주소를 입력받는다.
			2. User 인스턴스 생성한다.
			3. 유저등록 리스트에 같은 아이디가 존재하는지 확인 후 존재하지 않으면 등록
		 */
		System.out.println("------------------");
		System.out.println("유저정보를 등록합니다.");
		System.out.print("-> 아이디 : ");
		String id = scan.nextLine();
		User user = new User(id, null, null, null, null);
		if (userList.contains(user)) {
			System.out.println("[등록실패] 유저가 이미 있습니다.");
			return ;
		}
		
		System.out.print("-> 비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("->  이름 : ");
		String name = scan.nextLine();
		System.out.print("->  핸드폰번호 : ");
		String phone = scan.nextLine();
		System.out.print("->  주소 : ");
		String address = scan.nextLine();
		
		user.setPw(pw);
		user.setName(name);
		user.setPhone(phone);
		user.setAddress(address);
		
		userList.add(user);
		System.out.println("[등록성공] 유저를 등록합니다.");
	}

	public void selectUser() {
		/*
			유저정보를 조회하는 코드 작성.
			1. 유저등록 리스트에 유저정보가 존재하는지 확인
			2. 조회할 아이디, 확인용 비밀번호 입력 받는다.
			3. 조회할 아이디, 확인용 비밀번호가 유저등록 리스트에 저장된 비밀번호와 일치하면 유저정보 출력.
		 */
		System.out.println("------------------");
		System.out.println("유저정보를 조회합니다.");
		
		// 아이디 조회
		System.out.print("-> 조회할 아이디 : ");
		String id = scan.nextLine();
		int userIndex = userList.indexOf(new User(id, "", "", "", ""));
		if (userIndex == -1) {
			System.out.println("[조회실패] 아이디가 존재하지 않습니다.");
			return ;
		}
		User user = userList.get(userIndex);
		
		// 비밀번호
		System.out.print("-> 비밀번호 확인 : ");
		String pw = scan.nextLine();
		if (user.getPw().equals(pw) == false) {
			System.out.println("[조회실패] 패스워드가 틀렸습니다.");
			return ;
		}
		
		// 성공
		System.out.println("[조회성공] 유저정보를 출력합니다.");
		System.out.printf("이름: %s(%s), 핸드폰: %s, 주소: %s\n", user.getName(), user.getId(), user.getPhone(), user.getAddress());
	}

	public void selectALL() {
		/*
			유저 전체정보를 조회하는 코드 작성.
			1. 유저등록 리스트에 유저정보가 존재하는지 확인
			2. 전체정보를 출력
			   (단, '이름순'으로 정렬하여 출력할 것)!!!!!!!!!!!
		 */
		if (userList.isEmpty()) {
			System.out.println("[조회실패] 등록된 유저가 없습니다.");
			return ;
		}
		Collections.sort(userList, new userNameComparator());
		
		for (User user : userList ) {
			System.out.printf("이름: %s(%s), 핸드폰: %s, 주소: %s\n", user.getName(), user.getId(), user.getPhone(), user.getAddress());
		}
	}

}