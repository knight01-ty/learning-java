import java.util.ArrayList;
import java.util.Iterator;
public class ibm {
    public static void main(String[] args){
        ArrayList<String> l1= new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        l1.add("bulma");
        l1.add("yamacha");
        l1.add("goku");
        l2.add("pilafsama");
        l2.add("RRA");
        l2.add("Tao Pai Pai");
         l1.addAll(l2);
         l1.set(2,"chichi");
        System.out.println(l1);
        System.out.println(l1.contains("goku"));
        for(int i=0;i<l1.size();i++){
System.out.println(l1.get(i));}
for(String data : l1){
    System.out.println(data); 
}
Iterator<String> itr=l1.iterator();
while(l1.hasNext()){
    System.out.println(itr.next());
}

        
    }

    
}