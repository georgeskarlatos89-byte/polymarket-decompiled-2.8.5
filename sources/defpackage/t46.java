package defpackage;

import android.os.SystemClock;
import androidx.fragment.app.t;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t46 implements eb8 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Comparable g;

    public t46(eb8 eb8Var, w46 w46Var, t tVar, String str, String str2, int i) {
        this.c = eb8Var;
        this.d = w46Var;
        this.e = tVar;
        this.f = str;
        this.g = str2;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (((defpackage.uu1) r13).h(r3) == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (defpackage.nw1.b(r13, r0, r0.length, r3) != r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (defpackage.nw1.b(r13, r0, r0.length, r3) == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (r1.emit(r2, r3) == r10) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        s46 s46Var;
        int i;
        int i2;
        f39 d39Var;
        eb8 eb8Var;
        f39 f39Var;
        int i3;
        aua auaVar;
        int i4;
        Object obj2;
        int i5 = this.a;
        Comparable comparable = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i5) {
            case 0:
                String str = (String) comparable;
                String str2 = (String) obj3;
                t tVar = (t) obj4;
                w46 w46Var = (w46) obj5;
                if (continuation instanceof s46) {
                    s46Var = (s46) continuation;
                    int i6 = s46Var.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        s46Var.l = i6 - Integer.MIN_VALUE;
                        Object obj7 = s46Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = s46Var.l;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        ResultKt.a(obj7);
                                        return Unit.INSTANCE;
                                    }
                                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i3 = s46Var.o;
                                eb8Var = s46Var.n;
                                ResultKt.a(obj7);
                                f39Var = (f39) obj7;
                            } else {
                                i3 = s46Var.o;
                                eb8Var = s46Var.n;
                                ResultKt.a(obj7);
                                f39Var = (f39) obj7;
                            }
                        } else {
                            ResultKt.a(obj7);
                            eb8 eb8Var2 = (eb8) obj6;
                            n46 n46Var = (n46) obj;
                            i2 = 0;
                            if (Intrinsics.areEqual(n46Var, k46.a)) {
                                s46Var.n = eb8Var2;
                                s46Var.o = 0;
                                s46Var.l = 1;
                                int i7 = w46.d;
                                Object b = w46Var.b(tVar, str2, str, s46Var);
                                if (b != u85Var) {
                                    eb8Var = eb8Var2;
                                    obj7 = b;
                                    i3 = 0;
                                    f39Var = (f39) obj7;
                                }
                            } else {
                                if (Intrinsics.areEqual(n46Var, l46.a)) {
                                    eb8Var = eb8Var2;
                                    f39Var = null;
                                } else {
                                    if (n46Var instanceof m46) {
                                        m46 m46Var = (m46) n46Var;
                                        if ((SystemClock.elapsedRealtime() - m46Var.b) / 1000 >= this.b) {
                                            s46Var.n = eb8Var2;
                                            s46Var.o = 0;
                                            s46Var.l = 2;
                                            int i8 = w46.d;
                                            Object b2 = w46Var.b(tVar, str2, str, s46Var);
                                            if (b2 != u85Var) {
                                                eb8Var = eb8Var2;
                                                obj7 = b2;
                                                i3 = 0;
                                                f39Var = (f39) obj7;
                                            }
                                        } else {
                                            d39Var = new e39(m46Var.a);
                                        }
                                    } else if (n46Var instanceof j46) {
                                        d39Var = new d39(((j46) n46Var).a);
                                    } else {
                                        dmk.a();
                                        return null;
                                    }
                                    eb8Var = eb8Var2;
                                    f39Var = d39Var;
                                }
                                if (f39Var != null) {
                                    s46Var.n = null;
                                    s46Var.o = i2;
                                    s46Var.l = 3;
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            return u85Var;
                        }
                        i2 = i3;
                        if (f39Var != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                s46Var = new s46(this, continuation);
                Object obj72 = s46Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = s46Var.l;
                if (i == 0) {
                }
                i2 = i3;
                if (f39Var != null) {
                }
                return Unit.INSTANCE;
            default:
                kw1 kw1Var = (kw1) obj6;
                if (continuation instanceof aua) {
                    auaVar = (aua) continuation;
                    int i9 = auaVar.l;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        auaVar.l = i9 - Integer.MIN_VALUE;
                        Object obj8 = auaVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i4 = auaVar.l;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        ResultKt.a(obj8);
                                        return Unit.INSTANCE;
                                    }
                                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ResultKt.a(obj8);
                                auaVar.l = 3;
                                break;
                            } else {
                                obj2 = auaVar.n;
                                ResultKt.a(obj8);
                            }
                        } else {
                            ResultKt.a(obj8);
                            int i10 = this.b;
                            this.b = i10 + 1;
                            if (i10 >= 0) {
                                if (i10 > 0) {
                                    byte[] bArr = ((jda) obj5).c;
                                    auaVar.n = obj;
                                    auaVar.l = 1;
                                    lw1 lw1Var = nw1.a;
                                    break;
                                }
                                obj2 = obj;
                            } else {
                                throw new ArithmeticException("Index overflow has happened");
                            }
                        }
                        byte[] f = yql.f(((cua) obj4).a.c((KSerializer) obj3, obj2), (Charset) comparable);
                        auaVar.n = null;
                        auaVar.l = 2;
                        lw1 lw1Var2 = nw1.a;
                        break;
                    }
                }
                auaVar = new aua(this, continuation);
                Object obj82 = auaVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i4 = auaVar.l;
                if (i4 == 0) {
                }
                byte[] f2 = yql.f(((cua) obj4).a.c((KSerializer) obj3, obj2), (Charset) comparable);
                auaVar.n = null;
                auaVar.l = 2;
                lw1 lw1Var22 = nw1.a;
        }
    }

    public t46(kw1 kw1Var, jda jdaVar, cua cuaVar, KSerializer kSerializer, Charset charset) {
        this.c = kw1Var;
        this.d = jdaVar;
        this.e = cuaVar;
        this.f = kSerializer;
        this.g = charset;
    }
}
