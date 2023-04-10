import java.util.ArrayList;
import java.util.*;

class Student implements Comparable<Student>
  {
    private int id;
    private String name;
    private String dept;
    private int age;

    Student(int id, String name, String dept, int age)
    {
      this.id=id;
      this.name=name;
      this.age=age;
      this.dept=dept;
      
    }
    public int compareTo(Student st)
    {
      if(id>st.id)
        return 1;
      else if(id<st.id)
        return 0;
      else 
        return -1;
      
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    class StudentMain
      {
        public static void main(String args[])
        {
          ArrayList<Student> stu=new ArrayList<Student>();
          Scanner sc=new Scanner(System.in);
          for(int i=0;i<3;i++)
            stu.add(new Student(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextInt()));
          
      }
        Collections.sort(stu);
        for(Student st:stu)
        {
          System.out.println(st.getId()+""+st.getName()+""+st.getDept()+"")
        }
      }
  }