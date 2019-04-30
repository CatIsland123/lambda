package testLambda;

class Apple{
	String color;
	double weight;
	Apple(String c,double w){
		color=c;
		weight=w;
	}
}

public class appleTest {
	public static void ConsumerApple (Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Apple [] aps = null;
		 Apple a=new Apple("red",12.3);
		 Apple a1=new Apple("yellow",11.1);
		 aps[0]=a;
		 aps[1]=a1;
	     appleTest lmd=new appleTest();
	     lmd.ConsumerApple(aps, (Apple app)->{
	    	 System.out.print(app+" ");
	     });
	     appleTest lm=new appleTest();
	     lm.ConsumerApple(aps, new Consumer() {
	    	 public void accept() {
	    		 System.out.print(app);
	    	 }
	     });
	     
	     
	}

}


