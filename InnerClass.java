class Cpu {
int price;
public Cpu(int price) {
this.price = price;
}

class Processor {
int core;
String name;
Processor(int core, String name) {
this.core = core;
this.name = name;
}
void display() {
System.out.println("Price : " + price);
System.out.println("Core : " + core);
System.out.println("Brand : " + name);
}
}
static class Ram {
 static void display(int size,String name) {
System.out.println("Size : " + size);
System.out.println("Brand : " + name);
}
}
}
 public class Innerclass {
public static void main(String args[]) {
Cpu c = new Cpu(70000);
Cpu.Processor p = c.new Processor(16, "Intel");
p.display();
Cpu.Ram.display(16,"Adata");
}
}
