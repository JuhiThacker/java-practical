class circle
{
	double r;
	public double area()
	{
		return r*r;
	}
	public void setr(double r)
	{
		this.r=r;
	}
}
class circledemo
{
	public static void main(String[] args)
	{
		circle c=new circle();
		c.setr(10);
		System.out.println(" "+c.area());
	}
}