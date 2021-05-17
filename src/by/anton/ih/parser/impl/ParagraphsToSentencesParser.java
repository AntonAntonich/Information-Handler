package by.anton.ih.parser.impl;

import by.anton.ih.composite.TextComponent;
import by.anton.ih.composite.TextComponentImpl;
import by.anton.ih.composite.TextComponentLevel;
import by.anton.ih.parser.AbstractParser;
import by.anton.ih.util.CopyData;

public class ParagraphsToSentencesParser extends AbstractParser {
    private static final String PARAGRAPH_SENTENCE_SEPARATOR =
            "^\\s?[A-Z].*(\\.|\\!|\\?)$";
    @Override
    public TextComponent parse(TextComponent component) {
        TextComponentImpl paragraphComponent = (TextComponentImpl) component;
        TextComponentImpl sentencesComponent = new TextComponentImpl();
        CopyData.copyDataTextComponents(paragraphComponent, sentencesComponent, PARAGRAPH_SENTENCE_SEPARATOR);
        paragraphComponent.setTextComponentLevel(TextComponentLevel.SENTENCE);
        return sentencesComponent;
    }
}
