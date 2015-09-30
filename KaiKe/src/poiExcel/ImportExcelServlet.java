package poiExcel;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServlet;

public class ImportExcelServlet extends HttpServlet{
	File tempPathFile;
	//上传路径
	String uploadTo = "d:\\";
	//上传文件类型
	String[] fileType = {".xls"};
	 //格式化日期  
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
    




}
