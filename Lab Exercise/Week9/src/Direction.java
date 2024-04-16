public enum Direction {
    North(0,1), South(0,1), East(1,0), West(-1,0);
    private int row;
    private int column;
    Direction(int row,int column){
        this.row=row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
