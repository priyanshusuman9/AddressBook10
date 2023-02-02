package com.bridgelabz;
import java.util.*;

class Address{
    private String first_name, last_name, city, state;
    private long zip;
    private long phone_number;
    private long emp_no;

    Address(String first_name,String last_name,String city, String state,long zip, long phone_number,long emp_no){
        this.first_name=first_name;
        this.last_name=last_name;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone_number=phone_number;
        this.emp_no=emp_no;
    }

    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public long getZip() {
        return zip;
    }
    public long getPhone_number(){
        return phone_number;
    }
    public long getEmp_no(){
        return emp_no;
    }
    public String toString(){
        return first_name + " "+ last_name+" "+ city+" "+ state+ " "+zip+ " "+ phone_number + " "+ emp_no;
    }

}

public class AddressBook {
    public static void main(String[] args) {
        List<Address> c=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        int a;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCh");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice : ");
            a=s.nextInt();

            switch (a){
                case 1:
                    System.out.println("Enter Employee First Name : ");
                    String first_name =s.nextLine();
                    System.out.println("Enter Employee Last Name :");
                    String last_name= s.nextLine();
                    System.out.println("Enter Employee City :");
                    String city= s.nextLine();
                    System.out.println("Enter Employee State :");
                    String state= s.nextLine();
                    System.out.println("Enter Employee Zip :");
                    long zip= s1.nextLong();
                    System.out.println("Enter Employee Phone Number :");
                    long phone_number= s1.nextLong();
                    System.out.println("Enter Employee Number :");
                    long emp_no=s1.nextLong();
                    c.add(new Address(first_name,last_name,city,state,zip,phone_number,emp_no));
                    break;
                case 2:

                    System.out.println("------------------------------");
                    Iterator<Address> i= c.iterator();
                    while (i.hasNext()){
                        Address e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    boolean found =false;
                    System.out.println("Enter Employee number to search :");
                    emp_no=s1.nextLong();
                    System.out.println("------------------------------");
                    i= c.iterator();
                    while (i.hasNext()){
                        Address e=i.next();
                        if (e.getEmp_no()==emp_no){
                            System.out.println(e);
                            found=true;
                        }}
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------------");
                    break;

                case 4:
                    found =false;
                    System.out.println("Enter Employee number to Delete :");
                    emp_no=s1.nextLong();
                    System.out.println("------------------------------");
                    i= c.iterator();
                    while (i.hasNext()){
                        Address e=i.next();
                        if (e.getEmp_no()==emp_no){
                            i.remove();
                            found=true;
                        }}
                    if (!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record is deleted Successfully : ");
                    }
                    System.out.println("--------------------------------");
                    break;

                case 5:
                    found =false;
                    System.out.println("Enter Employee number to Update :");
                    emp_no=s1.nextLong();
                    System.out.println("------------------------------");
                    ListIterator<Address>li=c.listIterator();
                    while (li.hasNext()){
                        Address e=li.next();
                        if (e.getEmp_no()==emp_no){
                            System.out.println("Enter Employee First Name : ");
                            first_name =s.nextLine();
                            System.out.println("Enter Employee Last Name :");
                            last_name= s.nextLine();
                            System.out.println("Enter Employee City :");
                            city= s.nextLine();
                            System.out.println("Enter Employee State :");
                            state= s.nextLine();
                            System.out.println("Enter Employee Zip :");
                            zip= s1.nextLong();
                            System.out.println("Enter Employee Phone Number :");
                            phone_number= s1.nextLong();
                            li.set(new Address(first_name,last_name,city,state,zip,phone_number,emp_no));
                            found=true;
                        }}
                    if (!found){
                        System.out.println("Record Not Found");
                    }else {
                        System.out.println("Record is updated Successfully : ");
                    }
                    System.out.println("--------------------------------");
                    break;
            }
        }while (a!=0);
    }
}
