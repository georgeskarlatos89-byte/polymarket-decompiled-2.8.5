package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class znb extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public znb(Throwable th) {
        super(r0.toString(), th);
        String str;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb.append(str);
    }
}
