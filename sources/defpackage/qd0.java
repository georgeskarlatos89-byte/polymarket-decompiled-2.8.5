package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class qd0 extends Exception {
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qd0(Status status) {
        super(r4.toString());
        int i = status.a;
        String str = status.b;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.a = status;
    }
}
