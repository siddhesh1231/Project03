package MultiThreadExamples;
class Circle implements Runnable 
{
	Thread t;
	String msg;
	
	Circle(String k)
	{
		t= new Thread(this);
		msg=k;
		t.start();
		
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(msg);
			     Thread.sleep(2000);//millisecond //exception -InterruptedException
			}}catch(InterruptedException e) {}
		
		}	 
	}
}
public class UsingRunnable {

	public static void main(String[] args) 
	{
 	  Circle c= new Circle("welcome");
 	  Circle c1= new Circle("cdac");
 	  Circle c2= new Circle(" testing");
 	  

	}

}
