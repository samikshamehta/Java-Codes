 import java.util.Scanner;


class shape {

	int price=10;
	static int count;
	public shape(int price)
	{
		this.price=price;
		count++;
	}
	/*shape(int num)
	{
		rollno=num;
		name="abc";
	}
	shape(int num,String str)
	{
		rollno=num;
		name=str;
	}
	public void print()
	{
		System.out.print(name+" "+rollno+" ");
	}*/
}
public class ruffee{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(shape.count+" ");
			shape s=new shape(500);
			shape s1=new shape(600);
			//s.price=16;
			System.out.println(shape.count);
	}
}