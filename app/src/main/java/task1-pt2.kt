class pt2( val name : String,  val lastName : String ,val age : Int , val salary : Int) {
    fun checkTheSalary(): Boolean {
        if (salary >1000){
            return true
    }
        return false
}
}
fun main (){
    var employ1 = pt2("jojoAli", "shm", 21, 1500)
    val employ2 = pt2("Ali","kh",22,2500)
     println(employ2.checkTheSalary())
}