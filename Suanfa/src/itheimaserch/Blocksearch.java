package itheimaserch;

public class Blocksearch {
    public static void main(String[] args) {
        int[]arr={16,5,9,12, 21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};
        Block b1=new Block(18,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);

        Block[] arrblock={b1,b2,b3};
        int number=23;
        int index=getnumber(arr,arrblock,number);
        System.out.println(index);
    }

    private static int getnumber(int[]arr,Block[] arrblock, int number) {
        int t=0;
        for(int i=0;i<arrblock.length;i++){
            if(number<arrblock[i].getMax()){
                t=i;
                break;
            }
        }
        for(int i=arrblock[t].getStartindex();i<arrblock[t].getEndindex();i++){
            if(number==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
class Block{
    private int max;
    private int startindex;
    private int endindex;

    public Block( int max,int startindex, int endindex) {
        this.startindex = startindex;
        this.endindex = endindex;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartindex() {
        return startindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public int getEndindex() {
        return endindex;
    }

    public void setEndindex(int endindex) {
        this.endindex = endindex;
    }
}