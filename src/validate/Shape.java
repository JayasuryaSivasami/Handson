package validate;

public interface Shape {
	default int sum(int a, int b)	{
		return a+b;
	}
	void displayMultiple(int a,int b);
}
