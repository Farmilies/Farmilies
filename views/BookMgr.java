package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMgr {

	private ArrayList<Book> booklist = null;

	int[] price = new int[5];
	
	int sum = 0;

	
	public BookMgr(){
		this.booklist = new ArrayList<Book>();
	}


	
	public void removeBook(String title)
	{
		Iterator<Book> it= booklist.iterator();
		
		while(it.hasNext())
		{
			if(it.next().getTitle().equals(title))
			{
				it.remove();	
			}
			
		}
	}
	
	
	public void updateBook(String pretitle, String title, int price)
	{
		Iterator<Book> it= booklist.iterator();
		Book b1 = null;
		
		while(it.hasNext())
		{
			b1=it.next();
			if(b1.getTitle().equals(pretitle))
			{
				b1.setTitle(title);
				b1.setPrice(price);
			}
			
		}
		
	}
	public void searchTitle(String title)
	{
		Iterator<Book> it= booklist.iterator();
		System.out.println("검색 결과");
		Book b1 = null;
		while(it.hasNext())
		{
			b1=it.next();
			if(b1.getTitle().equals(title))
			{
				
				System.out.println(b1.getPrice());
			}
		}
	
	}

	public void addBook(Book book)
	{
		
		//this.booklist = new ArrayList<Book>();
		booklist.add(book);
	}
	
	
	public void printBookList()
	{
		Iterator<Book> it= booklist.iterator();
		System.out.println("=======책목룍=====");
		
		while(it.hasNext())
		{
			System.out.println(it.next().getTitle());
		}
			
			/*
		for(int i =0; i<5; i++)
		{
			System.out.println(booklist.get(i).getTitle());

		}*/
	}
	public void printTotalPrice()
	{
		Iterator<Book> it= booklist.iterator();
		System.out.println("책가격의 총합");
		
		while(it.hasNext())
		{
			
			sum += it.next().getPrice();
		}
		
		/*
		
		for(int i =0; i<5; i++)
		{
			sum += booklist.get(i).getPrice();
		}
		*/
		System.out.println("전체가격의 합: " + sum);
	}
	
	
	
}
