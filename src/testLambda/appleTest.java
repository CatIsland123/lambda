package testLambda;
import testLambda.Consumer;
import java.util.Objects;
class Apple {
	String color;
	double weight;
	Apple(String c,double w){
		color=c;
		weight=w;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	
}

public class appleTest {    
	public static void ConsumerApple (Apple[] apps,Consumer<Apple> c){
		 for(Apple apple:apps){
			 c.accept(apple);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda
		 System.out.println("lambda 方法：");
		 Apple [] aps = {new Apple("red",9),new Apple("yellow",3)};
	     appleTest lmd=new appleTest();
	     for(int i=0;i<aps.length ;i++) {
	     lmd.ConsumerApple(aps, (Apple app)->{
	    	 System.out.println(app.color+" "+app.weight);
	     });
	     
	     }
	
	     System.out.println("匿名方法：");
		 appleTest.ConsumerApple(aps, new Consumer<Apple>() {

			@Override
			public void accept(Apple t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

			
			
		});
		 System.out.println();
		 System.out.println();
		 System.out.println("lambda:");
	    //lambda
		ConsumerApple(aps, (apple)->System.out.println(apple));
		//匿名
		System.out.println("匿名类：");
		ConsumerApple(aps, new Consumer<Apple>() {

			@Override
			public void accept(Apple t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
	}
	

	 
}


