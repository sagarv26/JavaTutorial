package oops;

class Train
{
	Train()		 
	{
		this("Hassan");	//this(“Hassan”) will call Train(String name)
		System.out.println("Train is empty.....!");
	}

	Train(String name)
	{
		this(55);	//this(10) will call Train(int num)
		System.out.println("Train has a name.....!");
	}

	Train(int num)
	{
		System.out.println("Train has a NUMBER.....!");
	}
}




class Bus extends Train
{
	Bus()
	{
		this("Banavara"); //this(“Banglore”) will call Bus(String name)
		System.out.println("Bus is empty.....!");
	}

	Bus(String name)
	{
		this(10);	//this(10) will call Bus(int num)
		System.out.println("Bus has a name.....!");
	}

	Bus(int num)
	{
		super();	//super() will call Train() because Train is parent class
		System.out.println("Bus has a NUMBER.....!");
	}
}

class JavaConstructorChaining 
{
	public static void main(String[] args) 
	{
		new Bus();
	}
}
