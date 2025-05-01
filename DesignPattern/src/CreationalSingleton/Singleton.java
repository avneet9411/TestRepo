package CreationalSingleton;



//Lazy initialization singleton pattern
class Singleton1 {
	
	private static Singleton1 instance;
	// Private constructor to prevent instantiation
	private Singleton1() {
	}
	// Static method to get the single instance of the class
	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}

// eager Loading singleton pattern
class Singleton2 {
	
	private static final Singleton2 instance = new Singleton2();
	// Private constructor to prevent instantiation
	private Singleton2() {
	}
	// Static method to get the single instance of the class
	public static Singleton2 getInstance() {
		return instance;
	}
}

//Synchronized(Thread safe) lazy initialization singleton pattern
class Singleton3 {
	
	private static Singleton3 instance;
	// Private constructor to prevent instantiation
	private Singleton3() {
	}
	// Static method to get the single instance of the class
	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}

// Double checked locking singleton pattern
class Singleton4 
{
	//instance variable
	// volatile so the latest value is available across all threads
	// also if volatile is not used we many get partially constructed object
	private volatile static Singleton4 instance;
	
	// private instance constructor
	private Singleton4() {}
	
	// Double check locking 
	
	public static  Singleton4 getInstance() 
	{
		//1st Check 
		// For performance 
		if(instance==null) {
			synchronized(Singleton4.class) {
//			2nd check
			// To ensure while waiting to acquire lock other thread have't created the obj
				if(instance==null) {
					instance= new Singleton4();
				}
			}
		}
		return instance;
	}
	
	
}


class BillPughSigleton {
	
	private BillPughSigleton() {}
	
	class helper{
		private static final BillPughSigleton INSTANCE= new BillPughSigleton();
	}
	
	// getter for instance
	public static BillPughSigleton getInstance() {
		return helper.INSTANCE;
	}
	
}

//Enum SIngleton
enum EnumSingleton {
	
	INSTANCE;
	
	public void doSomething() {
		System.out.println("Doing something");
	}
	
}



public class Singleton {
		public static void main(String[] args) {
//			// Lazy Loading
//			Singleton1 singleton1 = Singleton1.getInstance();
//			System.out.println(singleton1);
//			Singleton1 singleton2 = Singleton1.getInstance();
//			System.out.println(singleton2);
//			System.out.println(singleton1 == singleton2); // true
//			
//			
//			// Eager Loading
//			Singleton2 singleton3 = Singleton2.getInstance();
//			System.out.println(singleton3);
//			Singleton2 singleton4 = Singleton2.getInstance();
//			System.out.println(singleton4);
//			System.out.println(singleton3 == singleton4); // true
			
//			// Synchronized Lazy Loading
//			Singleton3 singleton5 = Singleton3.getInstance();
//			System.out.println(singleton5);
//			Singleton3 singleton6 = Singleton3.getInstance();
//			System.out.println(singleton6);
//			System.out.println(singleton5 == singleton6); // true
			
			// Double check locking singleton 
//			Singleton4 singleton = Singleton4.getInstance();
//			System.out.println(singleton);
//			Singleton4 singleton1 = Singleton4.getInstance();
//			System.out.println(singleton1);
//			System.out.println(singleton == singleton1); // true
			
			// Bill pugh Singleton (Most Recommended-As there is no overhead of synchronization)
//			BillPughSigleton singleton = BillPughSigleton.getInstance();
//			System.out.println(singleton);
//			BillPughSigleton singleton1 = BillPughSigleton.getInstance();
//			System.out.println(singleton1);
//			System.out.println(singleton == singleton1); // true
			
			// Enum Singleton
			EnumSingleton singleton = EnumSingleton.INSTANCE;
			System.out.println(singleton);
			EnumSingleton singleton1 = EnumSingleton.INSTANCE;
			System.out.println(singleton1);
			singleton1.doSomething();
			System.out.println(singleton == singleton1); // true
			
			
			
			
						
					
		}

}
