package multiThreading;
class Ex_Thread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Daemon Thread!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex_Thread e1=new Ex_Thread();
e1.setDaemon(true);
e1.start();
for(int i=0;i<2;i++) {
	System.out.println("Main Thraed!");
}
	}

}
