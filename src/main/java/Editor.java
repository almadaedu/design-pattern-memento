class Editor {
    private String content;

    public Editor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorMemento createMemento() {
        return new EditorMemento(content);
    }

    public void restoreMemento(EditorMemento memento) {
        this.content = memento.getSavedContent();
    }
}