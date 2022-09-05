fun main() {
    /**
     * ввод переменых для отправки в базовый класс и класс наследник
     *@property name  название
     * @property weight   вес (в каратах);
     * @property cut_quality_in_points  качество огранки в баллах (число).
     * @property P  цвет
     * @property obj  обьект базавого класса
     * @property obj_child  обьект  класса с наследника
     */
    println("алмаз")
    val name: String = readLine().toString()
    println("вес в каратах")
    val weight: Int = readLine()!!.toInt()
    println("качество огранки в баллах")
    val cut_quality_in_points: Int =  readLine()!!.toInt()
    val obj: BasDiamond = BasDiamond(name,weight ,cut_quality_in_points)
    println("цвет ")
    val P: String = readLine().toString()
    val obj_child: childDiamond = childDiamond(P,name,weight ,cut_quality_in_points)
    println("алмаз "+obj.name)
    println("вес в каратах "+obj.weight)
    println(" качество огранки в баллах "+obj.cut_quality_in_points)
    println("Q "+obj.Q())
    println("QP "+obj_child.Q())
}
