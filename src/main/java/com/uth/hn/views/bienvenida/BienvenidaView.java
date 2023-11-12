package com.uth.hn.views.bienvenida;

import com.uth.hn.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Bienvenida")
@Route(value = "bienvenida", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class BienvenidaView extends VerticalLayout {

    public BienvenidaView() {
        setSpacing(false);

        Image img = new Image("https://ibo.pe/blog/wp-content/uploads/2019/09/como-hacen-las-agencias-de-viajes-para-vender-paquetes-turisticos.jpg", "logo");
        img.setWidth("500px");
        add(img);

        H2 header = new H2("--- Sistema de Paquetes Turisticos  --- ");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph("Universidad Tecnológica de Honduras"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
