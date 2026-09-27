package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l8a {
    public final Class a;
    public final Object b;
    public final Method c;
    public final List d;

    public l8a(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getName(), this.c.getName(), this.d);
    }
}
