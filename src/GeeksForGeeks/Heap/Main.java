package GeeksForGeeks.Heap;

import java.util.*;

enum COLOR {
    WHITE,
    BLACK,
    YELLOW,
    GREEN
}

class Tile {
    private final COLOR color;

    Tile(COLOR color) {
        this.color = color;
    }

    public COLOR getColor() {
        return color;
    }
}

class Move {
    private final int from;
    private final int to;

    Move(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}


class Player {
    private final Move[] moves;

    Player(Move[] moves) {
        this.moves = moves;
    }

    public Move[] getMoves() {
        return moves;
    }
}

class Stack {
    private final ArrayList<Tile> tiles;

    Stack(Tile tile) {
        tiles = new ArrayList<>(Collections.singletonList(tile));
    }

    public void move(List<Tile> tiles) {
        this.tiles.addAll(tiles);
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    public int getLength() {
        return tiles.size();
    }

    public COLOR getTopTileColor() {
        return tiles.get(tiles.size() - 1).getColor();
    }

    public COLOR getBottomTileColor() {
        return tiles.get(0).getColor();
    }

    public ArrayList<COLOR> print() {
        ArrayList<COLOR> colors = new ArrayList<>();
        for (Tile tile : this.tiles) {
            colors.add(tile.getColor());
        }
        return colors;
    }

}



class Babylon {
    List<Stack> stacks;
    HashMap<String, String> errors;
    Player playerOne;
    Player playerTwo;

    Babylon(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.stacks = new ArrayList<>(Arrays.asList(new Stack(new Tile(COLOR.YELLOW)), new Stack(new Tile(COLOR.YELLOW)), new Stack(new Tile(COLOR.YELLOW)), new Stack(new Tile(COLOR.WHITE)), new Stack(new Tile(COLOR.WHITE)), new Stack(new Tile(COLOR.WHITE)), new Stack(new Tile(COLOR.GREEN)), new Stack(new Tile(COLOR.GREEN)), new Stack(new Tile(COLOR.GREEN)), new Stack(new Tile(COLOR.BLACK)), new Stack(new Tile(COLOR.BLACK)), new Stack(new Tile(COLOR.BLACK))));
        this.errors = new HashMap<String, String>() {{
            put("color", "color doesn't match");
            put("height", "height doesn't match");
        }};
    }

    public void startGame() {
        int largestMoveSet = Math.max(playerOne.getMoves().length, playerTwo.getMoves().length);
        for (int i = 0; i < largestMoveSet; i++) {
            if (i < this.playerOne.getMoves().length) {
                boolean isGameOverAfterThisMove = this.move(playerOne.getMoves()[i]);
                if (isGameOverAfterThisMove) {
                    System.out.println("GAME OVER************************* Player One Won!!!!!!!!!!!!!");
                    return;
                }
            }
            if (i < this.playerTwo.getMoves().length) {
                boolean isGameOverAfterThisMove = this.move(playerTwo.getMoves()[i]);
                if (isGameOverAfterThisMove) {
                    System.out.println("GAME OVER************************* Player Two Won!!!!!!!!!!!!!");
                    return;
                }
            }
        }
        System.out.printf("still %s moves left", this.possibleMoves().size());
    }

    public boolean move(Move move) {
        if (this.canMakeThisMove(move)) {
            Stack fromStack = this.stacks.get(move.getFrom());
            Stack toStack = this.stacks.get(move.getTo());

            toStack.move(fromStack.getTiles());
            this.stacks.remove(move.getFrom());
            this.printCurrentStatus();
            return this.isGameOver();
        }
        return false;
    }

    public List<Move> possibleMoves() {
        List<Move> moves = new ArrayList<>();
        // i really don't like this, there could be a way to avoid nested loop
        for (int i = 0; i < this.stacks.size(); i++) {
            for (int j = 0; j < this.stacks.size() - 1; j++) {
                if (i != j) {
                    Move move = new Move(i, j);
                    if (this.canMakeThisMove(move)) {
                        moves.add(move);
                    }
                }
            }
        }
        return moves;
    }

    public boolean canMakeThisMove(Move move) {
        if (move.getTo() >= this.stacks.size() || move.getTo() < 0 || move.getFrom() < 0 || move.getFrom() >= this.stacks.size()) {
            return false;
        }
        Stack fromStack = this.stacks.get(move.getFrom());
        Stack toStack = this.stacks.get(move.getTo());
        boolean doesHeightMatch = toStack.getLength() == fromStack.getLength();
        boolean doesTopTileColorMatch = toStack.getTopTileColor() == fromStack.getBottomTileColor();
//        if (!doesHeightMatch && !doesTopTileColorMatch) {
//            System.out.printf("Can't move from %s to %s because either height nor color matches%n", move.getFrom(), move.getTo());
//        }
        return doesHeightMatch || doesTopTileColorMatch;
    }

    public boolean isGameOver() {
        return this.possibleMoves().size() == 0;
    }

    public void printCurrentStatus() {
        for (Stack stack : this.stacks) {
            System.out.printf("%s -> ", stack.print());
        }
        System.out.printf("%n");
    }
}



public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player(new Move[]{new Move(0, 1), new Move(3, 4), new Move(6, 7), new Move(1, 2), new Move(2, 4)});
        Player playerTwo = new Player(new Move[]{new Move(0, 1), new Move(4, 3), new Move(2, 3), new Move(3, 5), new Move(0, 3), new Move(2, 1)});
        Babylon babylon = new Babylon(playerOne, playerTwo);
        babylon.startGame();
    }
}
