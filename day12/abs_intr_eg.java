package day12;
abstract class animal{
    abstract void eat();
}
class man extends animal{
    void eat(){
        System.out.println("dog is eating");
    }
}
interface pet{
    void eat();
}
class cow extends animal implements pet{
    public void eat(){
        System.out.println("cow is eating");
    }
}
public class abs_intr_eg {
    public static void main(String[] args){
        animal d=new cow();
        d.eat();
    }
}
