package DataLayer;
public class Student {
public String name, major;
public int id;
public Student(String name, String major, int id) {
	this.name = name; this.major = major; this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
