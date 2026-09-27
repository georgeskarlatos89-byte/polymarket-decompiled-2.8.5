package defpackage;

import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.api.Keys;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c1 extends tjc {
    public final csc a;
    public final jqb b;
    public final jqb c;
    public final jqb d;

    /* JADX WARN: Type inference failed for: r0v1, types: [jqb, iqb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [jqb, iqb] */
    /* JADX WARN: Type inference failed for: r0v4, types: [jqb, iqb] */
    public c1(azh azhVar, csc cscVar) {
        if (azhVar != null) {
            if (cscVar != null) {
                this.a = cscVar;
                nqb nqbVar = (nqb) azhVar;
                this.b = new iqb(nqbVar, new b1(this, 0));
                this.c = new iqb(nqbVar, new b1(this, 1));
                this.d = new iqb(nqbVar, new b1(this, 2));
                return;
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
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
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
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case zh4.REMOTE_EXCEPTION /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case MlKitException.UNSUPPORTED /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 9 && i != 12 && i != 14 && i != 16) {
                                if (i != 17) {
                                    if (i != 19) {
                                        if (i != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case zh4.REMOTE_EXCEPTION /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case MlKitException.UNSUPPORTED /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) {
            throw new IllegalStateException(format);
        }
    }

    public s34 G(fij fijVar) {
        if (fijVar != null) {
            if (fijVar.a.e()) {
                return this;
            }
            return new v4b(this, fijVar);
        }
        p(18);
        throw null;
    }

    @Override // defpackage.s34
    public m9c I() {
        m9c m9cVar = (m9c) this.c.invoke();
        if (m9cVar != null) {
            return m9cVar;
        }
        p(4);
        throw null;
    }

    @Override // defpackage.s34
    public m9c M() {
        co6.h(zn6.c(this));
        m9c n = n(ota.a);
        if (n != null) {
            return n;
        }
        p(17);
        throw null;
    }

    @Override // defpackage.s34
    public List O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        p(6);
        throw null;
    }

    @Override // defpackage.tw5
    public final Object Z(xw5 xw5Var, Object obj) {
        return ((rn6) xw5Var).G(this, obj);
    }

    @Override // defpackage.ebi
    public /* bridge */ /* synthetic */ vw5 c(fij fijVar) {
        return G(fijVar);
    }

    @Override // defpackage.s34, defpackage.u44
    public final s7h g() {
        s7h s7hVar = (s7h) this.b.invoke();
        if (s7hVar != null) {
            return s7hVar;
        }
        p(20);
        throw null;
    }

    @Override // defpackage.tw5
    public final csc getName() {
        csc cscVar = this.a;
        if (cscVar != null) {
            return cscVar;
        }
        p(2);
        throw null;
    }

    @Override // defpackage.tjc
    public m9c k(bij bijVar, ota otaVar) {
        if (bijVar.e()) {
            m9c n = n(otaVar);
            if (n != null) {
                return n;
            }
            p(12);
            throw null;
        }
        return new jbi(n(otaVar), new fij(bijVar));
    }

    @Override // defpackage.s34
    public final lrf s0() {
        lrf lrfVar = (lrf) this.d.invoke();
        if (lrfVar != null) {
            return lrfVar;
        }
        p(5);
        throw null;
    }

    @Override // defpackage.s34
    public final m9c v(bij bijVar) {
        co6.h(zn6.c(this));
        m9c k = k(bijVar, ota.a);
        if (k != null) {
            return k;
        }
        p(16);
        throw null;
    }

    @Override // defpackage.tjc, defpackage.s34, defpackage.tw5
    public final tw5 a() {
        return this;
    }

    @Override // defpackage.tjc, defpackage.s34, defpackage.tw5
    public final s34 a() {
        return this;
    }

    @Override // defpackage.tjc, defpackage.tw5
    public final u44 a() {
        return this;
    }
}
