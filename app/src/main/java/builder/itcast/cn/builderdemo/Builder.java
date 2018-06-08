package builder.itcast.cn.builderdemo;

/**
 * 抽象builder类规范产品的组建
 */
public abstract class Builder {
    abstract void buildBoard(String board);
    abstract void buildDisplay(String board);
    abstract void buildOs();
    abstract Computer create();
}
