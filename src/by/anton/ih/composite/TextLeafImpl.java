package by.anton.ih.composite;

import java.util.HashMap;
import java.util.Map;

public class TextLeafImpl implements TextComponent{
    private static final String LOG_MESSAGE = "Cant add to or remove from indivisible element";
    private Map<SymbolLeafType, Character> symbolsMap = new HashMap<>();

    private SymbolLeafType symbolType;
    private char symbol;

    public void setSymbolType(SymbolLeafType symbolType) {
        this.symbolType = symbolType;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void put() {
        symbolsMap.put(symbolType, symbol);
    }

    @Override
    public void add(TextComponent component) {
        throw new UnsupportedOperationException(LOG_MESSAGE);
    }

    @Override
    public void remove(TextComponent component) {
        throw new UnsupportedOperationException(LOG_MESSAGE);
    }

    @Override
    public void action() {

    }
}
