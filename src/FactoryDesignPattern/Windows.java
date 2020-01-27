package FactoryDesignPattern;

public class Windows implements OS{
    private int num = 10;
    public int getNum() {return num;}
    public void setNum(int numb) {this.num = numb;}
    public void changeInst(Windows win) {this.num = 120;}
    public void changeNum(int numb) {numb = 12;}
    public void specs() {
        System.out.println("I'm a Windows");
    }
}
