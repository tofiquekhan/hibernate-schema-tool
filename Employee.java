public class Employee implements java.io.Serializable{

private int eno;
private String ename;
private float esal;
private String eaddr;
private String eemail;

public void setEemail(String eemail){
this.eemail = eemail;
}

public String getEemail(){
return eemail;
}

public int getEno(){
return eno;
}

public void setEno(int eno){
this.eno = eno;
}

public void setEname(String ename){
this.ename = ename;
}

public String getEname(){
return ename;
}

public float getEsal(){
return esal;
}

public void setEsal(float esal){
this.esal = esal;
}

public String getEaddr(){
return eaddr;
}

public void setEaddr(String eaddr){
this.eaddr = eaddr;
}


}