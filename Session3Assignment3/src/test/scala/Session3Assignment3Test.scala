package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class Session3Assignment3Test extends AnyFunSuite {

  test("To move the vehicle three times") {
    val carObject = new Car(50)
    carObject.moveCar()
    carObject.moveCar()
    // after this refillCarFuel is called to move the car third time
    carObject.moveCar()
    assert(carObject.fuel == 30)
  }
  test("To move the vehicle two times") {
    val carObject = new Car(50)
    carObject.moveCar()
    carObject.moveCar()
    assert(carObject.fuel == 10) // Here the car needs to refill the fuel in order to move again
  }
  test("To move the vehicle with negative fuel") {
    val newCarObject = new Car(-20)
    assertThrows[IllegalArgumentException] {
      newCarObject.moveCar()
    }
  }
  test ("To move the vehicle with fuel more than fuel capacity") {
    val newCarObject = new Car(70)
    assertThrows[IllegalArgumentException] {
      newCarObject.moveCar()
    }
  }
}
