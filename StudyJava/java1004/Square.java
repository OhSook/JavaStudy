package java1004;

public class Square implements Figure{
    @Override
    public int area(int ver, int hor){
        return ver*hor;
    }

    @Override
    public int round(int ver, int hor){
        return 2*ver + 2*hor;
    }
}
