
public class TestCalculator {
    public void testMultiplication (){
    String mnozenje ="5*2";
    String expectedResult ="10.0";
    String realResult=Calculator.Run(mnozenje);
    
    if (realResult.equals(expectedResult)) {
        System.out.println("Test is passed.");
    } else {
        System.out.println("Test is failed ");
    }
}   
}
