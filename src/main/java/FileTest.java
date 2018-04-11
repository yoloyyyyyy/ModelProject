import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by yolo on 2018/4/10.
 */
public class FileTest {
    public static void main(String[] args) throws IOException, BiffException {
        File file = new File("C:\\work\\testcase.xls");
        // 创建输入流  
        InputStream stream = new FileInputStream(file);
        Workbook workbook = Workbook.getWorkbook(stream);
        Sheet sheet = workbook.getSheet(0);
        System.out.println(sheet.getCell(1,0).getContents());
        HashMap<String, String> hashMap =   new HashMap<String, String>();
        hashMap.put("name","niko");
        hashMap.put("age","111");
        System.out.println(hashMap.keySet());
        
    }
}

/*
        if(file.exists()) {
                file.delete();
                }else {
                try {
                System.out.println(file.createNewFile());
                } catch (IOException e) {
                e.printStackTrace();
                }
                }*/
