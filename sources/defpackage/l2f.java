package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l2f {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ m2f f;

    public l2f(m2f m2fVar, List list) {
        this.f = m2fVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            nw9.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
