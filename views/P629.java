package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class P629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("ㄱ/d");
		list.add("ㄴ/w");
		list.add("ㄷ/s");
		Collections.sort(list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2)
			{
				int a = Integer.parseInt(o1.substring(o1.indexOf("/")+1));
				int b = Integer.parseInt(o2.substring(o2.indexOf("/")+1));
				return a-b;
			}
		});
		
		
		System.out.println(list);
		
		Stack<Integer> stack = new Stack<>();
		
		LinkedList<String> list2 = new LinkedList<>();
		
		
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println(list2);
		System.out.println(list2.get(0));

	}

}
