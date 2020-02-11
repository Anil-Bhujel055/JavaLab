abstract class AbstractParent
{
		abstract void method();
		abstract void hello();
}
class Child extends AbstractParent
{
		void method()
		{
				System.out.println("method override");
		}

		void hello()
		{
				System.out.println("hello mf");
		}
}

abstract class Child2 extends AbstractParent
{
			System.out.println("abstract child class which donot override abstract method of parent class");

}

abstract class AnotherClass
{
	void hi()
	{
			System.out.println("hi mf");
	}
}
