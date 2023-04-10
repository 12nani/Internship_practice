class RunThread extends Thread{
  public void run(){
    System.out.println("thread is running");
  }
}
class Thread1{
  public static void main(String args[]){
    RunThread t1=new RunThread();
    t1.start();
  }
}