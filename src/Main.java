
import org.jsoup.*;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) {
        String url = "http://edu.msu.ru/mfk/register.php?mfk=";
        String studentName = "Иванов И.";
        int mfkNumber = 1;
        Document doc;

        while (mfkNumber < 435){
            try {
                Thread.sleep(20);
                doc = Jsoup.connect(url+mfkNumber).get();
                if(doc.outerHtml().contains(studentName) && doc.outerHtml().contains("Запись на межфакультетский учебный курс") ){
                    System.out.println(url+mfkNumber);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            mfkNumber++;
        }


    }

}
