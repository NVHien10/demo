module com.dmp.hienw {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dmp.hienw to javafx.fxml;
    exports com.dmp.hienw;
}
