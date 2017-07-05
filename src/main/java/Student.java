/**
 * Created by wdCloud on 2017/4/27.
 */
public class Student {
    private String name;
    private Integer age;
    private String sex;

    public Student(){
        System.out.println("我是bean,我开始初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[]args){
        Student s = new Student();
        s.setName("张三");
        s.setAge(25);
        s.setSex("男");
        System.out.println(s.toString());
    }
}
