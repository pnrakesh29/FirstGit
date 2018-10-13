package com.my.test;

public class DemoClass {

	public static void main(String[] args) {
		
        int n=6;
        int i;
        for( i=2;i<=n;i++)
        {
        	if(n%i==0)
        	{
        		break;
        	}
        }
        
        if(n==i)
        {
        	System.out.println("prime ");
        }
        else{
        	System.out.println("not prime");
        }
	}

}
