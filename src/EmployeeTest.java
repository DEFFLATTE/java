/**
 * Created by zhouhangfeng on 2019/12/31.
 */
//import java.io.*;
public class EmployeeTest {
    public static void main(String[] args){
//        构造器创建两个对象
        Employee empOne = new Employee("张三");
        Employee empTwo = new Employee("李四");
//        调用者俩个对象的成员方法
        empOne.empAge(24);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(500);
        empOne.printEmployee();

        empTwo.empAge(23);
        empTwo.empDesignation("高级程序员");
        empTwo.empSalary(400);
        empTwo.printEmployee();
    }
}
