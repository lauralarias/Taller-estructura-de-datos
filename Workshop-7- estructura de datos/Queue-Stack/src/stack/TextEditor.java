package stack;

import java.util.Stack;
import java.util.Scanner;

public class TextEditor {
    Stack<String> actions;
    StringBuilder text;

    public TextEditor() {
        this.actions = new Stack<>();
        this.text = new StringBuilder();
    }

    public void write(String word) {
        this.actions.push(word);
        this.text.append(word).append(" ");
    }

    public String undo() {
        if (!this.actions.isEmpty()) {
            String lastWord = this.actions.pop();
            int lastIndex = this.text.lastIndexOf(lastWord);
            this.text.delete(lastIndex, lastIndex + lastWord.length() + 1); // +1 to remove the trailing space
            return lastWord;
        } else {
            return "";
        }
    }

    public void printText() {
        System.out.println(this.text.toString().trim()); // Trim to remove the trailing space
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String texto = sc.next();

            if (texto.equals("-1")) {
                String removedWord = te.undo();
                if (!removedWord.isEmpty()) {
                    System.out.println("Undid: " + removedWord);
                } else {
                    System.out.println("No actions to undo.");
                }
            } else if (texto.equals("+print")) {
                te.printText();
            } else {
                te.write(texto);
            }
        }
    }
}
