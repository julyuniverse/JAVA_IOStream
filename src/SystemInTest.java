import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("문자 여러 개를 쓰고 [Enter]를 누르세요.");

        int i;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // 한글 깨짐 방지로 보조 스트림을 설정한다.
//            while ((i = System.in.read()) != '\n') {
//                // System.out.println(i);
//                System.out.print((char) i);
//            }
            while ((i = inputStreamReader.read()) != '\n') {
                // System.out.println(i);
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 결과
        // 문자 여러 개를 쓰고 [Enter]를 누르세요.
        // hello 안녕하세요
        // hello 안녕하세요
    }
}
