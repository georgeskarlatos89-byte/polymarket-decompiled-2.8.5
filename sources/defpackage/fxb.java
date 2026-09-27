package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fxb {
    private final LinkedHashMap<Object, Object> a;

    public /* synthetic */ fxb(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 2) != 0 ? 0.75f : f, (i2 & 1) != 0 ? 16 : i);
    }

    public final Object a(Object obj) {
        obj.getClass();
        return this.a.get(obj);
    }

    public final Set b() {
        Set<Map.Entry<Object, Object>> entrySet = this.a.entrySet();
        entrySet.getClass();
        return entrySet;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        obj.getClass();
        return this.a.remove(obj);
    }

    public fxb(float f, int i) {
        this.a = new LinkedHashMap<>(i, f, true);
    }

    public fxb() {
        this(0, 0.0f, 3, null);
    }
}
