package com.interf;

 interface Greeting
   {
	   public void Morning();
	   public void Afternoon();
	   public void Evening();
	   public void Night();
   }
  class English implements Greeting
  {
	   public void Morning()
	   {
	     System.out.println("Good Moring");
	     
	   }
	   public void Afternoon() 
	   {
		     System.out.println("Good Afternoon");
		  }
	   public void Evening() 
	   {
	     System.out.println("Good Evening");
	   }
	   public void Night() 
	   {
	     System.out.println("Good Night");
	   }

	 }
  class Hindi implements Greeting
  {
	   public void Morning()
	   {
	     System.out.println("Shuprabhath");
	     
	   }
	   public void Afternoon() 
	   {
		     System.out.println("Namaskar");
		  }
	   public void Evening() 
	   {
	     System.out.println("Subhasandhya");
	   }
	   public void Night() 
	   {
	     System.out.println("Subharatri");
	   }

	 }
  class Telugu implements Greeting
  {
	   public void Morning()
	   {
	     System.out.println("Shubhodhayam");
	     
	   }
	   public void Afternoon() 
	   {
		     System.out.println("Subhamadhyanam");
		  }
	   public void Evening() 
	   {
	     System.out.println("Subhasayantram");
	   }
	   public void Night() 
	   {
	     System.out.println("Subharatri");
	   }

	 }

