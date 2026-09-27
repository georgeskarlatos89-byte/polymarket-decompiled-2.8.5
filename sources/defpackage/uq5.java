package defpackage;

import io.getstream.chat.android.models.ChannelConfig;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uq5 implements hf3 {
    public final af3 a;
    public final Map b;

    public uq5(af3 af3Var) {
        af3Var.getClass();
        this.a = af3Var;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        synchronizedMap.getClass();
        this.b = synchronizedMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0146 A[LOOP:2: B:24:0x0140->B:26:0x0146, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.hf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(Continuation continuation) {
        tq5 tq5Var;
        int i;
        Map map;
        Iterator it;
        int a;
        Iterator it2;
        if (continuation instanceof tq5) {
            tq5Var = (tq5) continuation;
            int i2 = tq5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tq5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = tq5Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = tq5Var.n;
                if (i == 0) {
                    if (i == 1) {
                        map = tq5Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    Map map2 = this.b;
                    tq5Var.k = map2;
                    tq5Var.n = 1;
                    Object selectAll = this.a.selectAll(tq5Var);
                    if (selectAll == u85Var) {
                        return u85Var;
                    }
                    obj = selectAll;
                    map = map2;
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.w(iterable));
                it = iterable.iterator();
                while (it.hasNext()) {
                    ff3 ff3Var = (ff3) it.next();
                    ff3Var.getClass();
                    gf3 gf3Var = ff3Var.a;
                    String str = gf3Var.a;
                    Date date = gf3Var.b;
                    Date date2 = gf3Var.c;
                    String str2 = gf3Var.d;
                    boolean z = gf3Var.e;
                    boolean z2 = gf3Var.f;
                    boolean z3 = gf3Var.g;
                    boolean z4 = gf3Var.h;
                    boolean z5 = gf3Var.i;
                    boolean z6 = gf3Var.j;
                    boolean z7 = gf3Var.k;
                    Iterator it3 = it;
                    boolean z8 = gf3Var.l;
                    boolean z9 = gf3Var.m;
                    boolean z10 = gf3Var.n;
                    boolean z11 = gf3Var.o;
                    boolean z12 = gf3Var.p;
                    String str3 = gf3Var.q;
                    int i3 = gf3Var.r;
                    String str4 = gf3Var.s;
                    String str5 = gf3Var.t;
                    String str6 = gf3Var.u;
                    List list = ff3Var.b;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        lh4 lh4Var = (lh4) it4.next();
                        arrayList2.add(new Command(lh4Var.a, lh4Var.b, lh4Var.c, lh4Var.d));
                        it4 = it5;
                        z7 = z7;
                        date = date;
                        date2 = date2;
                        str2 = str2;
                    }
                    arrayList.add(new ChannelConfig(str, new Config(date, date2, str2, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, false, false, str3, i3, str4, str5, str6, arrayList2, gf3Var.v, false, gf3Var.w, gf3Var.x, 16875520, null)));
                    it = it3;
                }
                a = c1c.a(CollectionsKt.w(arrayList));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(((ChannelConfig) next).getType(), next);
                }
                map.putAll(linkedHashMap);
                return Unit.INSTANCE;
            }
        }
        tq5Var = new tq5(this, (q55) continuation);
        Object obj2 = tq5Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = tq5Var.n;
        if (i == 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(iterable2));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        a = c1c.a(CollectionsKt.w(arrayList3));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
        it2 = arrayList3.iterator();
        while (it2.hasNext()) {
        }
        map.putAll(linkedHashMap2);
        return Unit.INSTANCE;
    }

    @Override // defpackage.hf3
    public final Object c(ArrayList arrayList, q55 q55Var) {
        int a = c1c.a(CollectionsKt.w(arrayList));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : arrayList) {
            linkedHashMap.put(((ChannelConfig) obj).getType(), obj);
        }
        this.b.putAll(linkedHashMap);
        Collection values = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(values));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(imn.b((ChannelConfig) it.next()));
        }
        Object insert = this.a.insert(arrayList2, q55Var);
        if (insert == u85.COROUTINE_SUSPENDED) {
            return insert;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.hf3
    public final Object clear(Continuation continuation) {
        Object deleteAll = this.a.deleteAll(continuation);
        if (deleteAll == u85.COROUTINE_SUSPENDED) {
            return deleteAll;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.hf3
    public final Object m0(ChannelConfig channelConfig, ajf ajfVar) {
        Pair pair = new Pair(channelConfig.getType(), channelConfig);
        this.b.put(pair.getFirst(), pair.getSecond());
        Object insert = this.a.insert(imn.b(channelConfig), ajfVar);
        if (insert == u85.COROUTINE_SUSPENDED) {
            return insert;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.hf3
    public final ChannelConfig x(String str) {
        str.getClass();
        return (ChannelConfig) this.b.get(str);
    }
}
