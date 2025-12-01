public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a * b; // Ошибка 2: метод должен делить, а не умножать
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        return add(1, 2) + dif(5, 3);
    }
}