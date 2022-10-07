public class Products {
    int id;
    String name;
    String color;

    public void screenprnt(String name,int id ,String color){
        System.out.println(name);
        System.out.println(id);
        System.out.println(color);

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
    this.id = id;

    }

}
