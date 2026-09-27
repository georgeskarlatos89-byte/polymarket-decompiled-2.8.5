package defpackage;

import android.media.MediaCodec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class m6c extends xx5 {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m6c(IllegalStateException illegalStateException, n6c n6cVar) {
        super(r0.toString(), illegalStateException);
        String str;
        int w;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        if (n6cVar == null) {
            str = null;
        } else {
            str = n6cVar.a;
        }
        sb.append(str);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        if (u1k.a >= 23) {
            if (z) {
                w = ((MediaCodec.CodecException) illegalStateException).getErrorCode();
            } else {
                w = 0;
            }
        } else {
            w = u1k.w(diagnosticInfo);
        }
        this.a = w;
    }
}
