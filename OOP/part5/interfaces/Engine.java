package OOP.part5.interfaces;

public interface Engine {
    //by defautl static and fina l 
    static final int price = 3000 ; 

    void start();
    void stop();
    void accelerate();
} 


//! By defualt all methods in an interface are abstract ==> needs to be ovveriden 
//In abstract classes we can have non abstract methods 

//!By default all the varaible in  an interface are static and final 

//? A class can  implement multiple interfaces  

//?Members are public by default 