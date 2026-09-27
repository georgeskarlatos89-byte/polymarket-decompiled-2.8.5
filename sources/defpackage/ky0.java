package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ky0 {
    public int a;
    public final HashMap b;
    public final Executor c;
    public final hn9 d;
    public final Rect e;
    public final Matrix f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final List k;

    public ky0(Executor executor, hn9 hn9Var, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        int i4;
        if (((CaptureFailedRetryQuirk) nq6.a.f(CaptureFailedRetryQuirk.class)) == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.a = i4;
        this.b = new HashMap();
        if (executor != null) {
            this.c = executor;
            this.d = hn9Var;
            this.e = rect;
            this.f = matrix;
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = z;
            if (list != null) {
                this.k = list;
                return;
            } else {
                dmk.s("Null sessionConfigCameraCaptureCallbacks");
                throw null;
            }
        }
        dmk.s("Null appExecutor");
        throw null;
    }

    public final boolean a() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(valueOf)) {
            o9n.b("TakePictureRequest", "The format is not supported in simultaneous capture");
        } else {
            hashMap.put(Integer.valueOf(i), Boolean.TRUE);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ky0) {
                ky0 ky0Var = (ky0) obj;
                if (this.c.equals(ky0Var.c)) {
                    hn9 hn9Var = ky0Var.d;
                    hn9 hn9Var2 = this.d;
                    if (hn9Var2 == null) {
                        if (hn9Var != null) {
                            return false;
                        }
                    } else if (!hn9Var2.equals(hn9Var)) {
                        return false;
                    }
                    if (this.e.equals(ky0Var.e) && this.f.equals(ky0Var.f) && this.g == ky0Var.g && this.h == ky0Var.h && this.i == ky0Var.i && this.j == ky0Var.j && this.k.equals(ky0Var.k)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.c.hashCode() ^ 1000003) * 1000003;
        hn9 hn9Var = this.d;
        if (hn9Var == null) {
            hashCode = 0;
        } else {
            hashCode = hn9Var.hashCode();
        }
        int hashCode3 = (((((((((((hashCode2 ^ hashCode) * 1525764945) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        if (this.j) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.k.hashCode() ^ ((hashCode3 ^ i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=");
        sb.append(this.d);
        sb.append(", onDiskCallback=null, outputFileOptions=null, secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.f);
        sb.append(", rotationDegrees=");
        sb.append(this.g);
        sb.append(", jpegQuality=");
        sb.append(this.h);
        sb.append(", captureMode=");
        sb.append(this.i);
        sb.append(", simultaneousCapture=");
        sb.append(this.j);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return ix2.q(sb, this.k, "}");
    }
}
