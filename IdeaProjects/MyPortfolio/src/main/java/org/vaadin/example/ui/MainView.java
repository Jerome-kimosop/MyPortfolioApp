package org.vaadin.example.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.H1;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        HorizontalLayout layout = new HorizontalLayout();
        Header head = new Header();
        head.setText("My portfolio");
        Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.add(new Tab("PROJECTS"),new Tab("ABOUT"), new Tab("CONTACTS"));
        Div content = new Div();
            content.add("WEB DEVELOPER ON MISSION.");
            content.setSizeFull();
        Button navigateButton = new Button("Go to About",
                e -> UI.getCurrent().navigate("about"));


        layout.add(tabs,navigateButton,content);
        add(head,layout);

    }
}

