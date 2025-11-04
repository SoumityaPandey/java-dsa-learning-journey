class MyEmployee {
    private int id;   //data hiding - encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }
}


public class gettersetter {
    public static void main(String[] args) {
        MyEmployee soumitya = new MyEmployee();       
        soumitya.setName("Good Morning");               
        soumitya.setId(101);                            
        System.out.println(soumitya.getName());         
        System.out.println(soumitya.getId());           
    }
}


