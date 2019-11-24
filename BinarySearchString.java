package CodingTest.Day2;
//Time complexcity = nLogn;
public class BinarySearchString {
public static void main(String[] args) {
	String ar[] = {"B","C","F","P","R","T","U","Z"};
	boolean rs = binarySearch(ar,0,ar.length-1,"C");
	if(rs)
		System.out.println("Yes it is there.");
	else
		System.out.println("No it is not there");
}

private static boolean binarySearch(String[] st, int low, int high, String str) {
	if(low>high)
		return false;
	
	int mid = (low+high)/2;
	if(st[mid].equals(str)) {
		return true;
	}
	if(st[mid].compareTo(str)>0)
		return binarySearch(st, low, mid-1, str);
	else
		return binarySearch(st,mid+1,high,str);
}

}
