package JoshuaDataHolder;

public class JoshuaDataHolderTester {
	public static void main(String[] args) {
		JoshuaDataHolder<String> myStringBox = new JoshuaDataHolder<String>();
		myStringBox.addElement("This is a string");
		myStringBox.addElement("This is also a string");
		System.out.printf("The element at position 2 is: %s%n", myStringBox.getElement(1));
		
		JoshuaDataHolder<Integer> myIntBox = new JoshuaDataHolder<Integer>();
		myIntBox.addElement(2);
		myIntBox.addElement(83);
		System.out.println(myIntBox.getElement(1)+"");
	}
}
