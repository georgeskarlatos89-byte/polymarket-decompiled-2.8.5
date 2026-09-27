package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class s7h extends dwj implements u7h, hgj {
    @Override // defpackage.dwj
    public /* bridge */ /* synthetic */ dwj f0(boolean z) {
        return t0(z);
    }

    @Override // defpackage.dwj
    public /* bridge */ /* synthetic */ dwj p0(jgj jgjVar) {
        return u0(jgjVar);
    }

    public abstract s7h t0(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", nn6.c.x((sb0) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(P());
        if (!K().isEmpty()) {
            CollectionsKt.M(K(), sb, ", ", "<", ">", null, 112);
        }
        if (a0()) {
            sb.append("?");
        }
        return sb.toString();
    }

    public abstract s7h u0(jgj jgjVar);
}
