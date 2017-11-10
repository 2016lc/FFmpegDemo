package com.jinhe.ffmpegdemo

import android.content.Context
import android.graphics.PixelFormat
import android.util.AttributeSet
import android.util.Log
import android.view.Surface
import android.view.SurfaceView
import android.widget.Toast

/**
 * Created by LC on 2017/11/8.
 */

class VideoView : SurfaceView {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()

    }

    private fun init() {
        val holder = holder
        holder.setFormat(PixelFormat.RGBA_8888)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    fun player(input: String) {
        Thread(Runnable {
            //        绘制功能 不需要交给SurfaveView        VideoView.this.getHolder().getSurface()
            render(input, this@VideoView.holder.surface)
        }).start()
    }

    external fun render(input: String, surface: Surface)

    companion object {
        init {
            System.loadLibrary("avcodec-56")
            System.loadLibrary("avdevice-56")
            System.loadLibrary("avfilter-5")
            System.loadLibrary("avformat-56")
            System.loadLibrary("avutil-54")
            System.loadLibrary("postproc-53")
            System.loadLibrary("swresample-1")
            System.loadLibrary("swscale-3")
            System.loadLibrary("native-lib")
        }
    }
}
