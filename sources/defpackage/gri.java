package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gri {
    public static final gri b = new gri(CollectionsKt.emptyList());
    public final List a;

    public gri(List list) {
        this.a = list;
    }

    public final String toString() {
        return hdi.o("TextContextMenuData(components=", sjb.b(this.a, "\n\t", null, 56), ')');
    }
}
