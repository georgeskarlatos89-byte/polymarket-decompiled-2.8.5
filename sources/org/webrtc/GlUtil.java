package org.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class GlUtil {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int i, String str) {
            super(i, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError != 1285) {
                throw new GLException(glGetError, str + ": GLES20 error: " + glGetError);
            }
        }
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }
}
