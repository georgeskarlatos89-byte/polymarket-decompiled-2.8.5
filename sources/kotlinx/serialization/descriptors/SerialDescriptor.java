package kotlinx.serialization.descriptors;

import defpackage.o5l;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i);

    List f(int i);

    SerialDescriptor g(int i);

    default List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    o5l getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
