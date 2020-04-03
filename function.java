package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class function {
	@FXML
	private DatePicker d;
	
	@FXML
	private Label l;
	
	public void show(ActionEvent e)
	{
		LocalDate f=d.getValue();
		l.setText(f.toString());
		
		
	}

}
