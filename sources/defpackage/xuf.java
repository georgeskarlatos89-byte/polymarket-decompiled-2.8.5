package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xuf extends zuf {
    public final Class a;
    public final Collection b = CollectionsKt.emptyList();

    public xuf(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.zuf
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.taa
    public final Collection getAnnotations() {
        return this.b;
    }
}
