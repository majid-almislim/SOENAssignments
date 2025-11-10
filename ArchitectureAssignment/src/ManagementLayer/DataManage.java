package ManagementLayer;
import DataLayer.*;
public class DataManage{
	Repository V = new Repository();
	public void AddStudent(String name, String major, int id) {
		Student S = new Student(name, major, id);
		V.repAdd(S);
	}
	public String ViewStudent(int id) {
		Student lStu = V.repSearch(id);
		if(lStu == null) {
			return "no student found matching that id";
		}
		else {
			return "\n=====================================\nName: "+lStu.getName()+"\nMajor: "+lStu.getMajor()+"\nID: "+lStu.getId()+"\n=====================================";
		}
	}
	public String ViewAllStudents() {
		String allStu = "";
		for(int i = 0; i < V.Stulist.size(); i++) {
			
			allStu += ViewStudent(V.Stulist.get(i).getId());
		}
		return allStu;
	}
}
