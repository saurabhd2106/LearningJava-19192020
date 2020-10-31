package day3;

public class DemoData {

	public static void main(String[] args) {
		
		Data<String> data = new Data<String>();
		
		data.setDataType("Setting a string value");
		
		System.out.println(data.getDataType());
		
		
		//------------------------------------------------
		
		Data<Integer> intData = new Data<>();
		
		intData.setDataType(45);
		
		System.out.println(intData.getDataType());
	}

}
