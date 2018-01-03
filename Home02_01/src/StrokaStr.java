import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Arrays;

public class StrokaStr {

    public static void main(String[] args) {
        String str = "Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                " альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...\n\n";
        System.out.print(str);
        //System.out.println();
        String mass[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            mass[i] = str.substring(i, i + 1);
            if (i % 2 == 0)
                System.out.print(mass[i]);                      //вывод каждого четного символа
        }
        System.out.println();
        String word[] = str.split("альбом");
        System.out.print("Кол-во слов \"альбом\" в строке = ");
        System.out.print(word.length-1);
        System.out.println();
        System.out.println();
        System.out.println(str.replace("В",";)"));              //замена буквы В на смайлик
        }

}





