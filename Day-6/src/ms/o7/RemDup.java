package ms.o7;

public class RemDup {

	public static void main(String[] args) {
		String[] depts = {"hr","it","sales","sales","hr","it","hr"};
		String eachDept = "";
		for(int i =0;i<depts.length;i++) {
			eachDept = depts[i];
			for ( int j=i+1;j<depts.length;j++){
			if( (depts[j]!= "YYY")  ) && (eachDept.equalsIgnoreCase(depts[j])) {
		}

	}

}
