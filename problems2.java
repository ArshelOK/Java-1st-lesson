public class Main
{
	public static void main(String[] args) {
        byte num1=10;
        if(num1>=8){
            System.out.println("big kid");
        }
        int num2=7;
        if(num2%2==0){
            System.out.println("even");
        }
        int temp=5;
        if(temp<10){
            System.out.println("wear a coat");
        }
        int score=100;
        if(score==100){
            System.out.println("you aced");
        }
        int speed=65;
        if(speed>60){
            System.out.println("Slow down!!!");
        }
        boolean chocoLover=true;
        if(chocoLover){
            System.out.println("yum");
        }
        int dice=7;
        if(dice==7){
            System.out.println("lucky");
        }
        int age=13;
        if(age>=13 && age<=19){
            System.out.println("teenager");
        }
        int year=2024;
        if(year%4==0){
            System.out.println("leap year");
        }
        int battery=15;
        if(battery<=20){
            System.out.println("plug in");
        }
        
        int num12=7;
        if(num12%2==0) System.out.println("even");
        else System.out.println("odd");
        int mark=55;
        if(mark>=50) System.out.println("pass");
        else System.out.println("fail");
        int hour=18;
        if(hour>=9 && hour<=12) System.out.println("good morning");
        else if(hour>=18 && hour<=23) System.out.println("good night");
        int temp1=30;
        if(temp1>25) System.out.println("iced tea");
        else System.out.println("hot cocoa");
        int n=-3;
        if(n>0) System.out.println("positive");
        else if(n<0) System.out.println("negative");
        else System.out.println(";)");
        int age1=17;
        if(age1>=18) System.out.println("Enter");
        else System.out.println("no no no");
        int num3=33;
        if(num3>=100) System.out.println("big number");
        else System.out.println("small number");
        boolean sunny=false;
        if(sunny) System.out.println("umbrella");
        else System.out.println("sun block");
        boolean finished=true;
        if(finished) System.out.println("play");
        else System.out.println("working");
        int daysDry=4;
        if(daysDry>=3) System.out.println("water plant");
        else System.out.println("still moist");
        byte grade=33;
        if(grade>=0 && grade<=19) System.out.println("F");
        else if(grade>=20 && grade<=39) System.out.println("D");
        else if(grade>=40 && grade<=59) System.out.println("C");
        else if(grade>=60 && grade<=79) System.out.println("B");
        else if(grade>=80 && grade<=99) System.out.println("A");
        else if(grade==100) System.out.println("excellent");
        String light="yellow";
        if(light=="red") System.out.println("stop");
        else if(light=="yellow") System.out.println("ready");
        else if(light=="green") System.out.println("go");
        byte temp2=20;
        if(temp2<=0) System.out.println("very cold");
        else if(temp2<13) System.out.println("cold");
        else if(temp2<25) System.out.println("warm");
        else System.out.println("hot");
        int num4=33;
        if(num4>0) System.out.println("positive");
        else if(num4<0) System.out.println("negative");
        else System.out.println("zero");
        String myMove="rock";
        String yourMove="paper";
        if(yourMove=="rock") System.out.println("tie");
        else if(yourMove=="paper") System.out.println("you won");
        else if(yourMove=="scissors") System.out.println("I won");
        int a=3,b=3,c=3;
        if(a==b && b==c) System.out.println("equilateral");
        else if(a==b || a==c || b==c){
            if(a!=b || a!=c || b!=c) System.out.println("isosceles");
        }
        else System.out.println("scalene");
        byte month=3;
        if(month==12 && month==1 && month==2) System.out.println("winter");
        else if(month>=3 && month<=5) System.out.println("spring");
        else if(month>=6 && month<=8) System.out.println("summer");
        else if(month>=9 && month<=11) System.out.println("autumn");
        byte age2=16;
        if(age2<=2) System.out.println("baby");
        else if(age2<=5) System.out.println("toddler");
        else if(age2<=12) System.out.println("kid");
        else if(age2<=17) System.out.println("teen");
        else System.out.println("adult");
        byte score1=33;
        if(score1>=90) System.out.println("gold");
        else if(score1>=75) System.out.println("silver");
        else if(score1>=60) System.out.println("bronze");
        else System.out.println("none");
        byte battery1=33;
        if(battery1<=20) System.out.println("red");
        else if(battery1<=50) System.out.println("yellow");
        else if(battery1<=100) System.out.println("green");
        
        int num5=8;
        int num6=12;
        if(num5>num6) System.out.println(num5);
        else if(num5<num6) System.out.println(num6);
        else System.out.println("=");
        int num7=-5;
        int num8=2;
        if(num7>num8) System.out.println(num8);
        else if(num7<num8) System.out.println(num7);
        else System.out.println("=");
        int student1=33;
        int student2=34;
        if(student1>student2) System.out.println(student1);
        else if(student1<student2) System.out.println(student2);
        else System.out.println("=");
        int racer1=12;
        int racer2=14;
        int racer3=33;
        int mijin=(racer1+racer2+racer3)/3;
        if(racer1<mijin){
            if(racer2>racer3) System.out.println(racer2);
            else System.out.println(racer3);
        }
        else if(racer2<mijin){
            if(racer1>racer3) System.out.println(racer1);
            else System.out.println(racer3);
        }
        else if(racer3<mijin){
            if(racer1>racer2) System.out.println(racer1);
            else System.out.println(racer2);
        }
        int num9=9;
        int num10=12;
        if(Math.abs(num9-10) > Math.abs(num10-10)) System.out.println(num10);
        else if(Math.abs(num9-10) < Math.abs(num10-10)) System.out.println(num9);
        else System.out.println("=");
        int num13=57;
        int num14=27;
        if(num13%10==num14%10) System.out.println(num13%10);
        if(4*3==12) System.out.println("yes");
        int num15=33;
        if(num15*2>20) System.out.println("big");
        int squareWidth=13;
        int squareHeight=33;
        if(squareHeight==squareWidth) System.out.println("square");
        else System.out.println("rectangle");
        int year1=2025;
        if(year1%4==0 && year1%100!=0) System.out.println("leap");
        else System.out.println("normal year");
	}
}





