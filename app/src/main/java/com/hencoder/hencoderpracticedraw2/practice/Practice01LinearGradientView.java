package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice01LinearGradientView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintTwo = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintThree = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice01LinearGradientView(Context context) {
        super(context);
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // 用 Paint.setShader(shader) 设置一个 LinearGradient
        // LinearGradient 的参数：坐标：(100, 100) 到 (500, 500) ；颜色：#E91E63 到 #2196F3
        LinearGradient linearGradient = new LinearGradient(100, 100, 200, 200, Color.parseColor("#E91E63")
                , Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(linearGradient);
        LinearGradient linearGradientTwo = new LinearGradient(400, 100, 500, 200, Color.parseColor("#E91E63")
                , Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);
        paintTwo.setShader(linearGradientTwo);
        LinearGradient linearGradientThree = new LinearGradient(700, 100, 800, 200, Color.parseColor("#E91E63")
                , Color.parseColor("#2196F3"), Shader.TileMode.REPEAT);
        paintThree.setShader(linearGradientThree);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制圆，圆心 半径
        canvas.drawCircle(200, 200, 100, paint);
        canvas.drawCircle(500, 200, 100, paintTwo);
        canvas.drawCircle(800, 200, 100, paintTwo);
    }
}
