public class Process {
    private static int pIndex = 0;
    private static int aAv;
    private static int bAv;
    private static int cAv;
    private String name = "P" + pIndex++;
    private int id = pIndex;
    private boolean flag = false;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int a;
    private int b;
    private int c;

    private int aR;
    private int bR;
    private int cR;

    public Process(int[] args) {
        this.a = args[0];
        this.b = args[1];
        this.c = args[2];
        this.aR = args[3];
        this.bR = args[4];
        this.cR = args[5];
        //this.updateAvs(); // assuming perfect resource quantities
    }

    @Override
    public String toString() {
        return "Current = a:" + this.a + " b:" + this.b + " b:" + this.c + "\n"
                + "Capacity = a:" + this.aR + " b:" + this.bR + " c" + this.cR + "\n";
    }

    public void updateAvs() {
        if (this.flag) {
            aAv += a;
            bAv += b;
            cAv += c;
        }
    }

    public void setAvs(int[] newAvs) {
        aAv = newAvs[0];
        bAv = newAvs[1];
        cAv = newAvs[2];
    }

    public int[] getAvs() {
        int[] ret = new int[3];
        ret[0] = aAv;
        ret[1] = bAv;
        ret[2] = cAv;
        return ret;
    }

    public String getAvsAsString() {
        return "Remaining resource = a:" + aAv + " b:" + bAv + " c:" + cAv + "\n";
    }

    public int getaR() {
        return aR;
    }

    public void setaR(int aR) {
        this.aR = aR;
    }

    public int getbR() {
        return bR;
    }

    public void setbR(int bR) {
        this.bR = bR;
    }

    public int getcR() {
        return cR;
    }

    public void setcR(int cR) {
        this.cR = cR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
