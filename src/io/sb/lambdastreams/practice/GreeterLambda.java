package io.sb.lambdastreams.practice;

public class GreeterLambda {
	
    //Passing the Object
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		GreeterLambda greetLambda = new GreeterLambda();
		
		HelloGreeting helloGreeting = new HelloGreeting();
		
		// 1. Passing an instance of implemented class "HelloGreeting" to the method
		greetLambda.greet(helloGreeting);
		
		// Inner class implementation
		Greeting innerClassGreeting = new Greeting() {
			
			public void perform() {
				System.out.println("Hello Lambda! - Annonymous Inner class");
			}
			
		};
		
		// 2. calling perform method on inner class instance
		innerClassGreeting.perform();
		
		// 3. calling perform method using Lambda	
		Greeting myLambdaFunction = () -> System.out.println("Hello Lambda!");
		
		myLambdaFunction.perform();
		

	}

}

