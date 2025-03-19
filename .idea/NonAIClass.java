import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class WhishList{
    private String name;
    private String id;
    private List<String> list =  new ArrayList<>();

   public WhishList(String name,String id){
        this.name=name;
        this.id=id;
    }
    public String add(String product)
    {
        list.add(product);
    }

    public void setList(List<String> list)
    {
        this.list=list;
    }
    public void removeProduct(String product){
        list.remove(product);
    }
    public void printList(){
        System.out.println(list);
    }

    public void available(String product){
        for(String s: list){
            if(s.equals(product)){// Here we check if the product is still available
                System.out.println(product);
            }
            else
                System.out.println("Not available");
        }
    }

}