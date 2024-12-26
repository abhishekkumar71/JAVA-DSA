public class OOPS {
     public  static void main(String[] args){
        pen p1=new pen();
        p1.changecolor("Blue");
        System.out.println(p1.color);
        p1.changetipsize(5);
        System.out.println(p1.tipsize);

        student s1=new student();
        s1.calpercentage(34,56,71);
        System.out.println(s1.percentage);

        
     }
    
}

class pen{
    String color;
    int tipsize;
    void changecolor(String newcolor){
    color=newcolor;
    }
    void changetipsize(int newtip){
        tipsize=newtip;
    }
} 
class student{
    int marks;
    float percentage;
    String name;
    void calpercentage(int phy,int che,int math){
        percentage=(phy+che+math)/3;
    }
}