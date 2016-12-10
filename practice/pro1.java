class Student{
int id;
String name;

void Insertrecord(int r,String n){
id=r;
name=n;
}
void displayinfo(){
System.out.println(id+""+name);
}


public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();


s1.Insertrecord(111,"karan");
s2.Insertrecord(222,"harshita");

s1.displayinfo();
s2.displayinfo();
}
}



