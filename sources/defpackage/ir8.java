package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ir8 extends hr8 {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir8(c57 c57Var, er8 er8Var) {
        super(r3, r4);
        String str;
        String str2;
        if (c57Var.a()) {
            str = jr8.d;
        } else {
            str = jr8.c;
        }
        try {
            switch (er8Var.a) {
                case 0:
                    Locale locale = Locale.US;
                    str2 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str2 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str2 = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (str2.contains("vTextureCoord") && str2.contains("sTexture")) {
                this.e = -1;
                this.f = -1;
                this.g = -1;
                a();
                int i = this.a;
                int glGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
                this.e = glGetUniformLocation;
                jr8.e(glGetUniformLocation, "sTexture");
                int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
                this.g = glGetAttribLocation;
                jr8.e(glGetAttribLocation, "aTextureCoord");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
                this.f = glGetUniformLocation2;
                jr8.e(glGetUniformLocation2, "uTexMatrix");
                return;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    @Override // defpackage.hr8
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        jr8.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) jr8.i);
        jr8.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir8(c57 c57Var, gr8 gr8Var) {
        this(c57Var, r5);
        er8 er8Var;
        if (c57Var.a()) {
            grn.b("No default sampler shader available for" + gr8Var, gr8Var != gr8.UNKNOWN);
            if (gr8Var == gr8.YUV) {
                er8Var = jr8.g;
            } else {
                er8Var = jr8.f;
            }
        } else {
            er8Var = jr8.e;
        }
    }
}
