package day11;

import java.util.Scanner;

public class Dfs_ex {

	public static int edgeNum = 0;
	public static int vertex[][]; 
	public static boolean check[];
	
	public void dfs(int startNum)
	{
		System.out.print(startNum);
		check[startNum] = true;
		
		for(int i =0; i<edgeNum; i++)
		{
			if(vertex[startNum][i] == 1 || vertex[i][startNum] == 1)
			{
				if(!(check[i] == true))
				{
					dfs(i);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dfs_ex dfs_ex = new Dfs_ex();
		
		Scanner sc = new Scanner(System.in);
		
		int vertexNum = sc.nextInt();
		edgeNum = sc.nextInt();
		int startNum = sc.nextInt();
		
		vertex = new int[edgeNum][edgeNum];
		check = new boolean[edgeNum];
	
		int next1 = 0;
		int next2 = 0; 
		/*
		 * \\
		 * 4 5 1
		   1 2
		   1 3
  		   1 4
		   2 4
		   3 4
		 */
		
		sc.nextLine();
		
		try
		{
			Exception e = new Exception();
			int count =0;
		while(sc.hasNext())
		{
			
			//sc.nextLine();
			next1 = sc.nextInt();
			next2 = sc.nextInt();
			count++;
			
			vertex[next1][next2] =1;
			vertex[next2][next1] =1;
			
			if(count == 5)
			{
				throw e;
			}
		}
		}catch(Exception e)
		{
			sc.close();
		}
		
		
		System.out.println("dfs is strat");
		
		dfs_ex.dfs(startNum);
		
		
		
		
	}
		
}
