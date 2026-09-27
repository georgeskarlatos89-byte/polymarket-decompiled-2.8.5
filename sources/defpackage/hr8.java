package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hr8 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hr8(String str, String str2) {
        int i;
        int i2;
        int i3;
        try {
            i = jr8.k(35633, str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            e = e;
            i = -1;
            i2 = -1;
        }
        try {
            i2 = jr8.k(35632, str2);
            try {
                i3 = GLES20.glCreateProgram();
                try {
                    jr8.b("glCreateProgram");
                    GLES20.glAttachShader(i3, i);
                    jr8.b("glAttachShader");
                    GLES20.glAttachShader(i3, i2);
                    jr8.b("glAttachShader");
                    GLES20.glLinkProgram(i3);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(i3, 35714, iArr, 0);
                    if (iArr[0] == 1) {
                        this.a = i3;
                        a();
                    } else {
                        throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i3));
                    }
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    e = e2;
                    if (i != -1) {
                        GLES20.glDeleteShader(i);
                    }
                    if (i2 != -1) {
                        GLES20.glDeleteShader(i2);
                    }
                    if (i3 != -1) {
                        GLES20.glDeleteProgram(i3);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e3) {
                e = e3;
                i3 = -1;
            }
        } catch (IllegalArgumentException | IllegalStateException e4) {
            e = e4;
            i2 = -1;
            i3 = i2;
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            if (i3 != -1) {
            }
            throw e;
        }
    }

    public final void a() {
        int i = this.a;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = glGetAttribLocation;
        jr8.e(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = glGetUniformLocation;
        jr8.e(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = glGetUniformLocation2;
        jr8.e(glGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        jr8.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        jr8.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) jr8.h);
        jr8.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        jr8.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        jr8.b("glUniform1f");
    }
}
