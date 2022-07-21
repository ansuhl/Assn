package com.company;

public class Stack {
    private Contact []arr;
    private int curr_idx;
    private int size;
    public Stack(int size){
        curr_idx=0;
        this.size=size;
        arr=new Contact[this.size];
    }
    public void push(Contact c){
        try{
            if(this.size==0){
                throw new ObjectNotCreated("Stack has been uninitilized");
            }else{
                System.out.println("stack has been initilized");
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            if(c.validate()==false){
                throw new ValidationFailed("Validation has Failed");
            }else{
                System.out.println("Validation done");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        if(curr_idx>=this.size){
            System.out.println("can't do the required stuff");
        }else{
            arr[curr_idx]=c;
            if(curr_idx+1>=size){
                System.out.println("stack full");
            }else {
                curr_idx+=1;
            }
        }
    }
    public Contact peek(){
        return arr[curr_idx];
    }
    public Contact pop(){
        try{
            if(this.size==0){
                throw new ObjectNotCreated("Stack has been uninitilized");
            }else{
                System.out.println("stack has been initilized");
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
        try{
            if(arr.length==0){
                throw new StackUninitilized("The Stack size is 0");
            }else{
                System.out.println("Stack has been initilized and we can do our further functions");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Contact c=arr[curr_idx];
        arr[curr_idx]=null;
        if(curr_idx>0){
            curr_idx--;
        }else{
            System.out.println("stack has become empty");
        }
        return c;
    }
}
