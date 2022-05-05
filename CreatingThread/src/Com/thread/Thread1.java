package Com.thread;

public class Thread1 extends Thread {
	
	public void run() {
		int num=10;
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0) {
				
				System.out.println( "Even Number are:  "+i);
				try{Thread.sleep(1000);}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			else {
				System.out.println("Odd Number Are  "+i);
				try{Thread.sleep(1000);}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	
	public static void main (String[]argvs) {
		
		Thread1 t= new Thread1();  
		
		t.start();
		
		
	}

}
