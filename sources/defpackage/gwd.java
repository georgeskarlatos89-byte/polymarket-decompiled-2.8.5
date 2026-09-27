package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gwd {
    public final List a;
    public final List b;

    public gwd(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(CollectionsKt.N(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return m51.m(sb, CollectionsKt.N(this.b, ";", null, null, null, 62), ')');
    }
}
