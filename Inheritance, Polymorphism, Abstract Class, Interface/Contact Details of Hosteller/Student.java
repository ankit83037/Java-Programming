public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public Student(){
    
    }
    
    //getter
    public int getStudentId(){
        return studentId;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDepartmentId(){
        return departmentId;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getPhone(){
        return phone;
    }
    
    //setter
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
}
