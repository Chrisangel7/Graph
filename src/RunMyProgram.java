import java.util.ArrayList;
public class RunMyProgram {
    public static void main(String[] args) {

        RunMyProgram myApp= new RunMyProgram();

    }
public RunMyProgram(){
    Point[] data;
    data= new Point[10];
    makeErrorData();
}

    public void render(){

    }
    public void makeErrorData(){
        for(int i =0; i <10; i++){
            Point myPoint= new Point(i);
            myPoint.print();

        }
    }

}
