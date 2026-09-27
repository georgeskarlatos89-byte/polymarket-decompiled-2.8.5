package bo.app;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        y9 y9Var = ((ke) obj2).a;
        y9Var.getClass();
        Integer valueOf = Integer.valueOf(((l0) y9Var).n().size());
        y9 y9Var2 = ((ke) obj).a;
        y9Var2.getClass();
        return valueOf.compareTo(Integer.valueOf(((l0) y9Var2).n().size()));
    }
}
