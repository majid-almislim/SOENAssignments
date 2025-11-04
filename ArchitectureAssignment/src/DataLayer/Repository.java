package DataLayer;

import java.util.Vector;

public class Repository {
	public Vector<Student> Stulist = new Vector<>();
	public void repAdd(Student A) {
		Stulist.add(A);
	}
	public Student repSearch(int id) {
		for(int i = 0; i <= Stulist.size(); i++) {
			if (Stulist.get(i).getId() == id) {
				return Stulist.get(i);
			}
	}
		return null;
}
}
