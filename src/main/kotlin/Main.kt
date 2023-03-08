fun main() {
    //Q1.
    var lorry= Lorry("Prado","toyota","white",5)
    lorry.carry(5)
    lorry.carry(7)
    lorry.identity()
    println(calculateParkingFees(4))
//Q2
    println(maxTripFare(200))
    println(calculateParkingFees(6))

}
//Q1.
open class Lorry(var make: String,var model: String,var colour: String,var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people == capacity) {
            println("carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $colour $make $model")
    }
}
    fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours * 20
        return parkingFees
    }
//Q2.
open class Lorry(var make: String,var model: String,var colour: String,var capacity: Int){
    fun maxTripFare(fare:Double){
        var maxTripFare = fare * capacity
        return maxTripFare
    }
    fun calculateParkingFees(){
        var parkingFees = hours * capacity
        return parkingFees
    }
}


//Q1.
class Car( make:String, model:String, colour:String, capacity:Int):Lorry(make,model,colour,capacity)

//Q2.
class bus(make: String,model: String,colour: String,capacity: Int):Lorry(make,model,colour,capacity)









