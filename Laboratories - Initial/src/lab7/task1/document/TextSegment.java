package lab7.task1.document;

import lab7.task1.DocumentVisitor;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment {
    private String content;
    public String changedContent;

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getChangedContent() {
        return changedContent;
    }
    public void setChangedContent(String changedContent) {
        this.changedContent = changedContent;
    }
    public abstract void acceptDoku(DocumentVisitor doku);
    public abstract void acceptMark(DocumentVisitor mark);
}
