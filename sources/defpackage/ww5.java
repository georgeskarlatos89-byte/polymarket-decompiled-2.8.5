package defpackage;

import com.socure.docv.capturesdk.api.Keys;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ww5 extends uw5 implements vw5 {
    public final tw5 c;
    public final peh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww5(tw5 tw5Var, ec0 ec0Var, csc cscVar, peh pehVar) {
        super(ec0Var, cscVar);
        if (tw5Var != null) {
            if (ec0Var != null) {
                if (cscVar != null) {
                    if (pehVar != null) {
                        this.c = tw5Var;
                        this.d = pehVar;
                        return;
                    }
                    t0(3);
                    throw null;
                }
                t0(2);
                throw null;
            }
            t0(1);
            throw null;
        }
        t0(0);
        throw null;
    }

    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        if (i != 4 && i != 5 && i != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 5 && i != 6) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = Keys.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.uw5, defpackage.tw5
    public /* bridge */ /* synthetic */ tw5 a() {
        return i1();
    }

    public tw5 e() {
        tw5 tw5Var = this.c;
        if (tw5Var != null) {
            return tw5Var;
        }
        t0(5);
        throw null;
    }

    public peh getSource() {
        peh pehVar = this.d;
        if (pehVar != null) {
            return pehVar;
        }
        t0(6);
        throw null;
    }

    public vw5 i1() {
        return this;
    }
}
