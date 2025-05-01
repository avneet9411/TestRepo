package FactoryDesignPatterns;

public class Singleton {

    // Nested static SingletonClass
    static class SingletonClass {
        // Private static instance
        private static final SingletonClass instance = new SingletonClass();

        // Private constructor to prevent instantiation
        private SingletonClass() {
        }

        // Public static method to get the instance
        public static SingletonClass getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        // Get the SingletonClass instance
        SingletonClass ins = SingletonClass.getInstance();

        // Output to verify the instance
        System.out.println("Singleton instance: " + ins);
    }
}
