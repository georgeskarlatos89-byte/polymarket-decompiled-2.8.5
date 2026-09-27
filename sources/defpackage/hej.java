package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hej implements eb8 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ int[] d;

    public hej(Ref.ObjectRef objectRef, eb8 eb8Var, String[] strArr, int[] iArr) {
        this.a = objectRef;
        this.b = eb8Var;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r10.emit(r2, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r10.emit(r2, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int[] iArr, Continuation continuation) {
        gej gejVar;
        int i;
        hej hejVar = this;
        int[] iArr2 = iArr;
        if (continuation instanceof gej) {
            gejVar = (gej) continuation;
            int i2 = gejVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gejVar.o = i2 - Integer.MIN_VALUE;
                Object obj = gejVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gejVar.o;
                Object obj2 = null;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int[] iArr3 = gejVar.l;
                    hej hejVar2 = gejVar.k;
                    ResultKt.a(obj);
                    iArr2 = iArr3;
                    hejVar = hejVar2;
                } else {
                    ResultKt.a(obj);
                    Ref.ObjectRef objectRef = hejVar.a;
                    Object obj3 = objectRef.a;
                    String[] strArr = hejVar.c;
                    eb8 eb8Var = hejVar.b;
                    if (obj3 == null) {
                        Set l0 = ArraysKt.l0(strArr);
                        gejVar.k = hejVar;
                        gejVar.l = iArr2;
                        gejVar.o = 1;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj4 = objectRef.a;
                            if (obj4 != null) {
                                Object obj5 = obj2;
                                int i6 = hejVar.d[i4];
                                if (((int[]) obj4)[i6] != iArr2[i6]) {
                                    arrayList.add(str);
                                }
                                i3++;
                                obj2 = obj5;
                                i4 = i5;
                            } else {
                                Object obj6 = obj2;
                                dmk.n("Required value was null.");
                                return obj6;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Set Q0 = CollectionsKt.Q0(arrayList);
                            gejVar.k = hejVar;
                            gejVar.l = iArr2;
                            gejVar.o = 2;
                        }
                    }
                }
                hejVar.a.a = iArr2;
                return Unit.INSTANCE;
            }
        }
        gejVar = new gej(hejVar, continuation);
        Object obj7 = gejVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gejVar.o;
        Object obj22 = null;
        if (i == 0) {
        }
        hejVar.a.a = iArr2;
        return Unit.INSTANCE;
    }

    @Override // defpackage.eb8
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a((int[]) obj, continuation);
    }
}
