package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class kb implements tp8, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public kb(int i, int i2, Class cls, Object obj, String str, String str2) {
        boolean z;
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isTopLevel = z;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        if (this.isTopLevel == kbVar.isTopLevel && this.arity == kbVar.arity && this.flags == kbVar.flags && Intrinsics.areEqual(this.receiver, kbVar.receiver) && Intrinsics.areEqual(this.owner, kbVar.owner) && this.name.equals(kbVar.name) && this.signature.equals(kbVar.signature)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tp8
    public int getArity() {
        return this.arity;
    }

    public uja getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return lvf.a.getOrCreateKotlinPackage(cls, "");
        }
        return lvf.a.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int e = hdi.e(hdi.e((i4 + i3) * 31, 31, this.name), 31, this.signature);
        if (this.isTopLevel) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((e + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return lvf.a.renderLambdaToString(this);
    }

    public kb(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, sv2.NO_RECEIVER, str, str2);
    }
}
