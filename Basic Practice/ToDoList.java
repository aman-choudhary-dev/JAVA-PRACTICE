class ToDoList{
	public static void main(String a[]){
		StringBuffer sb = new StringBuffer();
		sb.append("TO - D0 - List \n");
		sb.append("1. Buy Groceries\n");
		sb.append("2. Finish HomeWork\n");
		sb.append("3. Call the Plumber\n");
		System.out.println(sb);
		System.out.println("Updated List");
		String str = "2. Finish HomeWork"; // to get the length to add
		int indexToAdd = sb.indexOf(str) + str.length(); // to get the index of adding point
		sb.insert(indexToAdd , "- Updated");
		System.out.println(sb);
	}
}