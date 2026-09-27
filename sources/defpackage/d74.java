package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d74 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d74(int i, long j, long j2) {
        super("Illegal clipping: ".concat(r4));
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "unknown";
                } else {
                    pfn.f((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "not seekable to start";
            }
        } else {
            str = "invalid period count";
        }
    }

    public d74(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }
}
