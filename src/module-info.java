module figuras {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens  figuras to javafx.graphics, javafx.fxml;
}
