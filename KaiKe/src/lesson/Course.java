package lesson;

public class Course {
	public static String grade;
	public static String major;
	public static String number;
	public static String course;
	public static String selectType;
	public static String credit;
	public static String studyTime;
	public static String experimentTime;
	public static String machineTime;
	public static String orderWeek;
	public static String teacher;
	public static String remark;
	public void setgrade(String grade)
	{
		this.grade = grade;
	}
	public String getgrade()
	{
		return this.grade;
	}
	public void setmajor(String major)
	{
		this.major = major;
	}
	public String getmajor()
	{
		return this.major;
	}
	public void setnumber(String number)
	{
		this.number = number;
	}
	public String getnumber()
	{
		return this.number;
	}
	public void setcourse(String course)
	{
		this.course = course;
	}
	public String getcourse()
	{
		return this.course;
	}
	public void setselectType(String selectType)
	{
		this.selectType = selectType;
	}
	public String getselectType()
	{
		return this.selectType;
	}
	public void setcredit(String credit)
	{
		this.credit = credit;
	}
	public String getcredit()
	{
		return this.credit;
	}
	public void setstudyTime(String studyTime)
	{
		this.studyTime = studyTime;
	}
	public String getstudyType()
	{
		return this.studyTime;
	}
	public void setexperimentTime(String experimentTime)
	{
		this.experimentTime = experimentTime;
	}
	public String getexperimentTime()
	{
		return this.experimentTime;
	}
	public void setmachineTime(String machineTime)
	{
		this.machineTime = machineTime;
	}
	public String getmachineTime()
	{
		return this.machineTime;
	}
	public void setorderWeek(String orderWeek)
	{
		this.orderWeek = orderWeek;
	}
	public String getorderWeek()
	{
		return this.orderWeek;
	}
	public void setteacher(String teacher)
	{
		this.teacher = teacher;
	}
	public String getteacher()
	{
		return this.teacher;
	}
	public void setremark(String remark)
	{
		this.remark = remark;
	}
	public String getremark()
	{
		return this.remark;
	}
	public static void main(String[] args) {
		Course cc = new Course();
		System.out.print(cc.getgrade()+ " ");
		System.out.print(cc.getmajor()+" ");
		System.out.print(cc.getnumber()+" ");
		System.out.print(cc.getcourse()+" ");
		System.out.print(cc.getselectType()+" ");
		System.out.print(cc.getcredit()+" ");
		System.out.print(cc.getstudyType()+" ");
		System.out.print(cc.getexperimentTime()+" ");
		System.out.print(cc.getmachineTime()+" ");
		System.out.print(cc.getorderWeek()+" ");
		System.out.print(cc.getteacher()+" ");
		System.out.println(cc.getremark());
	}
}
