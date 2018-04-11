import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by yolo on 2018/4/8.
 */
public class ExcelData {
    /**
     * @param fileName   excel文件名 
     * @param sheetname   sheet名 
     */
    String fileName=null;
    String caseName=null;
    Workbook workbook = null;
    Sheet sheet = null;
    int rows;
    int columns;
    List<String> arrkey = new ArrayList<String>();
    
/*    public ExcelData(String filename,String sheetname){
        super();
        this.filename = filename;
        this.sheetname= sheetname;
    }*/
    public ExcelData(String fileName, String caseName) {
        super();
        this.fileName = fileName;
        this.caseName = caseName;
    }
    /**
     * 获得excel表中的数据 
     */
    public Object[][] getExcelData() throws BiffException, IOException {

        // 创建输入流  
        File file = new File(getPath());
        InputStream stream = new FileInputStream(file);
        workbook = Workbook.getWorkbook(stream);
        sheet = workbook.getSheet(caseName);
        rows = sheet.getRows();
        columns = sheet.getColumns();
        // 为了返回值是Object[][],定义一个多行单列的二维数组  
        @SuppressWarnings("unchecked")
        HashMap<String, String>[][] arrmap = new HashMap[rows - 1][1];
        // 对数组中所有元素hashmap进行初始化  
        if (rows > 1) {
            for (int i = 0; i < rows - 1; i++) {
                arrmap[i][0] = new HashMap<String, String>();
            }
        } else {
            System.out.println("excel中没有数据");
        }

        // 获得首行的列名，作为hashmap的key值  
        for (int c = 0; c < columns; c++) {
            String cellvalue = sheet.getCell(c,0).getContents();
            arrkey.add(cellvalue);
        }
        // 遍历所有的单元格的值添加到hashmap中  
        for (int r = 1; r < rows; r++) {
            for (int n = 0; n< columns; n++) {
                String cellvalue = sheet.getCell(n, r).getContents();
                arrmap[r - 1][0].put(arrkey.get(n), cellvalue);
            }
        }
        return arrmap;
    }

    /**
     * 获得excel文件的路径 
     * @return
     * @throws IOException
     */
    public String getPath() throws IOException {
        File directory = new File(".");
        String sourceFile = directory.getCanonicalPath() + "\\testcore\\src\\source\\"
                + fileName + ".xls";
        return sourceFile;
    }
}
