package day12;
abstract class comp{
    void display(){
        System.out.println("hello world");
    }
}
abstract class lap extends comp{
    void display(){
        super.display();
        System.out.println("laptop");
    }
}
class vivo extends lap{

}
class model extends vivo{

}
class desk extends comp{
    void display(){
        System.out.println("desktop");
    }
}
public class abstract_methodss {
    public static void main(String[] args){
        //comp l=new lap();
        lap v=new model();
        comp d=new desk();
        v.display();
        d.display();
    }
}
