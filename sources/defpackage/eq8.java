package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class eq8 extends sv2 implements tp8, vja {
    private final int arity;

    public eq8(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.sv2
    public lja computeReflected() {
        return lvf.a.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eq8) {
            eq8 eq8Var = (eq8) obj;
            if (getName().equals(eq8Var.getName()) && getSignature().equals(eq8Var.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), eq8Var.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), eq8Var.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof vja)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.tp8
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.sv2
    public vja getReflected() {
        return (vja) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.vja
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.vja
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.vja
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.vja
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.sv2, defpackage.lja, defpackage.vja
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        lja compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.sv2
    public /* bridge */ /* synthetic */ lja getReflected() {
        return getReflected();
    }
}
