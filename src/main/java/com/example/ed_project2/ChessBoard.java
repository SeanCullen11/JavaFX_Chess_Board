package com.example.ed_project2;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ChessBoard extends Application
{
    final GridPane board = new GridPane();
    final int size = 8;
    StackPane tile;

    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(board, 320, 320);
        colorBoard();
        setupBoard();
        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void colorBoard(){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col ++){
                tile = new StackPane();
                if ((row + col) % 2 == 0){
                    tile.setStyle("-fx-background-color:white");
                }
                else{
                    tile.setStyle("-fx-background-color:gray");
                }
                board.add(tile, col, row);
            }
        }

        for (int x = 0; x < size; x++){
            board.getColumnConstraints().add(new ColumnConstraints(0, 320, Double.MAX_VALUE,
                    null, HPos.CENTER, true));
            board.getRowConstraints().add(new RowConstraints(0, 320, Double.MAX_VALUE,
                    null, VPos.CENTER, true));
        }
    }

    public void setupBoard() {
        Image blackRook = new Image("file:images/BlackRook.png");
        Image blackKnight = new Image("file:images/BlackKnight.png");
        Image blackBishop = new Image("file:images/BlackBishop.png");
        Image blackKing = new Image("file:images/BlackKing.png");
        Image blackQueen = new Image("file:images/BlackQueen.png");
        Image blackPawn = new Image("file:images/BlackPawn.png");

        Image whiteRook = new Image("file:images/WhiteRook.png");
        Image whiteKnight = new Image("file:images/WhiteKnight.png");
        Image whiteBishop = new Image("file:images/WhiteBishop.png");
        Image whiteKing = new Image("file:images/WhiteKing.png");
        Image whiteQueen = new Image("file:images/WhiteQueen.png");
        Image whitePawn = new Image("file:images/WhitePawn.png");

        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                if (col == 0 || col == 7){
                    if (row == 0) {
                        ImageView imv = new ImageView(blackRook);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                    else if(row == 7){
                        ImageView imv = new ImageView(whiteRook);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                }
                if (row == 1){
                    ImageView imv = new ImageView(blackPawn);
                    imv.fitWidthProperty().bind(tile.widthProperty());
                    imv.fitHeightProperty().bind(tile.heightProperty());
                    board.add(imv, col, row);
                }
                if (row == 6){
                    ImageView imv = new ImageView(whitePawn);
                    imv.fitWidthProperty().bind(tile.widthProperty());
                    imv.fitHeightProperty().bind(tile.heightProperty());
                    board.add(imv, col, row);
                }
                if (col == 1 || col == 6){
                    if (row == 0){
                        ImageView imv = new ImageView(blackKnight);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                    else if(row == 7){
                        ImageView imv = new ImageView(whiteKnight);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                }
                if (col == 2 || col == 5){
                    if (row == 0){
                        ImageView imv = new ImageView(blackBishop);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                    if (row == 7){
                        ImageView imv = new ImageView(whiteBishop);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                }
                if (col == 3){
                    if (row == 0){
                        ImageView imv = new ImageView(blackKing);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                    if (row == 7){
                        ImageView imv = new ImageView(whiteKing);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                }
                if (col == 4){
                    if (row == 0){
                        ImageView imv = new ImageView(blackQueen);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                    if (row == 7){
                        ImageView imv = new ImageView(whiteQueen);
                        imv.fitWidthProperty().bind(tile.widthProperty());
                        imv.fitHeightProperty().bind(tile.heightProperty());
                        board.add(imv, col, row);
                    }
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}

