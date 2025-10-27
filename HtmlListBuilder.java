import java.util.*;

public class HtmlListBuilder{
    public static void main(String [] args){
        String [] items = {"Apple", "Banana", "Orange"};

        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append("<ul>");

        for (String item: items){
            htmlBuilder.append("<li>");
            htmlBuilder.append(item);
            htmlBuilder.append("</li>");
        }

        htmlBuilder.append("</ul>");

        String htmlString = htmlBuilder.toString();
        System.out.println(htmlString);
    }
}