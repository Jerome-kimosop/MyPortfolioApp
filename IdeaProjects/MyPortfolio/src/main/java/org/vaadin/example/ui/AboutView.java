package org.vaadin.example.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("about")
public class AboutView extends AppLayout {
    public AboutView(){
        HorizontalLayout hlayout = new HorizontalLayout();
        Paragraph about = new Paragraph();
        about.setText("My name is Jerome Kimosop, a Software developer based in Nairobi, Kenya.");
        about.setText("I am currently looking for Junior or Entry level role in any Tech company with passionate to build my skills. ");
        about.setText("My tech specialization is Java and Spring Boot with Vaadin, Html and CSS for frontend development.");
        about.setText("I will keep on learning new Technologies not forgeting JavaScript and its frameworks.");
        about.setText("Thank You.");
        hlayout.add(about);
        addToDrawer(hlayout);

    }
}
