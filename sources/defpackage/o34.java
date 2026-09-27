package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class o34 extends cq8 implements h05 {
    public final boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o34(s34 s34Var, h05 h05Var, ec0 ec0Var, boolean z, pv2 pv2Var, peh pehVar) {
        super(ec0Var, pv2Var, s34Var, h05Var, xgh.e, pehVar);
        if (s34Var != null) {
            if (ec0Var != null) {
                if (pv2Var != null) {
                    if (pehVar != null) {
                        this.D = z;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case MlKitException.UNSUPPORTED /* 18 */:
                case zh4.REMOTE_EXCEPTION /* 19 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 21 && i != 27) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case MlKitException.UNSUPPORTED /* 18 */:
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case MlKitException.UNSUPPORTED /* 18 */:
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i == 21) {
                    if (i != 27) {
                        switch (i) {
                            case 15:
                            case 16:
                                objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
                                objArr[1] = "getContainingDeclaration";
                                break;
                            case MlKitException.UNSUPPORTED /* 18 */:
                                objArr[1] = "getConstructedClass";
                                break;
                            case zh4.REMOTE_EXCEPTION /* 19 */:
                                objArr[1] = "getOriginal";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
                        objArr[1] = "copy";
                    }
                } else {
                    objArr[1] = "getOverriddenDescriptors";
                }
                switch (i) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case MlKitException.UNSUPPORTED /* 18 */:
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 21 && i != 27) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case MlKitException.UNSUPPORTED /* 18 */:
                        case zh4.REMOTE_EXCEPTION /* 19 */:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i == 21) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 21) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 21) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i == 21) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i == 21) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // defpackage.h05
    public final boolean S() {
        return this.D;
    }

    @Override // defpackage.cq8, defpackage.tw5
    public final Object Z(xw5 xw5Var, Object obj) {
        return xw5Var.visitConstructorDescriptor(this, obj);
    }

    @Override // defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ nv2 a() {
        return w1();
    }

    @Override // defpackage.cq8, defpackage.ebi
    public final /* bridge */ /* synthetic */ vw5 c(fij fijVar) {
        return z1(fijVar);
    }

    @Override // defpackage.ww5, defpackage.tw5
    public final /* bridge */ /* synthetic */ v44 e() {
        return v1();
    }

    @Override // defpackage.cq8, defpackage.qv2
    public final qv2 e0(s34 s34Var, sic sicVar, do6 do6Var, pv2 pv2Var) {
        return (o34) j1(s34Var, sicVar, do6Var, pv2Var);
    }

    @Override // defpackage.cq8, defpackage.qv2, defpackage.nv2
    public final Collection f() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        t0(21);
        throw null;
    }

    @Override // defpackage.ww5
    public final /* bridge */ /* synthetic */ vw5 i1() {
        return w1();
    }

    @Override // defpackage.cq8
    public /* bridge */ /* synthetic */ cq8 l1(ec0 ec0Var, pv2 pv2Var, tw5 tw5Var, aq8 aq8Var, csc cscVar, peh pehVar) {
        return t1(ec0Var, pv2Var, tw5Var, aq8Var, cscVar, pehVar);
    }

    @Override // defpackage.cq8, defpackage.qv2
    public final void m0(Collection collection) {
        if (collection != null) {
            return;
        }
        t0(22);
        throw null;
    }

    public o34 t1(ec0 ec0Var, pv2 pv2Var, tw5 tw5Var, aq8 aq8Var, csc cscVar, peh pehVar) {
        if (tw5Var != null) {
            if (pv2Var != null) {
                if (ec0Var != null) {
                    pv2 pv2Var2 = pv2.DECLARATION;
                    if (pv2Var != pv2Var2 && pv2Var != pv2.SYNTHESIZED) {
                        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + tw5Var + "\nkind: " + pv2Var);
                    }
                    return new o34((s34) tw5Var, this, ec0Var, this.D, pv2Var2, pehVar);
                }
                t0(25);
                throw null;
            }
            t0(24);
            throw null;
        }
        t0(23);
        throw null;
    }

    public final s34 u1() {
        s34 v1 = v1();
        if (v1 != null) {
            return v1;
        }
        t0(18);
        throw null;
    }

    public final s34 v1() {
        s34 s34Var = (s34) super.e();
        if (s34Var != null) {
            return s34Var;
        }
        t0(17);
        throw null;
    }

    public final o34 w1() {
        o34 o34Var = (o34) super.a();
        if (o34Var != null) {
            return o34Var;
        }
        t0(19);
        throw null;
    }

    public final void x1(List list, fo6 fo6Var) {
        if (list != null) {
            if (fo6Var != null) {
                y1(list, fo6Var, v1().h());
                return;
            } else {
                t0(14);
                throw null;
            }
        }
        t0(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(List list, fo6 fo6Var, List list2) {
        lrf lrfVar;
        s34 v1;
        List list3;
        if (list != null) {
            if (fo6Var != null) {
                if (list2 != null) {
                    s34 v12 = v1();
                    if (v12.isInner()) {
                        tw5 e = v12.e();
                        if (e instanceof s34) {
                            lrfVar = ((s34) e).s0();
                            v1 = v1();
                            if (v1.O().isEmpty()) {
                                list3 = v1.O();
                                if (list3 == null) {
                                    t0(15);
                                    throw null;
                                }
                            } else {
                                list3 = Collections.EMPTY_LIST;
                                if (list3 == null) {
                                    t0(16);
                                    throw null;
                                }
                            }
                            o1(null, lrfVar, list3, list2, list, null, sic.FINAL, fo6Var);
                            return;
                        }
                    }
                    lrfVar = null;
                    v1 = v1();
                    if (v1.O().isEmpty()) {
                    }
                    o1(null, lrfVar, list3, list2, list, null, sic.FINAL, fo6Var);
                    return;
                }
                t0(12);
                throw null;
            }
            t0(11);
            throw null;
        }
        t0(10);
        throw null;
    }

    public final o34 z1(fij fijVar) {
        if (fijVar != null) {
            return (o34) super.c(fijVar);
        }
        t0(20);
        throw null;
    }

    @Override // defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ qv2 a() {
        return w1();
    }

    @Override // defpackage.cq8, defpackage.aq8, defpackage.ebi
    public final /* bridge */ /* synthetic */ aq8 c(fij fijVar) {
        return z1(fijVar);
    }

    @Override // defpackage.ww5, defpackage.tw5
    public final /* bridge */ /* synthetic */ tw5 e() {
        return v1();
    }

    @Override // defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ tw5 a() {
        return w1();
    }

    @Override // defpackage.cq8, defpackage.ww5, defpackage.uw5, defpackage.tw5
    public final /* bridge */ /* synthetic */ aq8 a() {
        return w1();
    }
}
