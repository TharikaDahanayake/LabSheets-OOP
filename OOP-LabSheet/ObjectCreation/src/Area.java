class Area{


    int length;
    int breadth;


    public void setDim(int len, int bre){
        length=len;
        breadth=bre;
    }
    public int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Area Rectangle_area = new Area();
        Rectangle_area.setDim(5,10);
        System.out.println(Rectangle_area.getArea());
    }
}