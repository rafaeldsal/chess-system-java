package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position aux_p = new Position(0, 0);
		
		// Above
		aux_p.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setRow(aux_p.getRow() - 1);
		}
		
		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}
		
		// Left
		aux_p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setColumn(aux_p.getColumn() - 1);
		}
		
		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}

		// Right
		aux_p.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setColumn(aux_p.getColumn() + 1);
		}
		
		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}
		
		// below
		aux_p.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setRow(aux_p.getRow() + 1);
		}
		
		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}
		
		return mat;
	}
}
