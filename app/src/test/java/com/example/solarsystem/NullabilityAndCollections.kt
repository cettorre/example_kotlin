package com.example.solarsystem

import android.os.AsyncTask
import org.junit.Test

class NullabilityAndCollectionsTest {

    @Test
    fun listCannotBeNull() {
        var flavors1: List<String> = listOf("vanilla", "strawberry")
//        flavors = null
//
        flavors1.forEach { println(it) }
    }

    @Test
    fun listCanBeNull() {
        var flavors: List<String>? = listOf("vanilla", "strawberry")
        flavors = null

        flavors?.forEach { println(it) }
    }

    @Test
    fun valuesCannotBeNull() {
//        var flavors: List<String>? = listOf("vanilla", "strawberry", null)
//
//        flavors?.forEach { println(it) }
    }

    @Test
    fun valuesCanBeNull() {
        var flavors: List<String?>? = listOf("vanilla", "strawberry", null)

        flavors?.forEach { println(it) }
    }


    //TODO readonly and mutable collections
    @Test
    fun testingMutableCollections() {

        //read only and mutable collections:

        //read only isEmpty() contains() iterator() containsAll()

        //mutables add remove retainAll clear


        val numbers: Collection<Int> = arrayListOf(1, 2, 3, 4, 5)
        //    numbers .add(5)// no
        val ite = numbers.iterator()

        if (ite.hasNext()) print(ite.next().toString())

        while (ite.hasNext()) println(ite.next().toString())

        ite.forEach { println("$it") }


        val numbersMutable: MutableCollection<Int> = arrayListOf(1, 2, 3)
        numbersMutable.add(5)

        val implicitCollection = arrayListOf(1,2,3)
        implicitCollection.add(4)


        //listOf mutableListOf mapOf mutableMapOf setOf mutableSetOf

        val people = sortedMapOf("Sean" to 34, "Shirley" to 45)//mutable
        people.put("Mya", 12)
        println(people)
    }


    //Arrays
    @Test
    fun testingArrays() {
        //Arrays
        val numbersArr: Array<Int> = arrayOf(1, 2, 3)
        //java Integer[] numbers = {1,2,3}
        val emptyStrings = Array(2) { "" }//each value is empty string

        val nulls = arrayOfNulls<String?>(2)
        nulls.forEach { print(it) }


        //IntArray/intArrayOf  CharArray/charArrayOf BooleanArray/booleanArrayOf

        val numbers = listOf(1, 2, 3)
        numbers.toTypedArray()

        val flavors = listOf<String>("vanilla", "strawberry")


        object : AsyncTask<String, Unit, Unit>() {
            //UNIT??
            override fun doInBackground(vararg params: String?) {

            }
        }.execute(*flavors.toTypedArray()) //*??


    }

    @Test
    fun testingFilteringCollections() {//PlanetListActivity 97

      class User(val name: String, val age: Int) {//data class no necesita tostring

            override fun toString(): String {
                return name
            }

        }


        val users = listOf(User("Nate", 35),
                User("Andrea", 25),
                User("Tye", 14))

        val canDrive = users.filter { it.age >= 16 }

        val mapped = users.map {users.filter { it.age >= 16 }  }

        //filterNot() take(n:Int) drop(n:Int)

        println(users.toString())
        println(canDrive)
        println(mapped)

    }


    //TODO
    //apply etc...

}