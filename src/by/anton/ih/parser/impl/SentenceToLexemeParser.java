package by.anton.ih.parser.impl;

import by.anton.ih.composite.TextComponent;
import by.anton.ih.composite.TextComponentImpl;
import by.anton.ih.composite.TextComponentLevel;
import by.anton.ih.parser.AbstractParser;
import by.anton.ih.util.CopyData;

public class SentenceToLexemeParser extends AbstractParser {
    private static final String SENTENCE_TO_LEXEMES_SEPARATOR = "";
    @Override
    public TextComponent parse(TextComponent component) {
        TextComponentImpl sentenceComponent = (TextComponentImpl) component;
        TextComponentImpl lexemesComponent = new TextComponentImpl();
        lexemesComponent.setTextComponentLevel(TextComponentLevel.LEXEME);
        CopyData.copyDataTextComponents(sentenceComponent,lexemesComponent, SENTENCE_TO_LEXEMES_SEPARATOR);
        sentenceComponent.setTextComponentLevel(TextComponentLevel.LEXEME);
        return null;
    }
}
