package by.anton.ih.parser;

import by.anton.ih.composite.TextComponent;

public abstract class AbstractParser {

    AbstractParser nextParser;

    public void setNextParser(AbstractParser nextParser) {
        this.nextParser = nextParser;
    }

    public void chain(TextComponent textComponent) {
        TextComponent nextComponent = this.parse(textComponent);
        nextParser.chain(nextComponent);
        textComponent.add(nextComponent);
    }

    public abstract TextComponent parse(TextComponent textComponent);
}
