/* Jonathan Rumley
 * CSC240 - Seely
 * 08/07/21
 * M5 - Program JavaFX Random Matrix
 * (Create a graphic binary matrix using random numbers and JavaFX)
 */
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class m5ProgramJavaFXRandomMatrix extends Application{
	
GridPane myGrid = new GridPane();
	
    public static void main(String[] args) {
    	
    	launch(args);

    }
	
    public void start(Stage primaryStage) throws Exception {

        //Set title
    	primaryStage.setTitle("Random Matrix Generator - Binary");
        
        //Create grid and buttons panes
        BorderPane mainPane = new BorderPane();
        
        GridPane mytopButtons = new GridPane();
        GridPane mybotButtons = new GridPane();
        
        //Center top buttons and center them
        mytopButtons.setAlignment(Pos.CENTER);
        
        //Create reset all to 0 button
        Button resetAllzero = new Button ("Reset All to 0");
        mytopButtons.add(resetAllzero, 5,0);

        //Create event that sets all numbers to 0
        resetAllzero.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                for (int i = 0; i < 10; i++){
                    for (int j = 0; j < 10; j++){
                        TextField text1 = new TextField(Integer.toString(0)); 
                            //adds text to grid, non-editable and centered
                            myGrid.add(text1, i, j);
                            text1.setEditable(false);
                            text1.setAlignment(Pos.CENTER);
            }
        }}});
        
        //Create reset all to 1 button
        Button resetAllone = new Button ("Reset All to 1");
        mytopButtons.add(resetAllone, 10,0);

        //Create event that sets all numbers to 1
        resetAllone.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                for (int i = 0; i < 10; i++){
                    for (int j = 0; j < 10; j++){
                        TextField text1 = new TextField(Integer.toString(1)); 
                            //adds text to grid, non-editable and centered
                            myGrid.add(text1, i, j);
                            text1.setEditable(false);
                            text1.setAlignment(Pos.CENTER);
            }
        }}});
        
        //Create reset all randomly
        Button resetRandomly = new Button ("Reset All Randomly");
        mytopButtons.add(resetRandomly, 15,0);

        //Create event that resets all numbers randomly
        resetRandomly.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
            	matrix();
            	
            	}});
        
        //Quits program
        Button quit = new Button ("Quit");
        mytopButtons.add(quit, 20,0);

        //Create event that quits program
        quit.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
            	Platform.exit();
            }});
        
        //Button and grid layout/size for the primary stage
        mainPane.setTop(mytopButtons);
        mainPane.setCenter(myGrid);
        mainPane.setBottom(mybotButtons);
            
        Scene scene = new Scene(mainPane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        matrix();
   
    }
    
    public void matrix() {
    	//Randomly sets all numbers in the grid to either 0 or 1 on launch
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                TextField text1 = new TextField(Integer.toString((int)(Math.random() * 2))); 
                //adds text to grid, non-editable and centered
                myGrid.add(text1, i, j);
                text1.setEditable(false);
                text1.setAlignment(Pos.CENTER);
            }
        }
    }
}