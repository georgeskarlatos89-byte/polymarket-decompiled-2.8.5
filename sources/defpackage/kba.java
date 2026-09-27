package defpackage;

import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.api.Keys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kba extends d7h implements vaa {
    public static final to6 F = new Object();
    public static final to6 G = new Object();
    public jba D;
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kba(tw5 tw5Var, d7h d7hVar, ec0 ec0Var, csc cscVar, pv2 pv2Var, peh pehVar, boolean z) {
        super(tw5Var, d7hVar, ec0Var, cscVar, pv2Var, pehVar);
        if (tw5Var != null) {
            if (ec0Var != null) {
                if (cscVar != null) {
                    if (pv2Var != null) {
                        this.D = null;
                        this.E = z;
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
        if (i != 13 && i != 18 && i != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 13 && i != 18 && i != 21) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = Keys.KEY_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case MlKitException.UNSUPPORTED /* 18 */:
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i != 13) {
            if (i != 18) {
                if (i != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case MlKitException.UNSUPPORTED /* 18 */:
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case zh4.REMOTE_EXCEPTION /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static kba x1(tw5 tw5Var, qza qzaVar, csc cscVar, tbg tbgVar, boolean z) {
        if (tw5Var != null) {
            if (cscVar != null) {
                return new kba(tw5Var, null, qzaVar, cscVar, pv2.DECLARATION, tbgVar, z);
            }
            t0(7);
            throw null;
        }
        t0(5);
        throw null;
    }

    @Override // defpackage.cq8, defpackage.nv2
    public final boolean V() {
        return this.D.isSynthesized;
    }

    @Override // defpackage.d7h, defpackage.cq8
    public final cq8 l1(ec0 ec0Var, pv2 pv2Var, tw5 tw5Var, aq8 aq8Var, csc cscVar, peh pehVar) {
        if (tw5Var != null) {
            if (pv2Var != null) {
                if (ec0Var != null) {
                    d7h d7hVar = (d7h) aq8Var;
                    if (cscVar == null) {
                        cscVar = getName();
                    }
                    kba kbaVar = new kba(tw5Var, d7hVar, ec0Var, cscVar, pv2Var, pehVar, this.E);
                    jba jbaVar = this.D;
                    kbaVar.y1(jbaVar.isStable, jbaVar.isSynthesized);
                    return kbaVar;
                }
                t0(16);
                throw null;
            }
            t0(15);
            throw null;
        }
        t0(14);
        throw null;
    }

    @Override // defpackage.vaa
    public final vaa r0(ita itaVar, ArrayList arrayList, ita itaVar2, Pair pair) {
        eya i;
        if (itaVar2 != null) {
            ArrayList a = s1n.a(arrayList, x(), this);
            if (itaVar == null) {
                i = null;
            } else {
                i = hwn.i(this, itaVar, vvn.c);
            }
            bq8 p1 = p1(fij.b);
            p1.g = a;
            p1.k = itaVar2;
            p1.i = i;
            p1.p = true;
            p1.o = true;
            kba kbaVar = (kba) p1.x.m1(p1);
            if (pair != null) {
                to6 to6Var = (to6) pair.getFirst();
                Object second = pair.getSecond();
                Map map = kbaVar.C;
                if (map == null) {
                    map = new LinkedHashMap();
                    kbaVar.C = map;
                }
                map.put(to6Var, second);
            }
            if (kbaVar != null) {
                return kbaVar;
            }
            t0(21);
            throw null;
        }
        t0(20);
        throw null;
    }

    @Override // defpackage.d7h
    public final d7h w1(lrf lrfVar, lrf lrfVar2, List list, List list2, List list3, ita itaVar, sic sicVar, fo6 fo6Var, Map map) {
        ey3 ey3Var;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (fo6Var != null) {
                        super.w1(lrfVar, lrfVar2, list, list2, list3, itaVar, sicVar, fo6Var, map);
                        for (q14 q14Var : zkd.a) {
                            Regex regex = q14Var.b;
                            csc cscVar = q14Var.a;
                            if (cscVar == null || Intrinsics.areEqual(getName(), cscVar)) {
                                if (regex != null) {
                                    String b = getName().b();
                                    b.getClass();
                                    if (!regex.d(b)) {
                                        continue;
                                    }
                                }
                                Collection collection = q14Var.c;
                                if (collection == null || collection.contains(getName())) {
                                    zx3[] zx3VarArr = q14Var.e;
                                    int length = zx3VarArr.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            if (zx3VarArr[i].a(this) != null) {
                                                ey3Var = new ey3(false);
                                                break;
                                            }
                                            i++;
                                        } else if (((String) q14Var.d.invoke(this)) != null) {
                                            ey3Var = new ey3(false);
                                        } else {
                                            ey3Var = dy3.c;
                                        }
                                    }
                                    this.m = ey3Var.a;
                                    return this;
                                }
                            }
                        }
                        ey3Var = dy3.b;
                        this.m = ey3Var.a;
                        return this;
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
        t0(9);
        throw null;
    }

    public final void y1(boolean z, boolean z2) {
        jba jbaVar;
        if (z) {
            if (z2) {
                jbaVar = jba.STABLE_SYNTHESIZED;
            } else {
                jbaVar = jba.STABLE_DECLARED;
            }
        } else if (z2) {
            jbaVar = jba.NON_STABLE_SYNTHESIZED;
        } else {
            jbaVar = jba.NON_STABLE_DECLARED;
        }
        if (jbaVar != null) {
            this.D = jbaVar;
        } else {
            dmk.n("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
        }
    }
}
