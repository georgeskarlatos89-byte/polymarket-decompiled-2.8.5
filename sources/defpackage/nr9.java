package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nr9 extends AbstractMap {
    public final h3k[] a;

    public nr9(h3k[] h3kVarArr) {
        this.a = h3kVarArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new zk0(this.a);
    }
}
