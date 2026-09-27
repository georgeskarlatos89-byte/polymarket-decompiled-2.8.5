package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.appsflyer.internal.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jr8 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final er8 e;
    public static final er8 f;
    public static final er8 g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final ox0 j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new er8(0);
        f = new er8(1);
        g = new er8(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
        j = new ox0(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        l.m(sv6.t(str, ": EGL error: 0x"), Integer.toHexString(eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        l.m(sv6.t(str, ": GL error 0x"), Integer.toHexString(glGetError));
    }

    public static void c(Thread thread) {
        boolean z;
        if (thread == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        grn.g("Method call must be called on the GL thread.", z);
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        boolean z2;
        String str;
        if (z == atomicBoolean.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        grn.g(str, z2);
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        dmk.n(sv6.n("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, c57 c57Var) {
        int i2 = c57Var.a;
        int[] iArr = a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return b;
            }
            o9n.f("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(c57 c57Var) {
        Object ir8Var;
        gr8 gr8Var;
        boolean z;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        for (gr8 gr8Var2 : gr8.values()) {
            er8 er8Var = (er8) map.get(gr8Var2);
            if (er8Var != null) {
                ir8Var = new ir8(c57Var, er8Var);
            } else if (gr8Var2 != gr8.YUV && gr8Var2 != (gr8Var = gr8.DEFAULT)) {
                if (gr8Var2 == gr8.UNKNOWN) {
                    z = true;
                } else {
                    z = false;
                }
                grn.g("Unhandled input format: " + gr8Var2, z);
                if (c57Var.a()) {
                    ir8Var = new hr8("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    er8 er8Var2 = (er8) map.get(gr8Var);
                    if (er8Var2 != null) {
                        ir8Var = new ir8(c57Var, er8Var2);
                    } else {
                        ir8Var = new ir8(c57Var, gr8Var);
                    }
                }
            } else {
                ir8Var = new ir8(c57Var, gr8Var2);
            }
            Objects.toString(gr8Var2);
            ir8Var.toString();
            hashMap.put(gr8Var2, ir8Var);
        }
        return hashMap;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        dmk.n("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return sv6.n(group, ".", group2);
        }
        return "0.0";
    }

    public static int k(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        o9n.f("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + glGetShaderInfoLog);
    }
}
