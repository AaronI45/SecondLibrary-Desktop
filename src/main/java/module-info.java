module secondlibrary.secondlibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.base;
    requires java.logging;
    requires org.json;

    opens secondlibrary.main to javafx.fxml;
    exports secondlibrary.main;
    exports secondlibrary.controller;
    opens secondlibrary.controller to javafx.fxml;
}