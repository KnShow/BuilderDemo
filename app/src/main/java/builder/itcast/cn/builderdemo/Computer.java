package builder.itcast.cn.builderdemo;

public abstract class Computer {

    private String mBoard;
    private String mDisplay;

    protected Computer(){

    }
    public void setBoard(String board){
        mBoard = board;
    }

    public void setDisplay(String display){
        mDisplay = display;
    }
    protected abstract void setOs();

}
