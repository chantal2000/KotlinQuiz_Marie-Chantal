fun main() {
var book1= mutableListOf<Book>(
    Book("The best Book","Chantal",20),
    Book("The Book of Lif","Niyonkuru",2),
    Book("The best","Marie",15),

    )
    println(booklist(book1))
    squares()
    var main1=Main("Reg112",50,20,10)
    main1.load(20)
    main1.unload(15)
    main1.weightCheck()

    var trailer1=Trailer("Reg112",50,20,10)
trailer1.weightCheck()
}
data class Book(var title:String ,var author:String,var pages:Int)
fun booklist(books:List<Book>):List<Book>{
    var listOfBooks=books.reversed()
    return listOfBooks

}
fun squares(){
    var int=-1
    do{
        println(int*int)
        int++
    }
        while(int*int<=3000)
}


open class Main(var registration:String,var totalWeight:Int,var capacity:Int,var wheels:Int){
    fun load(weight: Int){
        println(totalWeight+weight)

    }
    fun unload(weight: Int)
    {
        println(totalWeight-weight)

    }
    open fun weightCheck(){

        if(totalWeight>capacity){
            println("it is overloaded by ${totalWeight-capacity}")
        }
        else{
            println("Int is underloaded by ${totalWeight-capacity}")
        }


    }
}
class Track ( registration:String, totalWeight:Int, capacity:Int){
}
class Trailer( registration:String, totalWeight:Int, capacity:Int,wheels:Int):Main(registration,totalWeight,capacity,wheels) {
    override fun weightCheck() {
        super.weightCheck()
        if (totalWeight > capacity) {
            println("it is overloaded by ${totalWeight - capacity}")
        } else {
            println("Int is underloaded by ${totalWeight - capacity}")
        }


    }

    var output = totalWeight / wheels
    println(output)
}


