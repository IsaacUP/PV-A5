/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author isaac
 */
public class Factorial extends Application {
    
    @Override
    public void start(Stage primaryStage) {        
        Label etiqueta = new Label("Numero");
        etiqueta.setAlignment(Pos.CENTER);
        etiqueta.setText("Numero");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 400, 400);
        grid.add(etiqueta, 0 , 1);
        
        TextField numero = new TextField();
        grid.add(numero, 1, 1);
        
        Label resultado = new Label();
        grid.add(resultado, 2, 1);
        
        Button factorial = new Button("Factorial");
        grid.add(factorial, 1, 2);
        factorial.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int suma = 1;
                for(int i = Integer.valueOf(numero.getText()) ;i>=1; i--){
                    suma *= i;
                }
                resultado.setText(String.valueOf(suma));
            }
        });
        
        primaryStage.setTitle("Factorial");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
