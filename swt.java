import java.io.*;
class swt {
	public static void main (String args[])
	{
	int n1,n2,v,add,reminder,sub,mul;
        n1=Integer.parseInt(args[0]);
	n2=Integer.parseInt(args[1]);
	v=Integer.parseInt(args[2]);
        switch(v)
	{
	case 1:
	add=n1+n2;
	System.out.println(add);
	break;
	
	case 2:
	sub=n1-n2;
	System.out.println(sub);
	break;

	case 3:
	mul=n1*n2;
	System.out.println(mul);
	break;

	case 4:
	reminder=n1%n2;
	System.out.println(reminder);
	break;
      
	default:
	System.out.println("wrong choice");

	}
	}
}