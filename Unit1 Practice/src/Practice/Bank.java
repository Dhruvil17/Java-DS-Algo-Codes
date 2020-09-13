package Practice;

public interface Bank 
{
	abstract float rateOfInterest();
}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}

class ICICI implements Bank
{
	public float rateOfInterest()
	{
		return 9.75f;
	}
}