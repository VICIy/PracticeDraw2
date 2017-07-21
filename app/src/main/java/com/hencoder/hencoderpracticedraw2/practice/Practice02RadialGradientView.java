package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice02RadialGradientView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintTwo = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintThree = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice02RadialGradientView(Context context) {
        super(context);
    }

    public Practice02RadialGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02RadialGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // 用 Paint.setShader(shader) 设置一个 RadialGradient
        // RadialGradient 的参数：圆心坐标：(300, 300)；半径：200；颜色：#E91E63 到 #2196F3
        //类似从圆心向外辐射
        RadialGradient radialShaderOne = new RadialGradient(200, 200, 50, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(radialShaderOne);
        RadialGradient radialShaderTwo = new RadialGradient(500, 200, 50, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);
        paintTwo.setShader(radialShaderTwo);
        RadialGradient radialShaderThree = new RadialGradient(800, 200, 50, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.REPEAT);
        paintThree.setShader(radialShaderThree);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(200, 200, 100, paint);
        canvas.drawCircle(500, 200, 100, paintTwo);
        canvas.drawCircle(800, 200, 100, paintThree);
    }
}
