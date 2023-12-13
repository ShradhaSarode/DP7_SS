package com.collectionMasterAssignment;
/*
 Create following Bean structures. Sorting always for each bean on the primary key:
Create class Student (sid , sname , cid, phno , email) All fields should be private. Write 
appropriate getter and setter methods to access them.
 */
public class Student implements Comparable<Student> {
    private int sid;       // Primary Key
    private String sname;
    private int cid;
    private String phno;
    private String email;

    public Student(int sid, String sname, int cid, String phno, String email) {
        this.sid = sid;
        this.sname = sname;
        this.cid = cid;
        this.phno = phno;
        this.email = email;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.sid, otherStudent.sid);
    }


    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", cid=" + cid +
                ", phno='" + phno + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
