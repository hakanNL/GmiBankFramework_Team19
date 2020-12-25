package utilities;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pojos.Customer;
import pojos.UserManagement;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class PdfGenerator {
    public static void createTableWithPojo(String filePath, List<UserManagement> allUserPojo) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            Image img = Image.getInstance("team Of Tiger.png");
            img.setAlignment(1);
            img.setWidthPercentage(2f);
            document.add(img); // ust banner ekle resim
            document.add(new Paragraph(" "));
            Font baslikFont = new Font(Font.FontFamily.COURIER, 15, Font.BOLD);
            Phrase baslik = new Phrase("USER NAME AND ROLES", baslikFont);
            Paragraph para = new Paragraph(baslik);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(new Paragraph(" "+" ")); // bir satir bos birak
            Phrase date = new Phrase(DateUtil.todaysDate()); // PDF Date
            Paragraph datePara = new Paragraph(date);
            datePara.setAlignment(Element.ALIGN_RIGHT);
            datePara.setSpacingAfter(10); // Date bottom space
            document.add(datePara);
            document.add(new Paragraph(" "+" ")); // bir satir bos birak
            float[] cellWidth = {1f, 1f, 1f}; // cell width
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD);
            PdfPTable table1 = new PdfPTable(cellWidth);
            table1.setWidthPercentage(100f); // table with percentage
            table1.setHorizontalAlignment(Element.ALIGN_LEFT);// alignment
            Phrase userName = new Phrase("FIRST NAME", boldFont);
            Phrase userLastname = new Phrase("LAST NAME", boldFont);
            Phrase userRole = new Phrase("USER ROLE", boldFont);
            table1.addCell(userName);    // header 1
            table1.addCell(userLastname); // header 2
            table1.addCell(userRole); // header 3
            for (int i = 0; i < allUserPojo.size(); i++) {
                for (String w : allUserPojo.get(i).getAuthorities()) {
                    table1.addCell(allUserPojo.get(i).getFirstName());
                    table1.addCell(allUserPojo.get(i).getLastName());
                    table1.addCell(w);
                }
            }
            document.add(table1);
            document.add(new Paragraph(" ")); // bir satir bos birak
            document.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Pdf file created");
    }
    public static void pdfGeneratorRowsAndCellsWithList(String header, List <Customer> list, String fileName) {
        try {
            Document document = new Document();
            String pdf_path = fileName;
            String pdf_title = header;
            String logo_path = "team Of Tiger.png";
            List<String> headers = new ArrayList<String>();
            headers.add("First Name");
            headers.add("Last Name");
            headers.add("SSN");
            headers.add("City");
            headers.add("Mail");
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_path));
            document.open();
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(110);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            float[] colWidth = {2, 2, 2, 2, 2};
            table.setWidths(colWidth);
            for (int i = 0; i < headers.size(); i++) {
                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);
            }
            table.setHeaderRows(list.size());
            for (int i = 0; i < list.size(); i++) {
                table.addCell(list.get(i).getFirstName());
                table.addCell(list.get(i).getLastName());
                table.addCell(list.get(i).getSsn());
                table.addCell(list.get(i).getCity());
                table.addCell(list.get(i).getEmail());
            }
            Image img = Image.getInstance(logo_path);
            img.setAlignment(1);
            document.add(img);
            document.add(new Paragraph(" "+" ")); // bir satir bos birak
            document.add(new Paragraph(" "+" ")); // bir satir bos birak
            document.add(new Paragraph("                                                       " + pdf_title));
            document.add(table);
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createTableWithListMapDB(String filePath, List<Map<String, String>> allQueryData, List<Map<String, String>> count) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            Image img = Image.getInstance("team Of Tiger.png");
            img.setAlignment(1);
            img.setWidthPercentage(100f);
            document.add(img); // ust banner ekle resim
            Font baslikFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Phrase baslik = new Phrase("GLOBAL TEAM PDF DOCUMENT", baslikFont); // PDF header
            Paragraph para = new Paragraph(baslik);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            Phrase date = new Phrase(DateUtil.todaysDate()); // PDF Date
            Paragraph datePara = new Paragraph(date);
            datePara.setAlignment(Element.ALIGN_RIGHT);
            datePara.setSpacingAfter(10); // Date bottom space
            document.add(datePara);
//            document.add(new Paragraph(" ")); // bir satir bos birak
            float[] cellWidth = {0.5f, 0.5f, 1.05f, 0.7f, 0.75f}; // cell width
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD);
            PdfPTable tableCount = new PdfPTable(cellWidth);
            tableCount.setWidthPercentage(100f); // table with percentage
            tableCount.setHorizontalAlignment(Element.ALIGN_LEFT);// alignment
            Phrase admin = new Phrase(" ADMIN", boldFont);
            Phrase employee = new Phrase("EMPLOYEE", boldFont);
            Phrase customer = new Phrase("CUSTOMER", boldFont);
            Phrase user = new Phrase("USER", boldFont);
            Phrase manager = new Phrase("MANAGER", boldFont);
            tableCount.addCell(admin);    // header 1
            tableCount.addCell(employee); // header 2
            tableCount.addCell(customer); // header 3
            tableCount.addCell(user); // header 4
            tableCount.addCell(manager); // header 5
            for (int i = 0; i <count.size() ; i++) {
                tableCount.addCell(count.get(i).get("role_count"));
            }
            document.add(tableCount); // first table finished here
            document.add(new Paragraph(" ")); // bir satir bos birak
            PdfPTable table1 = new PdfPTable(cellWidth);
            table1.setWidthPercentage(100f); // table with percentage
            table1.setHorizontalAlignment(Element.ALIGN_LEFT);// alignment
            Phrase userName = new Phrase("FIRST NAME", boldFont);
            Phrase userLastname = new Phrase("LAST NAME", boldFont);
            Phrase email = new Phrase("EMAIL", boldFont);
            Phrase loginName = new Phrase("USER NAME", boldFont);
            Phrase userRole = new Phrase("USER ROLE", boldFont);
            table1.addCell(userName);    // header 1
            table1.addCell(userLastname); // header 2
            table1.addCell(email); // header 2
            table1.addCell(loginName); // header 3
            table1.addCell(userRole); // header 3
            for (int i = 0; i < allQueryData.size(); i++) {
                table1.addCell(allQueryData.get(i).get("first_name"));
                table1.addCell(allQueryData.get(i).get("last_name"));
                table1.addCell(allQueryData.get(i).get("email"));
                table1.addCell(allQueryData.get(i).get("login"));
                table1.addCell(allQueryData.get(i).get("authority_name"));
            }
            document.add(table1);
//            document.add(new Paragraph(" ")); // bir satir bos birak
            document.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Pdf file created");
    }
}