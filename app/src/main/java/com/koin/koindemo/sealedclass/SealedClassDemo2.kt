package com.koin.koindemo.sealedclass

import android.view.View


//For Android Views
sealed class UiOp {
    object Show: UiOp()
    object Hide: UiOp()
    class TranslateX(val px: Float): UiOp()
    class TranslateY(val px: Float): UiOp()
}

fun executes(view: View, op: UiOp) = when (op) {
    UiOp.Show -> view.visibility = View.VISIBLE
    UiOp.Hide -> view.visibility = View.GONE
    is UiOp.TranslateX -> view.translationX = op.px
    is UiOp.TranslateY -> view.translationY = op.px
}

sealed class Operation{
    class Add(val value: Int): Operation()
    class Subtract(val value: Int): Operation()
    class Multiply(val value: Int): Operation()
    class Divide(val value: Int): Operation()

    //I used objects instead of classes. This is because if a subclass doesn’t keep state, it can just be an object.
    object Increment : Operation()
    object Decrement : Operation()
}

fun execute(x: Int, op: Operation) = when(op){
    is Operation.Add -> x + op.value
    is Operation.Subtract -> x - op.value
    is Operation.Multiply -> x * op.value
    is Operation.Divide -> x / op.value

    Operation.Increment -> x + 1
    Operation.Decrement -> x -1
}



fun main(){
    //https://antonioleiva.com/sealed-classes-kotlin/
    println(execute(45, Operation.Multiply(45) ))

}

