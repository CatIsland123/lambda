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
}

public class appleTest {
	public static void ConsumerApple (Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Apple [] aps = null;
		 aps[0]=new Apple("red",12.3);
		 aps[1]=new Apple("yellow",11.1);
	     appleTest lmd=new appleTest();
	     for(int i=0;i<aps.length ;i++) {
	     lmd.ConsumerApple(aps, (Apple app)->{
	    	 System.out.print(app.color+" "+app.weight);
	     });
	     
	     }
	    */

		//匿名内部类
		Apple[] aps1=null;
		aps1[0]=new Apple("red2",10.3);
	    aps1[1]=new Apple("yellow",11.1);
	    /*
		appleTest.ConsumerApple(aps1, new Consumer() {

			@Override
			public void accept(T t) {
				// TODO Auto-generated method stub
				System.out.println("苹果："+t);
			}
			
		});
		*/
	    //匿名
		//appleTest.ConsumerApple(aps1, apple->System.out.println(apple));
		
		//lambda
		ConsumerApple(aps1, new Consumer<Apple>() {

			@Override
			public void accept(Apple t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
	}
	

	 

}


