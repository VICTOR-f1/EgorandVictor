 open class   BasDiamond  constructor(name: String, weight: Int, cut_quality_in_points:Int) {
     /**
      * базоывый класс
          *@property name  название
      * @property weight   вес (в каратах);
      * @property cut_quality_in_points  качество огранки в баллах (число).
      * @property Q return = 0,4·вес + 0,6·качество огранки
      *
      */
    var name: String
    var weight: Int
    var cut_quality_in_points:Int

    init {
        this.name = name
        this.weight = weight
        this.cut_quality_in_points = cut_quality_in_points
    }

    open fun Q(): Double{

       return (0.4*weight)+(cut_quality_in_points*0.6)
    }
}