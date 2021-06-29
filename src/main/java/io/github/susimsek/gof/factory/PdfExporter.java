package io.github.susimsek.gof.factory;

import io.github.susimsek.gof.factory.FileExporter;

// cannot be access package
// internal package inside
// private class
class PdfExporter implements FileExporter {

    @Override
    public String export(String content) {
        return "Pdf -> " + content;
    }
}
