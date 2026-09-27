package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jfj implements Flow, eb8 {
    public final orc a = new orc();
    public final HashSet b = new HashSet();

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(2:12|(2:14|15)(4:17|18|19|20))(5:24|25|26|27|28))(4:33|34|35|36))(4:37|38|39|40))(4:55|56|(1:58)|46)|41|42|43|(2:45|46)|35|36))|60|6|7|(0)(0)|41|42|43|(0)|35|36|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if (r3.e(r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        hfj hfjVar;
        u85 u85Var;
        int i;
        orc orcVar;
        int i2;
        try {
            if (continuation instanceof hfj) {
                hfjVar = (hfj) continuation;
                int i3 = hfjVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hfjVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = hfjVar.n;
                    u85Var = u85.COROUTINE_SUSPENDED;
                    i = hfjVar.p;
                    orc orcVar2 = this.a;
                    HashSet hashSet = this.b;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    eb8 eb8Var2 = hfjVar.k;
                                    ResultKt.a(obj);
                                    hashSet.remove(eb8Var2);
                                    throw null;
                                }
                                orcVar2 = hfjVar.l;
                                eb8Var = hfjVar.k;
                                ResultKt.a(obj);
                                try {
                                    hashSet.remove(eb8Var);
                                    orcVar.o(null);
                                    return Unit.INSTANCE;
                                } finally {
                                }
                            }
                            eb8 eb8Var3 = hfjVar.k;
                            ResultKt.a(obj);
                            throw new RuntimeException();
                        }
                        int i4 = hfjVar.m;
                        orcVar = hfjVar.l;
                        eb8 eb8Var4 = hfjVar.k;
                        try {
                            ResultKt.a(obj);
                            i2 = i4;
                            eb8Var = eb8Var4;
                        } catch (Throwable unused) {
                            eb8Var = eb8Var4;
                            hfjVar.k = eb8Var;
                            hfjVar.l = orcVar2;
                            hfjVar.m = 0;
                            hfjVar.p = 3;
                        }
                    } else {
                        ResultKt.a(obj);
                        hfjVar.k = eb8Var;
                        hfjVar.l = orcVar2;
                        hfjVar.m = 0;
                        hfjVar.p = 1;
                        if (orcVar2.e(hfjVar) != u85Var) {
                            orcVar = orcVar2;
                            i2 = 0;
                        }
                        return u85Var;
                    }
                    hashSet.add(eb8Var);
                    orcVar.o(null);
                    hfjVar.k = eb8Var;
                    hfjVar.l = null;
                    hfjVar.m = i2;
                    hfjVar.p = 2;
                    if (lvn.a(hfjVar) == u85Var) {
                        return u85Var;
                    }
                    throw new RuntimeException();
                }
            }
            hashSet.add(eb8Var);
            orcVar.o(null);
            hfjVar.k = eb8Var;
            hfjVar.l = null;
            hfjVar.m = i2;
            hfjVar.p = 2;
            if (lvn.a(hfjVar) == u85Var) {
            }
            throw new RuntimeException();
        } finally {
        }
        hfjVar = new hfj(this, continuation);
        Object obj2 = hfjVar.n;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = hfjVar.p;
        orc orcVar22 = this.a;
        HashSet hashSet2 = this.b;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:15:0x006b, B:17:0x0071), top: B:14:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ifj ifjVar;
        int i;
        mrc mrcVar;
        int i2;
        Iterator it;
        Object obj2;
        int i3;
        int i4;
        mrc mrcVar2;
        int i5;
        try {
            try {
                if (continuation instanceof ifj) {
                    ifjVar = (ifj) continuation;
                    int i6 = ifjVar.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ifjVar.s = i6 - Integer.MIN_VALUE;
                        Object obj3 = ifjVar.q;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = ifjVar.s;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    int i7 = ifjVar.p;
                                    int i8 = ifjVar.o;
                                    i5 = ifjVar.n;
                                    it = ifjVar.m;
                                    mrcVar2 = ifjVar.l;
                                    obj2 = ifjVar.k;
                                    try {
                                        ResultKt.a(obj3);
                                    } catch (Throwable unused) {
                                    }
                                    int i9 = i8;
                                    i4 = i7;
                                    i3 = i9;
                                    if (!it.hasNext()) {
                                        eb8 eb8Var = (eb8) it.next();
                                        try {
                                        } catch (Throwable unused2) {
                                            int i10 = i4;
                                            i8 = i3;
                                            i7 = i10;
                                        }
                                        ifjVar.k = obj2;
                                        ifjVar.l = mrcVar2;
                                        ifjVar.m = it;
                                        ifjVar.n = i5;
                                        ifjVar.o = i3;
                                        ifjVar.p = i4;
                                        ifjVar.s = 2;
                                        if (eb8Var.emit(obj2, ifjVar) != u85Var) {
                                            int i11 = i4;
                                            i8 = i3;
                                            i7 = i11;
                                            int i92 = i8;
                                            i4 = i7;
                                            i3 = i92;
                                            if (!it.hasNext()) {
                                                mrcVar2.o(null);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        return u85Var;
                                    }
                                } else {
                                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                int i12 = ifjVar.n;
                                mrcVar = ifjVar.l;
                                Object obj4 = ifjVar.k;
                                ResultKt.a(obj3);
                                i2 = i12;
                                obj = obj4;
                            }
                        } else {
                            ResultKt.a(obj3);
                            ifjVar.k = obj;
                            mrcVar = this.a;
                            ifjVar.l = mrcVar;
                            ifjVar.n = 0;
                            ifjVar.s = 1;
                            if (mrcVar.e(ifjVar) != u85Var) {
                                i2 = 0;
                            }
                            return u85Var;
                        }
                        it = this.b.iterator();
                        obj2 = obj;
                        i3 = 0;
                        i4 = 0;
                        mrcVar2 = mrcVar;
                        i5 = i2;
                        if (!it.hasNext()) {
                        }
                    }
                }
                if (!it.hasNext()) {
                }
            } catch (Throwable th) {
                th = th;
                mrcVar = mrcVar2;
                mrcVar.o(null);
                throw th;
            }
            it = this.b.iterator();
            obj2 = obj;
            i3 = 0;
            i4 = 0;
            mrcVar2 = mrcVar;
            i5 = i2;
        } catch (Throwable th2) {
            th = th2;
            mrcVar.o(null);
            throw th;
        }
        ifjVar = new ifj(this, continuation);
        Object obj32 = ifjVar.q;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ifjVar.s;
        if (i == 0) {
        }
    }
}
