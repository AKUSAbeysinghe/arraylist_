import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();

 //add or insert elements -add();
        al.add("Umesha");
        al.add("Lahiru");
        al.add("Ometh");
        al.add("Chaturika");

        System.out.println("Names: "+al);
//access or search elements-get();
        String s=al.get(3);//get(index)
        System.out.println("Index 3 name is: "+s);

//change or update elements- set();
        al.set(2,"Punchimalith");
        System.out.println("Modify Names: "+al);

//remove or delete elements -remove();
        String s1=al.remove(2);
        System.out.println("Updated Array: "+al);
        System.out.println("Removed Name is: "+2);

    }
}
