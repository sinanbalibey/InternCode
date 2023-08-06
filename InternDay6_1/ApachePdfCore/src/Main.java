import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("D:/pdfDene.pdf");
            PDDocument document = PDDocument.load(file);

            PDFTextStripper pdfStripper = new PDFTextStripper();

            String content = pdfStripper.getText(document);

            int wordCount = countWords(content);

            System.out.println("PDF'de toplam kelime sayısı: " + wordCount);


            document.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    public static int countWords(String text){
        String[] words=text.split("\\s+");
        return words.length;
    }
}