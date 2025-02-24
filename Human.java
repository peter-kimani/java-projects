public class Person{
private String name;
public String getName(){
return name;
}

public void setName(String newName){
this.name=newName;
}
}
public class Human{
public static void main(String[] args){
Person myObj= new Person();
myObj.setName("Kimani Peter");
System.out.println(myObj.getName());
}
}