package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		
		Byte b = 1;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");
		Long l = 100000L;
		
		System.out.println(b.toString());
		System.out.println(i*3);
		System.out.println(i/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c);
	}
}
