public interface FileDetailsVisitor {
    public void visit(DirectoryDetails directoryDetails);
    public void visit(DocxFileDetails docxFileDetails);
    public void visit(HtmlFileDetails htmlFileDetails);
    public void visit(JpgFileDetails jpgFileDetails);
    public void visit(Mp3FileDetails mp3FileDetails);
    public void visit(PptxFileDetails pptxFileDetails);
    public void visit(TxtFileDetails txtFileDetails);




}
