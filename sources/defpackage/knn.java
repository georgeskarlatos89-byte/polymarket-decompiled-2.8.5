package defpackage;

import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.net.ConnectException;
import java.net.UnknownHostException;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class knn implements xic {
    public static qh7 a(go3 go3Var, int i, Throwable th, int i2) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        go3Var.getClass();
        return new qh7(go3Var.c(), go3Var.b(), i, th);
    }

    public static final boolean b(sh7 sh7Var) {
        sh7Var.getClass();
        if (sh7Var instanceof qh7) {
            qh7 qh7Var = (qh7) sh7Var;
            if (CollectionsKt.listOf(429, 408, Integer.valueOf(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE)).contains(Integer.valueOf(qh7Var.c))) {
                return false;
            }
            Throwable th = qh7Var.d;
            if (!(th instanceof UnknownHostException) && !(th instanceof ConnectException)) {
                return true;
            }
        }
        return false;
    }
}
