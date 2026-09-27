package defpackage;

import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x0e implements Parcelable {
    public final List a;

    public x0e(List list, q0e q0eVar, int i) {
        q0eVar = (i & 131072) != 0 ? q0e.USER_ACTION_DEFAULT : q0eVar;
        list.getClass();
        q0eVar.getClass();
        this.a = list;
    }

    public abstract void A(boolean z);

    public abstract String e(et4 et4Var, xu0 xu0Var, String str, String str2, String str3);

    public abstract boolean g();

    public abstract boolean l();

    public abstract String o();

    public abstract w0e p();

    public abstract String y();

    public abstract boolean z();
}
