package eu.wodrobina.Todos_vaadin;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class TodoItemLayout extends HorizontalLayout{

    private final CheckBox done;
    private final TextField text;

    public TodoItemLayout(Todo todo) {
        done = new CheckBox();
        text = new TextField();

        addComponents(done, text);
    }
}
