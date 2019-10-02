package com;

public class TestException {
    public void exception1(){
        int x = 12;
        try {
            System.out.println("Before");
            System.out.println(x/0);
            System.out.println("After");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finaly block");
        }
        // int [] m = {1,2,3,4,5};
        // int y = m[17];
        // System.out.print(y);
    }

    public void exception2(){
    try
    {
        Thread.sleep(3000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
    System.out.println("Hello Thread");
}

}
