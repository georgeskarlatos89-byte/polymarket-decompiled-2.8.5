package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ita implements ab0, mta {
    public int a;

    public abstract List K();

    public abstract jgj L();

    public abstract ogj P();

    public abstract boolean a0();

    public abstract ita b0(ota otaVar);

    public abstract dwj c0();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ita) {
                ita itaVar = (ita) obj;
                if (a0() == itaVar.a0()) {
                    if (n7n.l(gdn.E, c0(), itaVar.c0())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ab0
    public final ec0 getAnnotations() {
        return ic0.a(L());
    }

    public final int hashCode() {
        int hashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        if (b3n.g(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (a0() ? 1 : 0) + ((K().hashCode() + (P().hashCode() * 31)) * 31);
        }
        this.a = hashCode;
        return hashCode;
    }

    public abstract m9c w();
}
