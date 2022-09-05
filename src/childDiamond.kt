class childDiamond( P: String,name: String, weight: Int, cut_quality_in_points:Int): BasDiamond(name, weight, cut_quality_in_points){
    /**
     *  класс наследник
     *@property P  цвет
     * @property Q Qp: если цвет голубой, то Qp=Q+1;   а если желтый,  то Qp = Q – 0,5 иначе Qp=Q
     */
    var P: String
    init {
        this.P = P

    }

    override fun Q(): Double{

        val Q: Double=(0.4*weight)+(cut_quality_in_points*0.6)
        if (P == "голубой") {
           return(+Q+1)
        }
        if (P == "желтый") {
            return(+ Q-0.5)
        }
        else {
            return(+Q)
        }

    }

}