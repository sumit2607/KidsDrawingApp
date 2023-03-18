package com.example.kidsdrawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawingClass(context: Context, atter: AttributeSet) : View(context, atter) {
    private var mDraw: CustomPath? = null

    private var bitmap: Bitmap? = null
    private var mdrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize: Float? = 0.toFloat()
    private var colour = Color.BLACK
    private var canvas: Canvas? = null


    init {
        setUpDrawing()
    }

    private fun setUpDrawing() {
        mdrawPaint = Paint()
        mDraw = mBrushSize?.let { CustomPath(colour, it) }

        mdrawPaint!!.color = colour
        mdrawPaint!!.style = Paint.Style.STROKE
        mdrawPaint!!.strokeJoin = Paint.Join.ROUND
        mdrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize = 20f


    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        
    }

    internal inner class CustomPath(var color: Int, var brushThikness: Float) :
        android.graphics.Path() {


    }
}