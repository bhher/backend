package a1126.Doseo;

public class EBook extends Book {
    private double fileSize; //파일을 크기(mb단위)
    private String format; //파일포멧(예 : pdf , epub)
    public EBook(String title, String author, String iSBN, double fileSize, String format) {
        super(title, author, iSBN);
        this.fileSize = fileSize;
        this.format = format;
    }
    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("file Size: "+ fileSize + "MB");
        System.out.println("Format: " + format);
    }
    
    
    
    
}
