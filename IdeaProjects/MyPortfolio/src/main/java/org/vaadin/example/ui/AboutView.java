package org.vaadin.example.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("about")
public class AboutView  {
    public AboutView(){
        AppLayout mainLayout = new AppLayout();
        Paragraph about = new Paragraph();
        about.setText("My name is Jerome Kimosop, a Software developer based in Nairobi, Kenya.I am currently looking for Junior or Entry level role in any Tech company with passionate to build my skills.");
        Button navigateButton = new Button("Go to MainView",
                e -> UI.getCurrent().navigate("/"));
        H1 header = new H1("JEROME KAPKOR KIMOSOP");
        mainLayout.setContent(about);
        mainLayout.addToNavbar(header,navigateButton);

    }
}
