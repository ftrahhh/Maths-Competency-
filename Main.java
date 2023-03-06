public class Main {
    // Application code
    public static void main(String args[]) {
       
        DSchoolList dl = new DSchoolList();
        
        School uni1 = new School();
        uni1.setName("University of Manchester");
        dl.addSchool(uni1);
        
        School uni2 = new School();
        uni2.setName("University of Edinburgh");
        dl.addSchool(uni2);
        
        dl.display();
    }
    
    
}
