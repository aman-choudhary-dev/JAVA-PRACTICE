class TotalObject{
	static int count = 0;
	TotalObject(){ // Whenever this obj is created of this class this constructor will be called it will increas count
		count++;
	}
	public static void main(String a[]){
		TotalObject obj1 = new TotalObject();
		TotalObject obj2 = new TotalObject();
		TotalObject obj3 = new TotalObject();
		System.out.println("Total No of Objected Created are " + TotalObject.count);
	}
}