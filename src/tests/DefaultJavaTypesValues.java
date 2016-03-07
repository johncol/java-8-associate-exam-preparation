package tests;

public class DefaultJavaTypesValues {

	byte number;
	float decimal;
	char character;
	String object;

	public static void main(String... args) {
		DefaultJavaTypesValues instance = new DefaultJavaTypesValues();
		System.out.println("Number:    " + instance.number);
		System.out.println("Decimal:   " + instance.decimal);
		System.out.println("Character: " + instance.character);
		System.out.println("Object:    " + instance.object);
	}
	
}
