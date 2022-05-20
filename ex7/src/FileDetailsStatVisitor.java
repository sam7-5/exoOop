public class FileDetailsStatVisitor implements FileDetailsVisitor{
    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
    System.out.println("The file "+ docxFileDetails.getName()+" has an average of "+docxFileDetails.getWords()/docxFileDetails.getPages() +" words per page.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file "+ htmlFileDetails.getName()+" contains "+htmlFileDetails.getLines()+" lines.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {

    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {

    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {

    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {

    }
}
