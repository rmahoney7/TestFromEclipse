public abstract class Duck {
	//two reference variables for behavior 
	//interface types - all duck classes
	//will inherit these reference variables
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	
	public void swim (){
		System.out.println("all ducks float, even decoys");
	}
	
	
}
