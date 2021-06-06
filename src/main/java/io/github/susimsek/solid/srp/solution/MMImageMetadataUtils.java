package io.github.susimsek.solid.srp.solution;

import io.github.susimsek.solid.srp.problem.Metadata;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.net.URL;

@UtilityClass
public class MMImageMetadataUtils {
    public Metadata getMetadata(@NonNull URL url) {
        // TODO: add content in here
        return new Metadata("http://example.com/img.jpg", 100, 100);
    }
}