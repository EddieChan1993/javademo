package ch11;

/**
 * 异常总是丢给调用方
 * 调用方也可以不处理异常，直接duck
 */
public class Test {
    public static void main(String[] args) {
        try {
            Demo.takeRisk(223);
        } catch (BadException ex) {
            //手动处理异常，如果无法从异常中恢复，至少也要列出有用信息
            //恢复程序代码
            ex.OneError();
        }finally {
            System.out.println("不管有没有异常，我都要出来");
        }

        System.out.println("异常阻止不了我出来?");

    }
}