package io.github.susimsek.solid.lsp.problem;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Square extends Rectangle {

    @Override
    public void setWidth(Integer width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(Integer height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}