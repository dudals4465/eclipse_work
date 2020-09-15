package lamda;

interface Printable{
	void print(String s);
}

public class test1 {

	public static void main(String[] args) {
		Printable prn;
		prn= s-> {System.out.println(s); };
		
		prn.print("Hello Lamda");
	}

}
