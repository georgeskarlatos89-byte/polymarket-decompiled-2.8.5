package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class f99 {
    public final String a;
    public final List b;
    public final boolean c;

    public f99(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }

    public abstract Object a(List list);
}
