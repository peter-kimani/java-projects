public class Constr{
int  modelYear;
String modelName;

public Constr(int year, String name){
modelYear=year;
modelName=name;
}
public static void main(String[] args)
{
Constr myCar=new Constr(1996, "Mustang");
System.out.println(myCar.modelYear + " " +myCar.modelName);
}
}