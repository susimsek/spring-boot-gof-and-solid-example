package io.github.susimsek.solid.srp.problem;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

/*
A class should have one and only one reason to change, meaning that a class should have only one job.
Therefore, we should create three classes: MMImageMetadataUtils.java, MMQRCodeUtils.java, and MMCsvUtils.
java to guarantee code abide by SRP.
 */
@UtilityClass
public class MMCommonUtils {
    public Metadata getMetadata(@NonNull URL url) {
        // TODO: add content in here
        return new Metadata("http://example.com/img.jpg", 100, 100);
    }

    public String createCsv(@NonNull List<String> csvHeaders,
                                   @NonNull List<List<Serializable>> reports) {
        // TODO: add content in here
        return "";
    }

    public String createQrCode(@NonNull String str) {
        // TODO: add content in here
        return "";
    }
}