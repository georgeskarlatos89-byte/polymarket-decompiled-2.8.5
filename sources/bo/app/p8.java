package bo.app;

import defpackage.b69;
import defpackage.fwk;
import defpackage.jlg;
import defpackage.k0l;
import defpackage.mt3;
import defpackage.pm1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p8 {
    public final o8 a;
    public boolean b;

    public p8(o8 o8Var) {
        this.a = o8Var;
    }

    public static final String b(t9 t9Var) {
        return "Storage manager is closed. Not adding event: " + t9Var;
    }

    public final void a(m8 m8Var) {
        m8Var.getClass();
        if (this.b) {
            b69.h(this, pm1.W, null, false, new k0l(0), 6);
            return;
        }
        b69.h(this, null, null, false, new k0l(1), 7);
        List M0 = CollectionsKt.M0(this.a.c());
        b69.h(this, pm1.V, null, false, new mt3(M0, 25), 6);
        M0.getClass();
        m8Var.b(new g6(f6.ADD_BRAZE_EVENTS, M0, null, null, 12), g6.class);
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(LinkedHashSet linkedHashSet) {
        if (this.b) {
            b69.h(this, pm1.W, null, false, new jlg(1, linkedHashSet), 6);
        } else {
            this.a.a(linkedHashSet);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(t9 t9Var) {
        t9Var.getClass();
        if (this.b) {
            b69.h(this, pm1.W, null, false, new fwk(t9Var, 3), 6);
        } else {
            this.a.a(t9Var);
        }
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
