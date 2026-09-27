package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class d4k extends ww5 implements c4k {
    public ita e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4k(tw5 tw5Var, ec0 ec0Var, csc cscVar, ita itaVar, peh pehVar) {
        super(tw5Var, ec0Var, cscVar, pehVar);
        if (tw5Var != null) {
            if (ec0Var != null) {
                if (cscVar != null) {
                    if (pehVar != null) {
                        this.e = itaVar;
                        return;
                    } else {
                        t0(3);
                        throw null;
                    }
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
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // defpackage.nv2
    public lrf D() {
        return null;
    }

    @Override // defpackage.nv2
    public boolean V() {
        return false;
    }

    @Override // defpackage.nv2
    public ita getReturnType() {
        ita type = getType();
        if (type != null) {
            return type;
        }
        t0(10);
        throw null;
    }

    @Override // defpackage.x4, defpackage.mrf
    public final ita getType() {
        ita itaVar = this.e;
        if (itaVar != null) {
            return itaVar;
        }
        t0(4);
        throw null;
    }

    @Override // defpackage.nv2
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(8);
        throw null;
    }

    @Override // defpackage.nv2
    public List h0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(9);
        throw null;
    }

    @Override // defpackage.nv2
    public final List x() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(6);
        throw null;
    }
}
