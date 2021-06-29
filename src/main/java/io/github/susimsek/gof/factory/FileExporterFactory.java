package io.github.susimsek.gof.factory;

public class FileExporterFactory {

   public static FileExporter getInstance(FileType fileType) {
        switch (fileType){
            case PDF: return new ExcelExporter();
            case EXCEL: return new PdfExporter();
            default: throw new UnsupportedOperationException();
        }
    }
}
