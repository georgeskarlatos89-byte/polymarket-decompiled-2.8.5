package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qkf {
    public final e1g a;
    public final e1g b;

    public /* synthetic */ qkf(e1g e1gVar, e1g e1gVar2) {
        this.a = e1gVar;
        this.b = e1gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r4.b.c.M(r6, r7, r5) != r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r4.a.n(r7, r5) == r8) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, String str2, Message message, Continuation continuation) {
        avg avgVar;
        int i;
        if (continuation instanceof avg) {
            avgVar = (avg) continuation;
            int i2 = avgVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                avgVar.n = i2 - Integer.MIN_VALUE;
                Object obj = avgVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = avgVar.n;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    message = avgVar.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    avgVar.k = message;
                    avgVar.n = 1;
                }
                String cid = message.getCid();
                avgVar.k = null;
                avgVar.n = 2;
            }
        }
        avgVar = new avg(this, (q55) continuation);
        Object obj2 = avgVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = avgVar.n;
        if (i == 0) {
        }
        String cid2 = message.getCid();
        avgVar.k = null;
        avgVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r4.b.X(r6, r5, r10) != r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r4.a.a.B(r13, r10) == r12) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(w5g w5gVar, String str, String str2, int i, int i2, FilterObject filterObject, QuerySorter querySorter, List list, Continuation continuation) {
        pkf pkfVar;
        int i3;
        List list2;
        if (continuation instanceof pkf) {
            pkfVar = (pkf) continuation;
            int i4 = pkfVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pkfVar.r = i4 - Integer.MIN_VALUE;
                Object obj = pkfVar.p;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i3 = pkfVar.r;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            List list3 = pkfVar.m;
                            ResultKt.a(obj);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = pkfVar.o;
                    i = pkfVar.n;
                    list2 = pkfVar.m;
                    str2 = pkfVar.l;
                    str = pkfVar.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    if (w5gVar instanceof u5g) {
                        list2 = (List) ((u5g) w5gVar).a;
                        List list4 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.w(list4));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Member) it.next()).getUser());
                        }
                        pkfVar.k = str;
                        pkfVar.l = str2;
                        pkfVar.m = list2;
                        pkfVar.n = i;
                        pkfVar.o = i2;
                        pkfVar.r = 1;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                String b = uln.b(new Pair(str, str2));
                pkfVar.k = null;
                pkfVar.l = null;
                pkfVar.m = null;
                pkfVar.n = i;
                pkfVar.o = i2;
                pkfVar.r = 2;
            }
        }
        pkfVar = new pkf(this, (q55) continuation);
        Object obj2 = pkfVar.p;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i3 = pkfVar.r;
        if (i3 == 0) {
        }
        String b2 = uln.b(new Pair(str, str2));
        pkfVar.k = null;
        pkfVar.l = null;
        pkfVar.m = null;
        pkfVar.n = i;
        pkfVar.o = i2;
        pkfVar.r = 2;
    }
}
