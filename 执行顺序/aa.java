
//类中静态 非静态的执行顺序

public class aa {  
    public static int k =0 ; // 1
    public static aa t1 = new aa("t1") ;  //2   调用aa构造器前，先执行非静态代码块或者非静态常量，顺序执行，最后执行构造器aa 2-5
    public static aa t2 = new aa("t2") ;  //6 同2-5
    public static int i = print("i") ;   //7
    public static int n =99 ;   //8
    public int j = print("j") ;//3     11 
    {  
        print("构造块");  //4        12
    }  
    static {  
        print("静态块");  //9
    }  
    public aa(String str){ // 5
        System.out.println((++k)+":"+str+"   i="+i+"    n="+n) ;  
        ++i;++n ;  
    }  
    public static int print(String str){  
        System.out.println((++k)+":"+str+"   i="+i+"    n="+n) ;  
        ++n;  
        return ++i ;  
    }  
    public static void main (String args[]){  
         aa t = new aa("init") ;  //10
         t.toString();
    }  
}  