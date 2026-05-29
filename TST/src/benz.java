class benz {
    String s;
    int id;

    public benz(String s, int id) {
        this.s = s;
        this.id = id;
    }

    public String toString()
    {
        System.out.println("id="+id+"s="+s);
        return "ffff";
    }
}
class test {
    public static void main(String[] args) {
        benz b = new benz ("f",10);
        b.toString();

    }
}