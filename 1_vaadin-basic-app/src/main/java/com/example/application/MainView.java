package com.example.application;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        Button button =new Button("click me");
        DatePicker datepicker = new DatePicker("pick a date");

        HorizontalLayout layout = new HorizontalLayout(button, datepicker);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);

        button.addClickListener(click->add(new Paragraph("clicked :"+datepicker.getValue())));


    }
}
