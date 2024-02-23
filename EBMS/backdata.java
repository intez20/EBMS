package ebms;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class backdata {
    static void back(String url,String filename) throws IOException, ClassNotFoundException, SQLException, WriteException, BiffException{
        Connection con=connDb.conLink();
        PreparedStatement stmt=con.prepareStatement(url);
        ResultSet rs=stmt.executeQuery();
        WritableSheet sh;
        WritableWorkbook myxl;
        File f1=new File("backup");
        File f2=new File("backup\\"+filename);
        f2.setWritable(true);
        byte i,j=0; Label l;
        ResultSetMetaData rsmd=rs.getMetaData();
        f1.mkdir();
        myxl=Workbook.createWorkbook(f2);
        sh=myxl.createSheet("mysheet",0);
        for(i=0;i<rsmd.getColumnCount();i++){
            l=new Label(i,0,rsmd.getColumnName(i+1));
            sh.addCell(l);
        }
        while(rs.next()){
            ++j;
        for(i=0;i<rsmd.getColumnCount();i++){
            if(rsmd.getColumnTypeName(i+1).equalsIgnoreCase("blob"))
                 l=new Label(i,j,"s"+rs.getBlob(i+1));
                 
            else
                l=new Label(i,j,"s"+rs.getString(i+1));
                sh.addCell(l);
            }
        }
        myxl.write();
        myxl.close();
        f2.setReadOnly();
    }
}
