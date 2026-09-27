package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ycf extends sv2 implements vka {
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ycf(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, r8);
        boolean z;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f = (i & 2) == 2;
    }

    public final vka b() {
        if (!this.f) {
            return (vka) super.getReflected();
        }
        py2.f("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override // defpackage.sv2
    public final lja compute() {
        if (this.f) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycf) {
            ycf ycfVar = (ycf) obj;
            if (getOwner().equals(ycfVar.getOwner()) && getName().equals(ycfVar.getName()) && getSignature().equals(ycfVar.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), ycfVar.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.sv2
    public final /* bridge */ /* synthetic */ lja getReflected() {
        return b();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.vka
    public final boolean isConst() {
        return b().isConst();
    }

    @Override // defpackage.vka
    public final boolean isLateinit() {
        return b().isLateinit();
    }

    public final String toString() {
        lja compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public ycf() {
        this.f = false;
    }
}
