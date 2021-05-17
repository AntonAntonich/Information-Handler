package by.anton.ih.composite;

import java.util.ArrayList;
import java.util.List;

public class TextComponentImpl implements TextComponent{
    private TextComponentLevel textComponentLevel;
    private List<TextComponent> textComponentList = new ArrayList<>();
    private List<String> textElements = new ArrayList<>();
    private int textElementSize;

    public TextComponentLevel getTextComponentLevel() {
        return textComponentLevel;
    }

    public void setTextComponentLevel(TextComponentLevel textComponentLevel) {
        this.textComponentLevel = textComponentLevel;
    }

    public void addTextElement(String element) {
        textElements.add(element);
    }

    public boolean removeTextElement(String element) {
        return textElements.remove(element);
    }

    public String getTextElement(int index) {
        return textElements.get(index);
    }

    public int getTextElementSize() {
        return textElementSize;
    }

    public void setTextElementSize(int i) {
        textElementSize = i;
    }

    @Override
    public void add(TextComponent component) {
        textComponentList.add(component);
    }

    @Override
    public void remove(TextComponent component) {
        textComponentList.remove(component);
    }

    @Override
    public void action() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TextComponentImpl{");
        sb.append("textComponentLevel=").append(textComponentLevel);
        sb.append('}');
        return sb.toString();
    }
}
