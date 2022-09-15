public class Point {
    public int y, x;
    public Point (int px){
        x=px;
        y=(px*2+7)+(int)(Math.random()*8-4);
    }

    public void print(){
        System.out.println("my X is = "+x +" my y is = "+ y );
    }
}
