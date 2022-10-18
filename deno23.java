abstract class Shape
{
	abstract void area();
}
class Triangle extends Shape
{
	int base, height;
	Triangle(int b, int h)
	{
		base=b;
		height=h;
	}
	void area()
	{
		float ar = (0.5f)* (base*height);
		System.out.println("Area of Triangle: "+ar);
	}
}
class Rectangle extends Shape
{
	int length, width;
	Rectangle(int l, int w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		float ar = length * width;
		System.out.println("Area of Rectangle: "+ar);
	}
}
class Circle extends Shape
{
	int radius;
	Circle(int r)
	{
		radius = r;
	}
	void area()
	{
		float ar = 3.14f * radius * radius;
		System.out.println("Area of Circle: "+ar);
	}
}

public class deno23
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle(2,4);
		t1.area();
		Rectangle r1 = new Rectangle(3,5);
		r1.area();
		Circle c1= new Circle(2);
		c1.area();
	}

}
