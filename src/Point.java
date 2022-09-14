public class Point {
    public int x, y;
    public Point (int px){
        x=px;
        y=2*x+7;
    }

    public void print(){
        System.out.println("my X is = "+x +" my y is = "+y);
    }
}
