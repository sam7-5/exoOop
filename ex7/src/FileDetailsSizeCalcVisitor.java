public class FileDetailsSizeCalcVisitor implements FileDetailsVisitor {
    int sumByte = 0;

    public int getSumByte() {
        return sumByte;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {

    }

    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        sumByte += docxFileDetails.getSize();
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        sumByte += htmlFileDetails.getSize();

    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        sumByte += jpgFileDetails.getSize();

    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        sumByte += mp3FileDetails.getSize();

    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        sumByte += pptxFileDetails.getSize();

    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        sumByte += txtFileDetails.getSize();

    }
}
