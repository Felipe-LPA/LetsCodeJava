package com.letsCode;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] board = {
//                Transformar em tabuleiro dinâmico.
                {'_','|','_','|','_'},
                {'_','|','_','|','_'},
                {'_','|','_','|','_'}
        };
        int[] availableField = new int[10];
        boolean victory = isVictory(board);
        int draw = 0;
        boolean end = false;
        printBoard(board);
//
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o player 1 (3)Bot / (4)Humano: " );
        int player1 = sc.nextInt();
        while (player1 < 3 || player1 > 4){
            System.out.println("Determine o player 1 (3)Bot / (4)Humano: " );
            player1 = sc.nextInt();
        }

        System.out.println("Determine o player 2 (3)Bot / (4)Humano: " );
        int player2 = sc.nextInt();
        while (player2 < 3 || player2 > 4){
            System.out.println("Determine o player 2 (3)Bot / (4)Humano: " );
            player2 = sc.nextInt();
        }
        int currentPlayer = 1;

        int victoriousPlayer = currentPlayer;
        while (!end){
            if(currentPlayer == 1){
                if (player1 == 3){
                    turnAI(board, availableField, currentPlayer);
                }else{
                turnPlayer(board, availableField, currentPlayer);
                }
                victoriousPlayer = currentPlayer;
                currentPlayer = 2;
            }else{
                if (player2 == 3){
                    turnAI(board, availableField, currentPlayer);
                }else{
                    turnPlayer(board, availableField, currentPlayer);
                }
                victoriousPlayer = currentPlayer;
                currentPlayer = 1;
        }
        victory = isVictory(board);
        draw++;
        if(victory || draw == 9){
            end = true;
            }
        }
        if (victory) {
            System.out.printf("Player %d ganhou! ", victoriousPlayer);
        }else{
            System.out.println("Jogo empatado");
        }

    }
    static void printBoard(char[][] board){
        System.out.println("###################################");
        for (char[] row: board) {
            for (char column: row) {
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println("###################################");
    }
    static void updateBoard(int position, int player, char[][] board, int[] availableField){
        char character;

        if(player == 1){
            character = 'X';
        }else{
            character = 'O';
        }
            switch (position){
            case 1:
                board[0][0] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 2:
                board[0][2] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 3:
                board[0][4] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 4:
                board[1][0] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 5:
                board[1][2] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 6:
                board[1][4] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 7:
                board[2][0] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 8:
                board[2][2] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            case 9:
                board[2][4] = character;
                printBoard(board);
                availableField[position - 1] = position;
                break;
            default:
                System.out.println("Posição inválida, escolha outra posição!");
                printBoard(board);
                break;
        }


    }
    static void turnAI(char[][] board, int[] availableField, int player){
        Random random = new Random();
        int position = random.nextInt(9);
        while(availableField[position] != 0){
            position = random.nextInt(9);
        }
        updateBoard(position + 1, player, board, availableField);
    }
    static void turnPlayer(char[][] board, int[] availableField, int player){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Player %d:  digite a posição que deseja marcar: (1 a 9): ", player);
        int position = sc.nextInt();
        while(availableField[position - 1] != 0){
            System.out.printf("Player %d:  posição inválida ou já ocupada: (1 a 9): ", player);
            position = sc.nextInt();
        }
        updateBoard(position, player, board, availableField);
    }
    static boolean isVictory(char[][] board){
        // WinCondition = 1.2.3 / 4.5.6 / 7.8.9 / 1.4.7 / 2.5.8 / 3.6.9 / 1.5.9 / 3.5.7

        return  (board[0][0] == board[0][2] && board[0][0] == board[0][4] && board[0][0] != '_') || // 1,2,3
                (board[1][0] == board[1][2] && board[1][0] == board[1][4] && board[1][0] != '_') || // 4,5,6
                (board[2][0] == board[2][2] && board[2][0] == board[2][4] && board[2][0] != '_') || // 7,8,9
                (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != '_') || // 1,4,7
                (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != '_') || // 2,5,8
                (board[0][4] == board[1][4] && board[0][4] == board[2][4] && board[0][4] != '_') || // 3,6,9
                (board[0][0] == board[1][2] && board[0][0] == board[2][4] && board[0][0] != '_') || // 1,5,9
                (board[0][4] == board[1][2] && board[0][4] == board[2][0] && board[0][4] != '_');   // 3,5,7
    }
}
