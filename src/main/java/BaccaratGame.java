import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class BaccaratGame extends Application {

	private ArrayList<Card> playerHand;
	private ArrayList<Card> bankerHand;
	private BaccaratDealer theDealer;
	private BaccaratGameLogic gameLogic;
	private double currentBet;
	private double totalWinnings;
	private String betChoice;

	MenuBar menuBar;

	// Create an "Options" menu
	Menu optionsMenu;
	MenuItem exit;
	MenuItem freshStart;
	Button dealerOpt, playerOpt, drawOpt;
	Text displayWinnings;
	Text betInstructions;
	TextField betAmount;
	EventHandler betHandler;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Baccarat Game");
		totalWinnings = 0;
//		 Rectangle rect = new Rectangle (100, 40, 100, 100);
//	     rect.setArcHeight(50);
//	     rect.setArcWidth(50);
//	     rect.setFill(Color.VIOLET);
//
//	     RotateTransition rt = new RotateTransition(Duration.millis(5000), rect);
//	     rt.setByAngle(270);
//	     rt.setCycleCount(4);
//	     rt.setAutoReverse(true);
//	     SequentialTransition seqTransition = new SequentialTransition (
//	         new PauseTransition(Duration.millis(500)),
//	         rt
//	     );
//	     seqTransition.play();
	     
//	     FadeTransition ft = new FadeTransition(Duration.millis(5000), rect);
//	     ft.setFromValue(1.0);
//	     ft.setToValue(0.3);
//	     ft.setCycleCount(4);
//	     ft.setAutoReverse(true);

//	     ft.play();
//	     BorderPane root = new BorderPane();
//	     root.setCenter(rect);
	     
//	     Scene scene = new Scene(root, 700,700);
		Scene scene = createControlScene();
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}


	public Scene createControlScene() {

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(20));

		menuBar = new MenuBar();
		optionsMenu = new Menu("Options");
		exit = new MenuItem("Exit");
		freshStart = new MenuItem("Fresh start");
		optionsMenu.getItems().addAll(exit, freshStart);
		menuBar.getMenus().add(optionsMenu);

		displayWinnings = new Text("Current winnings: $" + totalWinnings);
		displayWinnings.setFont(Font.font("arial",30));
		displayWinnings.setFill(Color.WHITE);
		Button startButton = new Button("Press this button \nto start the game!");
		startButton.setPrefSize(330, 150);
		startButton.setStyle("-fx-background-color: red");
		Font boldFont = Font.font(startButton.getFont().getFamily(), FontWeight.BOLD, 20);
		startButton.setFont(boldFont);
		startButton.setTextFill(Color.WHITE);
		VBox top = new VBox(menuBar, displayWinnings);

		dealerOpt = new Button("Dealer");
		playerOpt = new Button("Player");
		drawOpt = new Button("Draw");
		dealerOpt.setPrefSize(100, 100);
		playerOpt.setPrefSize(100, 100);
		drawOpt.setPrefSize(100, 100);
		dealerOpt.setDisable(true);
		playerOpt.setDisable(true);
		drawOpt.setDisable(true);
		dealerOpt.setStyle("-fx-background-color: red");
		playerOpt.setStyle("-fx-background-color: red");
		drawOpt.setStyle("-fx-background-color: red");
		dealerOpt.setTextFill(Color.WHITE);
		playerOpt.setTextFill(Color.WHITE);
		drawOpt.setTextFill(Color.WHITE);
		betAmount = new TextField();
		betAmount.setPromptText("Enter bet amount");
		betAmount.setDisable(true);
		betAmount.setPrefSize(200, 40);

		betInstructions = new Text("After placing bet amount, bet by \npressing one of the buttons below");
		Font bF = Font.font(betInstructions.getFont().getFamily(), FontWeight.BOLD, 30);
		betInstructions.setFont(bF);
		betInstructions.setFill(Color.WHITE);
		


		HBox bottom = new HBox(dealerOpt,playerOpt, drawOpt, betAmount);
		VBox bot = new VBox(bottom);
		bot.setSpacing(20);
		bottom.setSpacing(50);
		top.setSpacing(15);
		pane.setTop(top);
		pane.setBottom(bot);
		pane.setCenter(startButton);
		pane.setStyle("-fx-background-color: darkgreen;");

		startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.setCenter(betInstructions);
                dealerOpt.setDisable(false);
                playerOpt.setDisable(false);
                drawOpt.setDisable(false);
                betAmount.setDisable(false);
            }
        });
		return new Scene(pane, 850, 750);
	}
}
