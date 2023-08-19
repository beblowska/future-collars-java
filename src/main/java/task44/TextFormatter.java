package task44;

interface TextFormatter {
    String formatText(String text);
}

class UppercaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        return text.toUpperCase();
    }
}

class LowercaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}