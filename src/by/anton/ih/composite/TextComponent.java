package by.anton.ih.composite;

public interface TextComponent {
    void add(TextComponent component);
    void remove(TextComponent component);
    void action();
}
