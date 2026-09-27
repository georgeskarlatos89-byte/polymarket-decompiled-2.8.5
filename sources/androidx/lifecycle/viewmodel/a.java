package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import defpackage.ld5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a extends CreationExtras {
    public a(CreationExtras creationExtras) {
        creationExtras.getClass();
        this.a.putAll(creationExtras.a);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final Object a(ld5 ld5Var) {
        ld5Var.getClass();
        return this.a.get(ld5Var);
    }

    public a() {
        this(null, 1, null);
    }

    public /* synthetic */ a(CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreationExtras.Empty.b : creationExtras);
    }
}
