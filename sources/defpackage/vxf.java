package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lvxf;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class vxf extends Exception {
    public final ji7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxf(ji7 ji7Var) {
        super(ji7Var.a());
        ji7Var.getClass();
        this.a = ji7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vxf) && this.a == ((vxf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RememberMeError(code=" + this.a + ")";
    }
}
