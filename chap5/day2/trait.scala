trait Censor {
  val slangMap = Map("Shoot" -> "Pucky", "Darn" -> "Beans")

  def replace(input: List[String]) = {
    input.map(word => {
      if(slangMap.get(word) == None) {
        word
      } else {
        slangMap.get(word).get //get value from option
      }
    })
  }
}
