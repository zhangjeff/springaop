/**
 * @author Youpeng.Zhang on 2018/3/29.
 */
public class TestMain {

    public static void main(String[] args) throws  Exception{
        System.out.println("hi jeff!");

        Class classNames = Class.forName("org.springframework.aop.IntroductionAdvisor");
        Class<?>[] interfaces = classNames.getInterfaces();
        for (Class<?> infi : interfaces){
            System.out.println(infi.getName());
        }
    }
}
