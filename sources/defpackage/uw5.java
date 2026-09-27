package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class uw5 extends x4 implements tw5 {
    public final csc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw5(ec0 ec0Var, csc cscVar) {
        super(ec0Var);
        if (ec0Var != null) {
            if (cscVar != null) {
                this.b = cscVar;
                return;
            } else {
                t0(1);
                throw null;
            }
        }
        t0(0);
        throw null;
    }

    public static String h1(tw5 tw5Var) {
        try {
            return nn6.c.w(tw5Var) + "[" + tw5Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(tw5Var)) + "]";
        } catch (Throwable unused) {
            return tw5Var.getClass().getSimpleName() + ApiConstant.SPACE + tw5Var.getName();
        }
    }

    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = Keys.KEY_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 5 && i != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5 && i != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.tw5
    public final csc getName() {
        csc cscVar = this.b;
        if (cscVar != null) {
            return cscVar;
        }
        t0(2);
        throw null;
    }

    public String toString() {
        return h1(this);
    }

    public tw5 a() {
        return this;
    }
}
