package by.anton.ih.parser.impl;

import by.anton.ih.composite.TextComponent;
import by.anton.ih.composite.TextComponentImpl;
import by.anton.ih.composite.TextLeafImpl;
import by.anton.ih.parser.AbstractParser;
import by.anton.ih.util.CopySymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeToSymbolParser extends AbstractParser {
;   private static final String SYMBOL_CLASSIFIER = "\\[A-Za-z]";
    @Override
    public TextComponent parse(TextComponent component) {
        TextComponentImpl lexemeComponent = (TextComponentImpl) component;
        TextLeafImpl textLeaf = new TextLeafImpl();
        CopySymbols.copySymbols(lexemeComponent, textLeaf,SYMBOL_CLASSIFIER);
        return textLeaf;
    }
}
