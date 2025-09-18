public class commands {
    private int result;
    public commands(int z){
        this.result = z;
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int sub(int x, int y){
         return x - y;
    }
    public static int mul(int x, int y){
         return x * y;
    }
    public static int div(int x, int y){
         return x / y;

    }
    public static int remainder(int x, int y){
         return x % y;

    }
    public Integer getResult() {
        return result;
    }



}
