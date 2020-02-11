class First
{
	 First()
	{
		System.out.println("This is class one");
	}
}

class Second extends First
{
	 Second()
	{
		System.out.println("This is class second");
	}
}

class Third extends Second
{
	 Third()
	{
		System.out.println("This is class third");
	}
}


class Output
{
	public static void main(String[] a)
	{
	Third obj=new Third();
	
	
	}
}
