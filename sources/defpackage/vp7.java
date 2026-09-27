package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vp7 implements Enumeration {
    public final Enumeration a;

    public vp7(wp7 wp7Var) {
        this.a = Collections.enumeration(wp7Var.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
