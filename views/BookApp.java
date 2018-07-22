package day11;

import java.util.Scanner;

public class BookApp extends BookMgr{
	
	public void showList(BookMgr mgr)
	{
		mgr.printBookList();
	}
	
	public void add(BookMgr mgr)
	{
		
		Book a1 = new Book ("Java Program", 26800);
		mgr.addBook(a1);
		Book a2 =new Book ("JSP Program", 26000);
		mgr.addBook(a2);
		Book a3 = new Book ("SQL Fundamentals", 25000);
		mgr.addBook(a3);
		Book a4 =new Book ("JDBC", 27800);
		mgr.addBook(a4);
		Book a5 =new Book ("EJB Program", 26400);
		mgr.addBook(a5);
	}
	
	public void remove(BookMgr mgr)
	{
		System.out.println("삭제할 타이틀을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String keyboard = sc.nextLine();
		mgr.removeBook(keyboard);
	}
	
	public void update(BookMgr mgr)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기존의 타이틀을 입력하세요");
		String pretitle = sc.nextLine();
		System.out.println("수정할의 타이틀을 입력하세요");
		String title = sc.nextLine();
		System.out.println("수정할 가격을 입력하세요");
		int price = sc.nextInt();
		mgr.updateBook(pretitle, title, price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookMgr mgr = new BookMgr();
		BookApp app = new BookApp();
		
			app.add(mgr);
			
			while(true)
			{
				System.out.println("*** 책 관리 프로그램 ***\n원하는 번호를 선택하세요!");
				System.out.println("1. 입	력");
				System.out.println("2. 수	정");
				System.out.println("3. 삭	제");
				System.out.println("4. 검	색");
				System.out.println("5. 전체 목록 보기");
				System.out.println("6. 종	료");

				
				System.out.println("******************************************");

				Scanner keyboard = new Scanner(System.in);
				String input = keyboard.nextLine();
				
				switch (input.charAt(0)) {
				case '1':
					app.add(mgr);
					break;
				case '2':
					app.update(mgr);
					app.showList(mgr);
					break;
				case '3':
					app.remove(mgr);
					app.showList(mgr);
					break;
				case '4':
					System.out.println("타이틀을 입력하세요");
					mgr.searchTitle(keyboard.nextLine());
					break;
				case '5':
					app.showList(mgr);
					mgr.printTotalPrice();
					break;
				case '6':
					System.out.println("Application Shut Down");
					keyboard.close();
					keyboard = null;
					System.exit(0); //얜 아예 앱 자체를 죽여줌.
				default:
				}
			}
			

		

	}

}
