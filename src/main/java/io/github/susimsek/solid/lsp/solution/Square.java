package io.github.susimsek.solid.lsp.solution;

public class Square extends Shap {

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