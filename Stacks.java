//Not done


import java.util.*;
import java.util.Stack;


class Stackfunc{

    Stackfunc(){
    Stack<Object> stack2=new Stack<> ();
    int arr[] ={12,4,5,33,6,6,4324};
    List<Object> al=Arrays.asList(arr);
    al.forEach(System.out::println);

    stack2.push(12);
    stack2.push(13);
    stack2.push(23);
    stack2.addAll(al);
    System.out.println("Stack :");
    stack2.forEach(System.out::println);

}
}

class RunAll{
    RunAll()
    {
        //Stackfunc stackfunc=new Stackfunc();

    }
}

class DSFundamentals{
    public static void main(String[] args) {
        RunAll runAll=new RunAll();
        runAll.getClass();
    }
}
