package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class bhb {
    public final String a;
    public final List b;
    public final Lazy c;

    public bhb(String str, List list) {
        this.a = str;
        this.b = list;
        this.c = LazyKt.lazy(new pla(this, 11));
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public /* synthetic */ bhb(String str) {
        this(str, CollectionsKt.emptyList());
    }
}
