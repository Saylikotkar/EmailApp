package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int  defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "anycompany.com";
    private int mailboxCapacity =500;
    private String alternateEmail;

    public Email(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created : " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Departement is : " + this.department);

        this.password = setRandom(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);

        this.email =  this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department +"." +
                companySuffix ;

        System.out.println("Your email id is :" + email);

    }

    private String setDepartment()
    {
        System.out.println("Department codes \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for none \n Enter the code:" );
        Scanner in = new Scanner(System.in);
        int deptChoice =  in.nextInt();
        if (deptChoice == 1) { return "sales" ;}
        else if(deptChoice == 2) { return "dev" ;}
        else if(deptChoice == 3) { return "acct" ;}
        else return " ";
    }


    private String setRandom(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%*";
        char[] password = new char[length];
        for(int i=0; i<length ; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }

        return String.valueOf(password);
    }

    public void setMailboxCapacity(int capacity)
    {
            this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail)
    {
                this.alternateEmail = altEmail;
    }

    public void changePassword(String password)
    {
         this.password = password;
    }

    public int getMailboxCapacity()
    {
        return this.mailboxCapacity;
    }
    public String getPassword()
    {
        return password;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }



}