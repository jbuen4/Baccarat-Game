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
	private BaccaratDealer theDealer = new BaccaratDealer();
	private BaccaratGameLogic gameLogic = new BaccaratGameLogic(theDealer);
	private double currentBet;
	private double totalWinnings;
	private String betChoice;

	MenuBar menuBar;

	// Create an "Options" menu
	Menu optionsMenu;
	MenuItem exit;
	MenuItem freshStart;
	Button dealerOpt, playerOpt, drawOpt, startButton, dealerCard1, dealerCard2, dealerCard3, playerCard1, playerCard2, playerCard3;
	Text displayWinnings;
	Text betInstructions;
	TextField betAmount;
	EventHandler betHandler;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Baccarat Game");
		totalWinnings = 0;

		menuBar = new MenuBar();
		optionsMenu = new Menu("Options");
		exit = new MenuItem("Exit");
		freshStart = new MenuItem("Fresh start");
		optionsMenu.getItems().addAll(exit, freshStart);
		menuBar.getMenus().add(optionsMenu);

		displayWinnings = new Text("Current winnings: $" + totalWinnings);
		displayWinnings.setFont(Font.font("arial",30));
		displayWinnings.setFill(Color.WHITE);
		startButton = new Button("Press this button \nto start the game!");
		startButton.setPrefSize(330, 150);
		startButton.setStyle("-fx-background-color: red");
		Font boldFont = Font.font(startButton.getFont().getFamily(), FontWeight.BOLD, 20);
		startButton.setFont(boldFont);
		startButton.setTextFill(Color.WHITE);

		dealerOpt = new Button("Banker");
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

		dealerCard1 = new Button();
		dealerCard1.setPrefSize(100,150);
		 dealerCard2 = new Button();
		dealerCard2.setPrefSize(100,150);
		 dealerCard3 = new Button();
		dealerCard3.setPrefSize(100, 150);
		 playerCard1 = new Button();
		playerCard1.setPrefSize(100,150);
		 playerCard2 = new Button();
		playerCard2.setPrefSize(100,150);
		 playerCard3 = new Button();
		playerCard3.setPrefSize(100,150);

		freshStart.setOnAction(e->{
			totalWinnings = 0;
			currentBet = 0;
			betAmount.setText("Enter bet amount");
			dealerOpt.setDisable(true);
			playerOpt.setDisable(true);
			drawOpt.setDisable(true);
//			bankerCards =null;
//			playerCards = null;
			displayWinnings.setText("Current winnings: $" + totalWinnings);
			primaryStage.setScene(createControlScene());
		});

		Scene scene = createControlScene();
		primaryStage.setScene(scene);
		primaryStage.show();


	}


	public Scene createControlScene() {

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(20));


//		menuBar = new MenuBar();
//		optionsMenu = new Menu("Options");
//		exit = new MenuItem("Exit");
//		freshStart = new MenuItem("Fresh start");
//		optionsMenu.getItems().addAll(exit, freshStart);
//		menuBar.getMenus().add(optionsMenu);
//
//		displayWinnings = new Text("Current winnings: $" + totalWinnings);
//		displayWinnings.setFont(Font.font("arial",30));
//		displayWinnings.setFill(Color.WHITE);
//		Button startButton = new Button("Press this button \nto start the game!");
//		startButton.setPrefSize(330, 150);
//		startButton.setStyle("-fx-background-color: red");
//		Font boldFont = Font.font(startButton.getFont().getFamily(), FontWeight.BOLD, 20);
//		startButton.setFont(boldFont);
//		startButton.setTextFill(Color.WHITE);
//		VBox top = new VBox(menuBar, displayWinnings);
//
//		dealerOpt = new Button("Dealer");
//		playerOpt = new Button("Player");
//		drawOpt = new Button("Draw");
//		dealerOpt.setPrefSize(100, 100);
//		playerOpt.setPrefSize(100, 100);
//		drawOpt.setPrefSize(100, 100);
//		dealerOpt.setDisable(true);
//		playerOpt.setDisable(true);
//		drawOpt.setDisable(true);
//		dealerOpt.setStyle("-fx-background-color: red");
//		playerOpt.setStyle("-fx-background-color: red");
//		drawOpt.setStyle("-fx-background-color: red");
//		dealerOpt.setTextFill(Color.WHITE);
//		playerOpt.setTextFill(Color.WHITE);
//		drawOpt.setTextFill(Color.WHITE);
//		betAmount = new TextField();
//		betAmount.setPromptText("Enter bet amount");
//		betAmount.setDisable(true);
//		betAmount.setPrefSize(200, 40);
//
//		betInstructions = new Text("After placing bet amount, bet by \npressing one of the buttons below");
//		Font bF = Font.font(betInstructions.getFont().getFamily(), FontWeight.BOLD, 30);
//		betInstructions.setFont(bF);
//		betInstructions.setFill(Color.WHITE);
//
//		Button dealerCard1 = new Button();
//		dealerCard1.setPrefSize(100,150);
//		Button dealerCard2 = new Button();
//		dealerCard2.setPrefSize(100,150);
//		Button dealerCard3 = new Button();
//		dealerCard3.setPrefSize(100, 150);
//		Button playerCard1 = new Button();
//		playerCard1.setPrefSize(100,150);
//		Button playerCard2 = new Button();
//		playerCard2.setPrefSize(100,150);
//		Button playerCard3 = new Button();
//		playerCard3.setPrefSize(100,150);
		HBox dealersHand = new HBox(20,dealerCard1,dealerCard2,dealerCard3);
		HBox playersHand = new HBox(20,playerCard1,playerCard2,playerCard3);
		HBox hands = new HBox(50,dealersHand,playersHand);
		VBox top = new VBox(menuBar, displayWinnings);


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

		betHandler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentBet = Double.parseDouble(betAmount.getText());
				betChoice = ((Button)event.getSource()).getText();
				drawOpt.setDisable(true);
				playerOpt.setDisable(true);
				dealerOpt.setDisable(true);
				betAmount.setDisable(true);
				bankerHand = theDealer.dealHand();
				playerHand = theDealer.dealHand();

				String whoWon = gameLogic.whoWon(bankerHand, playerHand);

				if(bankerHand.size() == 2)
					dealerCard3.setVisible(false);

				if(playerHand.size() == 2)
					playerCard3.setVisible(false);



				dealerCard1.setText(bankerHand.get(0).getValue() + " of " + bankerHand.get(0).getSuite());
				dealerCard2.setText(bankerHand.get(1).getValue() + " of " + bankerHand.get(1).getSuite());
				playerCard1.setText(playerHand.get(0).getValue() + " of " + playerHand.get(0).getSuite());
				playerCard2.setText(playerHand.get(1).getValue() + " of " + playerHand.get(1).getSuite());

				if(playerHand.size() == 3)
					playerCard3.setText(playerHand.get(2).getValue() + " of " + playerHand.get(2).getSuite());
				if(bankerHand.size() == 3)
					dealerCard3.setText(bankerHand.get(2).getValue() + " of " + bankerHand.get(2).getSuite());


				if(whoWon.equals("Banker wins") && betChoice.equals("Banker")){
					totalWinnings = totalWinnings + (currentBet * .95) ;
				}
				else if(whoWon.equals("Player wins") && betChoice.equals("Player")){
					totalWinnings = totalWinnings + currentBet;
				}
				else if(whoWon.equals("Draw") && betChoice.equals("Draw")){

				}
				else{
					totalWinnings = totalWinnings - currentBet;
					if(totalWinnings < 0)
						totalWinnings = 0;
				}
				displayWinnings.setText("Current winnings: $" + totalWinnings);
				System.out.println(whoWon + "!");
				pane.setCenter(hands);
			}
		};
		drawOpt.setOnAction(betHandler);
		playerOpt.setOnAction(betHandler);
		dealerOpt.setOnAction(betHandler);
		return new Scene(pane, 850, 750);
	}


}
