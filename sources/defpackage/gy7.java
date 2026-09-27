package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gy7 {
    public final String a;
    public final Map b;

    public gy7(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static bw4 a(String str) {
        return new bw4(str, 21);
    }

    public static gy7 c(String str) {
        return new gy7(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        if (this.a.equals(gy7Var.a) && this.b.equals(gy7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
