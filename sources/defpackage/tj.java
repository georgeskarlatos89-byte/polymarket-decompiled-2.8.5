package defpackage;

import android.content.Context;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tj implements cmi, edd, pyf {
    public static final tj c = new tj("TINK", 0);
    public static final tj d = new tj("CRUNCHY", 0);
    public static final tj e = new tj("NO_PREFIX", 0);
    public static final Object f = new Object();
    public static volatile bxf g;
    public final /* synthetic */ int a;
    public String b;

    public tj(Context context, ain ainVar) {
        String s;
        this.a = 1;
        if (ainVar.t()) {
            s = fwm.b(context, ainVar.s());
        } else {
            s = ainVar.s();
        }
        this.b = s;
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
        L.writeString("");
        L.writeString(null);
        gtmVar.N(L, 11);
    }

    @Override // defpackage.cmi
    public String getValue() {
        return this.b;
    }

    @Override // defpackage.edd
    public String t() {
        return m51.m(new StringBuilder("expected '"), this.b, '\'');
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 5:
                return this.b;
            case 7:
                return woa.r(new StringBuilder("Phase('"), this.b, "')");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tj(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public tj(int i) {
        this.a = i;
        switch (i) {
            case 4:
                return;
            default:
                this.b = "group";
                return;
        }
    }

    public tj(Throwable th) {
        this.a = 3;
        this.b = t1k.c(th);
    }
}
