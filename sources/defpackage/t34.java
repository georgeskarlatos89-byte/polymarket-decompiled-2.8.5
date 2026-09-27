package defpackage;

import com.socure.docv.capturesdk.api.Keys;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class t34 extends c1 {
    public final tw5 e;
    public final peh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t34(azh azhVar, tw5 tw5Var, csc cscVar, peh pehVar) {
        super(azhVar, cscVar);
        if (azhVar != null) {
            if (tw5Var != null) {
                if (cscVar != null) {
                    this.e = tw5Var;
                    this.f = pehVar;
                    return;
                }
                p(2);
                throw null;
            }
            p(1);
            throw null;
        }
        p(0);
        throw null;
    }

    public static /* synthetic */ void p(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = Keys.KEY_NAME;
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i != 4) {
            if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.tw5
    public final tw5 e() {
        tw5 tw5Var = this.e;
        if (tw5Var != null) {
            return tw5Var;
        }
        p(4);
        throw null;
    }

    @Override // defpackage.vw5
    public final peh getSource() {
        peh pehVar = this.f;
        if (pehVar != null) {
            return pehVar;
        }
        p(5);
        throw null;
    }

    @Override // defpackage.v8c
    public boolean isExternal() {
        return false;
    }
}
