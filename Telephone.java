/**
 * 
 */
package ca.bcit.comp1510.lab9;

import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 * This class defines a simple GUI for password validation.
 * @author adams
 * @version 1.0
 *
 */
public class Telephone extends Application {

    /**
     * Padding around the password form.
     */
    public static final int PANE_PADDING = 20;
    /**
     * Padding around the password form.
     */
    public static final int V_GAP = 2;
    /**
     * Padding around the password form.
     */
    public static final int H_GAP = 3;
    
    /**
     * Label describing num button pressed.
     */
    private Label num;
    
    
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        final int appWidth = 150;
        final int appHeight = 200;
        GridPane grid = new GridPane();
        num = new Label("");
//        submit.setOnAction(this::processValidate);
        
        grid.setPadding(new Insets(PANE_PADDING, PANE_PADDING, 
                PANE_PADDING, PANE_PADDING));
        grid.setVgap(V_GAP);
        grid.setHgap(H_GAP);
        
        grid.add(num, 3, 0);
        for (int i = 1; i <= 12; i++) {
            String b = "" + i;
            if (i == 10) {
                b = "*";
            }
            if (i == 11) {
                b = "0";
            }
            if (i == 12) {
                b = "#";
            }
            Button btn = new Button(b);
            if (i < 4) {
                grid.add(btn, i, 1);
            }
            if (i >= 4 && i < 7) {
                grid.add(btn, i - 3, 2);
            }
            if (i >= 7 && i < 10) {
                grid.add(btn, i - 6, 3);
            }
            if (i >= 10 && i < 13) {
                grid.add(btn, i - 9, 4);
            }
            btn.setOnAction(this::processValidate);
            
        }
        
        Scene scene = new Scene(grid, appWidth, appHeight);
        primaryStage.setTitle("Phone");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Drives the program.
     * @param args
     *            unused
     */       
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }
    
    /**
     * prints the contents of the EmailPane when invoked.
     * @param event invokes this method
     */
    public void processValidate(ActionEvent event) {
        String txt = ((Button) event.getSource()).getText();
        this.num.setText(txt);
    }
}
    
    
    
    
    
    
