package com.knoldus

class Car(var fuel: Int){
  val fuelCapacity = 50

  // method to move the car
  def moveCar(): Int = {
    if(fuel < 0) throw new IllegalArgumentException("Fuel cannot be negative")
    if (fuel < 20) {
      refillCarFuel()
    }
    if(fuel > 50) throw new IllegalArgumentException("Fuel cannot be more than Fuel Capacity")
    else fuel = fuel - 20
    fuel
  }

  //method to refill the fuel
  def refillCarFuel(): Int = {
    val addFuel = fuelCapacity - fuel
    fuel = fuel + addFuel
    fuel
  }
}

