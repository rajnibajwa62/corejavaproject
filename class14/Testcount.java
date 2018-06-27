class Tab{

synchronized void printTab(int n,int y){
for(int i=y;i<=n;i++){

System.out.println(i);

try{
Thread.sleep(4);
}catch(Exception e){System.out.println(e);}
}

}
}

class MyThread1 extends Thread{
Tab t;
MyThread1(Tab t){
this.t=t;
}
public void run(){
t.printTab(500,0);
}
}

class MyThread2 extends Thread{
Tab t;
MyThread2(Tab t){
this.t=t;
}
public void run(){
t.printTab(1000,500);
}
}

public class Testcount{
public static void main(String[] args){

Tab obj=new Tab();
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}