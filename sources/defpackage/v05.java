package defpackage;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class v05 implements Parcelable {
    public final boolean a;
    public final String b;

    public v05(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public abstract n05 e();

    public abstract String g();

    public abstract String getId();

    public boolean l() {
        return this.a;
    }
}
