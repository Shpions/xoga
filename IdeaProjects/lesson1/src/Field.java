/**
 * Created by Станислав on 19.03.14.
 */
public class Field {

    private final char pole[][];
    private final int fieldsize;

    Field(){
        fieldsize=3;
        pole = new char[fieldsize][fieldsize];
    }
    Field (int n){
        fieldsize=n;
        pole = new char[fieldsize][fieldsize];
    }
    public int getFieldSize(){
        return fieldsize;
    }
    public void showpole(){
        System.out.println();
        for (int i=0;i<fieldsize;i++){
            for(int j =0;j<fieldsize;j++){

                System.out.print("{" + pole[i][j] + '}');
            }
            System.out.println();
        }

    }
    public void move1(int x,int y){
        pole[x][y]='X';
        showpole();
    }
    public void move2(int x,int y){
        pole[x][y]='O';
        showpole();



}}
