package by.anton.ih.parser.impl;

import by.anton.ih.composite.TextComponent;
import by.anton.ih.composite.TextComponentImpl;
import by.anton.ih.composite.TextComponentLevel;
import by.anton.ih.parser.AbstractParser;
import by.anton.ih.util.CopyData;

public class TextToParagraphParser extends AbstractParser {
    private static final String TEXT_PARAGRAPH_SEPARATOR = "\\s{4}";

    @Override
    public TextComponent parse(TextComponent component) {
        TextComponentImpl textComponent = (TextComponentImpl) component;
        TextComponentImpl paragraphComponent = new TextComponentImpl();
        CopyData.copyDataTextComponents(textComponent,paragraphComponent,TEXT_PARAGRAPH_SEPARATOR);
        paragraphComponent.setTextComponentLevel(TextComponentLevel.PARAGRAPH);
        return paragraphComponent;
    }

}
