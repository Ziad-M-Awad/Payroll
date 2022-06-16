import java.util.Calendar;

public abstract class Employee implements EmployeeInfo, Comparable<Employee> {

    public  Employee(){

    }
    public  Employee(String firstName, String lastName, char sex, Calendar birth, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birth = birth;
        this.id = id;
    }
    private String lastName;
    private char sex;
    private Calendar birth;
    private String firstName;
    private String id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Calendar getBirth() {
        return birth;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ID Employee number: " + id + "\n");
        builder.append("Employee name: " + firstName + " " + lastName+ "\n");
        builder.append("Birth date: " + birth.getTime().toString()+ "\n");

        return builder.toString();
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id.compareTo(o.getId()) == -1)
            return 1;
        else if(this.id.compareTo(o.getId()) == 0)
            return 0;
        else
            return -1;
    }

    public  abstract  double monthlyEarning();