module com.chessfx.chessfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chessfx.chess to javafx.fxml;
    exports com.chessfx.chess;
}