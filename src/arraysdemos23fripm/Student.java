
package arraysdemos23fripm;

public class Student {
    //comment added at 1:21 pm
    private String sId;
    private String sName;
    private String address;
    
    //new added fatch and marge
    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
        
    }
    //comment added 12:33
    public String getsId() {
        return sId;
    }
    //monday
    public void setsId(String sId) {
        this.sId = sId;
    }
    //comment added 1:29 pm
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
  
  
  
  
}
