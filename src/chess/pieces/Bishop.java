package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position aux_p = new Position(0, 0);

		// nw
		aux_p.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setValues(aux_p.getRow() - 1, aux_p.getColumn() - 1);
		}

		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}

		// ne
		aux_p.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setValues(aux_p.getRow() - 1, aux_p.getColumn() + 1);
		}

		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}

		// se
		aux_p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setValues(aux_p.getRow() + 1, aux_p.getColumn() + 1);
		}

		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}

		// sw
		aux_p.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(aux_p) && !getBoard().thereIsAPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
			aux_p.setValues(aux_p.getRow() + 1, aux_p.getColumn() - 1);
		}

		if (getBoard().positionExists(aux_p) && isThereOpponentPiece(aux_p)) {
			mat[aux_p.getRow()][aux_p.getColumn()] = true;
		}

		return mat;
	}

}
