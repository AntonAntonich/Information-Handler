package by.anton.ih.util;

import by.anton.ih.composite.SymbolLeafType;
import by.anton.ih.composite.TextComponent;
import by.anton.ih.composite.TextComponentImpl;
import by.anton.ih.composite.TextLeafImpl;

public class CopySymbols {

    public static void copySymbols(TextComponentImpl lexemeComponent, TextLeafImpl textLeaf, String regex) {
        int size = lexemeComponent.getTextElementSize();
        for(int i = 0; i < size; i++) {
            String current = lexemeComponent.getTextElement(i);
            char [] symbols = new char[current.length()];
            current.getChars(0, current.length(), symbols, 0);
            for(Character character : symbols) {
                classifySymbols(character, textLeaf, regex);
            }
        }
    }

    private static void classifySymbols(Character character, TextLeafImpl textLeaf, String regex) {
        if(character.toString().matches(regex)) {
            textLeaf.setSymbolType(SymbolLeafType.LETTER);
            textLeaf.setSymbol(character);
            textLeaf.put();
        } else {
            textLeaf.setSymbolType(SymbolLeafType.PUNCTUATION_SYMBOL);
            textLeaf.setSymbol(character);
            textLeaf.put();
        }
    }
}
