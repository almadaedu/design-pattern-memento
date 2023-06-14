class EditorMemento {
    private final String savedContent;

    public EditorMemento(String content) {
        this.savedContent = content;
    }

    public String getSavedContent() {
        return savedContent;
    }
}