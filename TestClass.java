package main.java.instances;


public class TestClass {

    /**
     * The below code returns a instance of class B or C
     * To test, you can uncomment the commented line to instantiate testClass object, and comment the other line
     *
     * For class B, it should print 15
     * For class C, it should print 20
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static MainClass getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class testClass = Class.forName("main.java.instances.C");
        Class testClass = Class.forName("main.java.instances.B");
        return (MainClass) testClass.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        B instance = (B) getInstance();
        System.out.println(instance.id);
    }
}
