package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tpl {
    public final ysm a;
    public final Boolean b;
    public final jqm c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ tpl(wtc wtcVar) {
        this.a = (ysm) wtcVar.b;
        this.b = (Boolean) wtcVar.c;
        this.c = (jqm) wtcVar.d;
        this.d = (Integer) wtcVar.e;
        this.e = (Integer) wtcVar.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tpl)) {
            return false;
        }
        tpl tplVar = (tpl) obj;
        if (dkn.b(this.a, tplVar.a) && dkn.b(this.b, tplVar.b) && dkn.b(null, null) && dkn.b(this.c, tplVar.c) && dkn.b(this.d, tplVar.d) && dkn.b(this.e, tplVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c, this.d, this.e});
    }
}
