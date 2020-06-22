object TicTacToeGame {

  class TicTacToe {
    var gameBoard = Array.fill(3)("")

    def input(): Unit = {
      gameBoard = Array.fill(3) {
        scala.io.StdIn.readLine()
      }
    }

    def checkGameNotOver(): Boolean = {
      gameBoard.foreach(boardLine => if(boardLine.contains(' ')) return true)
      return false
    }

    def wins(c: Char) = {
      c + " Wins!"
    }

    def checkWhoWins(): String = {
      //(0,0), (0,1), (0,2)
      //(1,0), (1,1), (1,2)
      //(2,0), (2,1), (2,2)

      //(0,0), (1,0), (2,0)
      //(0,1), (1,1), (2,1)
      //(0,2), (1,2), (2,2)

      //(0,0), (1,1), (2,2)
      //(2,0), (1,1), (0,2)
      if (gameBoard(0)(0) !=  ' ' && gameBoard(0)(0) == gameBoard(0)(1) && gameBoard(0)(1) == gameBoard(0)(2)) {
        wins(gameBoard(0)(0))
      } else if (gameBoard(1)(0) !=  ' ' && gameBoard(1)(0) == gameBoard(1)(1) && gameBoard(1)(1) == gameBoard(1)(2)) {
        wins(gameBoard(1)(0))
      } else if (gameBoard(2)(0) !=  ' ' && gameBoard(2)(0) == gameBoard(2)(1) && gameBoard(2)(1) == gameBoard(2)(2)) {
        wins(gameBoard(2)(0))
      } else if (gameBoard(0)(0) !=  ' ' &&gameBoard(0)(0) == gameBoard(1)(0) && gameBoard(1)(0) == gameBoard(2)(0)) {
        wins(gameBoard(0)(0))
      } else if (gameBoard(0)(1) !=  ' ' && gameBoard(0)(1) == gameBoard(1)(1) && gameBoard(1)(1) == gameBoard(2)(1)) {
        wins(gameBoard(0)(1))
      } else if (gameBoard(0)(2) !=  ' ' && gameBoard(0)(2) == gameBoard(1)(2) && gameBoard(1)(2) == gameBoard(2)(2)) {
        wins(gameBoard(0)(2))
      } else if (gameBoard(0)(0) !=  ' ' && gameBoard(0)(0) == gameBoard(1)(1) && gameBoard(1)(1) == gameBoard(2)(2)) {
        wins(gameBoard(0)(0))
      } else if (gameBoard(2)(0) !=  ' ' && gameBoard(2)(0) == gameBoard(1)(1) && gameBoard(1)(1) == gameBoard(0)(2)) {
        wins(gameBoard(2)(0))
      } else if(checkGameNotOver()) {
        "Not to be decided who wins or not"
      } else {
        "Draw"
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val ticTacToe = new TicTacToe()
    ticTacToe.input()
    println(ticTacToe.checkWhoWins())
  }
}
