package lab7.task1;

import lab7.task1.document.DokuWikiVisitor;
import lab7.task1.document.MarkdownVisitor;
import lab7.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator{

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        StringBuilder finalText = new StringBuilder();
        DocumentVisitor v = new DokuWikiVisitor();

        for (TextSegment text : textSegments) {
            text.acceptDoku(v);
            finalText.append(text.getChangedContent());
        }
        return finalText;
    }

    public StringBuilder getMarkdownDocument() {
        StringBuilder finalText = new StringBuilder();
        DocumentVisitor v = new MarkdownVisitor();
        for (TextSegment text: textSegments) {
            text.acceptMark(v);
            finalText.append(text.getChangedContent());
        }
        return finalText;
    }
}
