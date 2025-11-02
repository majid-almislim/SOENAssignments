package ManagementLayer;
import DataLayer.*;
public class DataManage{
	Repository V = new Repository();
	public void AddStudent(String name, String major, int id) {
		Student S = new Student(name, major, id);
		V.Stulist.add(S);
	}
	public Student SearchStudent(int id) {
		for(int i = 0; i <= V.Stulist.size(); i++) {
			if (V.Stulist.get(i).getId() == id) {
				return V.Stulist.get(i);
			}
		}
		return null;
	}
	public String ViewStudent(int id) {
		Student lStu = SearchStudent(id);
		if(lStu == null) {
			return "no student found matching that id";
		}
		else {
			return "\nName: "+lStu.getName()+"\nMajor: "+lStu.getMajor()+"\nID: "+lStu.getId();
		}
	}

	public String ViewAllStudents() {
		String allStu = "";
		for(int i = 0; i <= V.Stulist.size(); i++) {
			
			allStu += ViewStudent(V.Stulist.get(i).getId());
		}
		return allStu;
	}
}
