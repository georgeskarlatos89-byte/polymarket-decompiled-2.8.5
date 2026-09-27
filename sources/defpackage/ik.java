package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ik implements pyf {
    public static final ik c = new ik("TINK", 0);
    public static final ik d = new ik("CRUNCHY", 0);
    public static final ik e = new ik("NO_PREFIX", 0);
    public final /* synthetic */ int a;
    public String b;

    public /* synthetic */ ik(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.pyf
    public void accept(Object obj, Object obj2) {
        int i = qrm.a;
        gpm gpmVar = new gpm((epi) obj2);
        gtm gtmVar = (gtm) ((ltm) obj).getService();
        String str = this.b;
        Parcel L = gtmVar.L();
        dhl.c(L, gpmVar);
        L.writeString(str);
        gtmVar.N(L, 5);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ik() {
        this.a = 2;
    }
}
