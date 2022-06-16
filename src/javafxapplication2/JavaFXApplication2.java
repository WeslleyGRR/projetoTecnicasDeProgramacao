/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication2;

import Service.ClienteService;
import view.CadastroCliente;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.SwingUtilities;
import view.CadastroCliente;
import view.Home;
import view.Opcoes;

/**
 *
 * @author wesll
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        SwingUtilities.invokeLater(() ->{
            Opcoes opcoes = new Opcoes();
            opcoes.setVisible(true);
        });
       
       
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
