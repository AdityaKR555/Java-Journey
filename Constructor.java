class Employee1{
    int salary;
    String name;
    Employee1(){
        this.name = "Aditya";
        this.salary = 7000000;
    }

    Employee1(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    
    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }
    
}


class Cylinder{
    int radius, height;
    float vol, area;
    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public float volume(){
        vol = 3.14f*radius*radius*height;
        return vol;
    }
    public float area(){
        area = (6.28f*radius)*(height+radius);
        return area;
    }
}




public class Constructor  {
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        Employee1 emp2 = new Employee1(50000,"Ankit");
        System.out.println(emp.getSalary());
        System.out.println(emp.getName());
        System.out.println(emp2.getSalary());
        System.out.println(emp2.getName());

        // Question 1
        Cylinder cyl = new Cylinder(5, 10);
        System.out.println("Radius = " + cyl.getRadius());
        System.out.println("Height = " + cyl.getHeight());
        System.out.println("Volume = " + cyl.volume());
        System.out.println("Surface Area = " + cyl.area());

    }    
}

