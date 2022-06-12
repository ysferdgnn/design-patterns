package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonBillPughSolution {




    private SingletonBillPughSolution(){

    }

    private static  class SingletonBillPughSolutionHelper{
        private static final SingletonBillPughSolution instance = new SingletonBillPughSolution();
    }

    public static SingletonBillPughSolution getInstance(){
        return SingletonBillPughSolutionHelper.instance;
    }

    public String sayHello(){
        return  "Hello";
    }
}
