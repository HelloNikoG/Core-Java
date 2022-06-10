package bankApp;

public interface IbaseRate {

    //write method that returns base rate
    default double getBaseRate(){
        return 2.5;
    }
}
