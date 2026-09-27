package defpackage;

import android.net.Uri;
import android.os.Bundle;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wo1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;

    public wo1(int i) {
        this.a = 1;
        this.b = i;
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
    }

    public void a(String str) {
        str.getClass();
        ((LinkedHashSet) this.g).add(str);
    }

    public void b(ArrayList arrayList) {
        CollectionsKt.o((LinkedHashSet) this.c, arrayList);
    }

    public void c(ArrayList arrayList) {
        CollectionsKt.o((LinkedHashSet) this.e, arrayList);
    }

    public void d(ArrayList arrayList) {
        CollectionsKt.o((LinkedHashSet) this.d, arrayList);
    }

    public void e(ArrayList arrayList) {
        CollectionsKt.o((LinkedHashSet) this.f, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
    
        if (r1 == r3) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0026. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0244 A[LOOP:0: B:16:0x023e->B:18:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b2 A[LOOP:1: B:27:0x02ac->B:29:0x02b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f4 A[LOOP:2: B:39:0x01ee->B:41:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0173 -> B:45:0x0179). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(yoc yocVar, e1g e1gVar, String str, q55 q55Var) {
        cl7 cl7Var;
        String str2;
        Iterator it;
        cl7 cl7Var2;
        int i;
        yoc yocVar2;
        e1g e1gVar2;
        e1g e1gVar3;
        yoc yocVar3;
        String str3;
        yoc yocVar4;
        Iterator it2;
        Collection collection;
        e1g e1gVar4;
        Collection collection2;
        int i2;
        LinkedHashMap linkedHashMap;
        yoc yocVar5;
        String str4;
        cl7 cl7Var3;
        e1g e1gVar5;
        int i3;
        yoc yocVar6;
        int a;
        Map map;
        Map map2;
        String str5;
        e1g e1gVar6;
        int a2;
        r8a r8aVar;
        g6f g6fVar;
        int a3;
        int i4;
        if (q55Var instanceof cl7) {
            cl7Var = (cl7) q55Var;
            int i5 = cl7Var.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cl7Var.w = i5 - Integer.MIN_VALUE;
                Object obj = cl7Var.u;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i6 = 0;
                switch (cl7Var.w) {
                    case 0:
                        ResultKt.a(obj);
                        str2 = str;
                        it = ((LinkedHashSet) this.d).iterator();
                        cl7Var2 = cl7Var;
                        i = 0;
                        yocVar2 = yocVar;
                        e1gVar2 = e1gVar;
                        while (true) {
                            if (!it.hasNext()) {
                                String str6 = (String) it.next();
                                cl7Var2.k = yocVar2;
                                cl7Var2.l = e1gVar2;
                                cl7Var2.m = str2;
                                cl7Var2.n = null;
                                cl7Var2.o = it;
                                cl7Var2.p = null;
                                cl7Var2.q = null;
                                cl7Var2.s = i;
                                cl7Var2.t = 0;
                                cl7Var2.w = 1;
                                if (e1gVar2.P(str6, cl7Var2) == u85Var) {
                                }
                            } else {
                                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f;
                                cl7Var2.k = yocVar2;
                                cl7Var2.l = e1gVar2;
                                cl7Var2.m = str2;
                                cl7Var2.n = null;
                                cl7Var2.o = null;
                                cl7Var2.p = null;
                                cl7Var2.q = null;
                                cl7Var2.w = 2;
                                if (e1gVar2.a.B(linkedHashSet, cl7Var2) != u85Var) {
                                    cl7 cl7Var4 = cl7Var2;
                                    e1gVar3 = e1gVar2;
                                    cl7Var = cl7Var4;
                                    yocVar3 = yocVar2;
                                    break;
                                }
                            }
                        }
                        return u85Var;
                    case 1:
                        int i7 = cl7Var.s;
                        Iterator it3 = (Iterator) cl7Var.o;
                        String str7 = cl7Var.m;
                        e1g e1gVar7 = cl7Var.l;
                        yoc yocVar7 = cl7Var.k;
                        ResultKt.a(obj);
                        cl7Var2 = cl7Var;
                        e1gVar2 = e1gVar7;
                        it = it3;
                        i = i7;
                        str2 = str7;
                        yocVar2 = yocVar7;
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        return u85Var;
                    case 2:
                        str2 = cl7Var.m;
                        e1gVar3 = cl7Var.l;
                        yocVar3 = cl7Var.k;
                        ResultKt.a(obj);
                        List M0 = CollectionsKt.M0((LinkedHashSet) this.e);
                        cl7Var.k = yocVar3;
                        cl7Var.l = e1gVar3;
                        cl7Var.m = str2;
                        cl7Var.w = 3;
                        obj = e1gVar3.f.e0(M0, cl7Var);
                        break;
                    case 3:
                        str2 = cl7Var.m;
                        e1gVar3 = cl7Var.l;
                        yocVar3 = cl7Var.k;
                        ResultKt.a(obj);
                        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.g;
                        ArrayList arrayList = new ArrayList();
                        str3 = str2;
                        yocVar4 = yocVar3;
                        it2 = linkedHashSet2.iterator();
                        collection = arrayList;
                        e1gVar4 = e1gVar3;
                        collection2 = (Collection) obj;
                        i2 = 0;
                        if (it2.hasNext()) {
                            String str8 = (String) it2.next();
                            cl7Var.k = yocVar4;
                            cl7Var.l = e1gVar4;
                            cl7Var.m = str3;
                            cl7Var.n = null;
                            cl7Var.o = null;
                            cl7Var.p = collection;
                            cl7Var.q = it2;
                            cl7Var.r = collection2;
                            cl7Var.s = i6;
                            cl7Var.t = i2;
                            cl7Var.w = 4;
                            Object selectMessagesWithPoll = e1gVar4.f.selectMessagesWithPoll(str8, cl7Var);
                            if (selectMessagesWithPoll != u85Var) {
                                yoc yocVar8 = yocVar4;
                                i3 = i2;
                                obj = selectMessagesWithPoll;
                                yocVar6 = yocVar8;
                                CollectionsKt.o(collection, (Iterable) obj);
                                i2 = i3;
                                yocVar4 = yocVar6;
                                if (it2.hasNext()) {
                                    ArrayList i0 = CollectionsKt.i0(collection2, (List) collection);
                                    int a4 = c1c.a(CollectionsKt.w(i0));
                                    if (a4 < 16) {
                                        a4 = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(a4);
                                    Iterator it4 = i0.iterator();
                                    while (it4.hasNext()) {
                                        Object next = it4.next();
                                        linkedHashMap.put(((Message) next).getId(), next);
                                    }
                                    List M02 = CollectionsKt.M0((LinkedHashSet) this.c);
                                    cl7Var.k = yocVar4;
                                    cl7Var.l = e1gVar4;
                                    cl7Var.m = str3;
                                    cl7Var.n = linkedHashMap;
                                    cl7Var.o = null;
                                    cl7Var.p = null;
                                    cl7Var.q = null;
                                    cl7Var.r = null;
                                    cl7Var.w = 5;
                                    obj = e1gVar4.g0(M02, null, cl7Var);
                                    if (obj != u85Var) {
                                        yocVar5 = yocVar4;
                                        str4 = str3;
                                        cl7Var3 = cl7Var;
                                        e1gVar5 = e1gVar4;
                                        Iterable iterable = (Iterable) obj;
                                        a = c1c.a(CollectionsKt.w(iterable));
                                        if (a < 16) {
                                            a = 16;
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
                                        for (Object obj2 : iterable) {
                                            linkedHashMap2.put(((Channel) obj2).getCid(), obj2);
                                        }
                                        List M03 = CollectionsKt.M0((LinkedHashSet) this.h);
                                        cl7Var3.k = yocVar5;
                                        cl7Var3.l = e1gVar5;
                                        cl7Var3.m = str4;
                                        cl7Var3.n = linkedHashMap;
                                        cl7Var3.o = linkedHashMap2;
                                        cl7Var3.w = 6;
                                        obj = e1gVar5.e.d(M03, cl7Var3);
                                        if (obj != u85Var) {
                                            map = linkedHashMap;
                                            map2 = linkedHashMap2;
                                            str5 = str4;
                                            e1gVar6 = e1gVar5;
                                            Iterable iterable2 = (Iterable) obj;
                                            a2 = c1c.a(CollectionsKt.w(iterable2));
                                            if (a2 < 16) {
                                                a2 = 16;
                                            }
                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(a2);
                                            for (Object obj3 : iterable2) {
                                                linkedHashMap3.put(((Thread) obj3).getParentMessageId(), obj3);
                                            }
                                            boolean z = yzh.a;
                                            r8aVar = yzh.c;
                                            g6fVar = g6f.VERBOSE;
                                            if (r8aVar.g(g6fVar, "Chat:EventBatchUpdate")) {
                                                a0i a0iVar = yzh.b;
                                                int i8 = this.b;
                                                int size = map.size();
                                                int size2 = map2.size();
                                                StringBuilder n = m51.n(i8, "[builder.build] id: ", size, ", messageMap.size: ", ", channelMap.size: ");
                                                n.append(size2);
                                                a0iVar.a(g6fVar, "Chat:EventBatchUpdate", n.toString(), null);
                                            }
                                            int i9 = this.b;
                                            LinkedHashMap p = d1c.p(map2);
                                            LinkedHashMap p2 = d1c.p(map);
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                                            LinkedHashSet linkedHashSet3 = (LinkedHashSet) this.f;
                                            a3 = c1c.a(CollectionsKt.w(linkedHashSet3));
                                            if (a3 >= 16) {
                                                i4 = 16;
                                            } else {
                                                i4 = a3;
                                            }
                                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(i4);
                                            for (Object obj4 : linkedHashSet3) {
                                                linkedHashMap5.put(((User) obj4).getId(), obj4);
                                            }
                                            return new el7(i9, str5, e1gVar6, p, p2, linkedHashMap4, new LinkedHashMap(linkedHashMap5));
                                        }
                                    }
                                }
                            }
                        }
                        return u85Var;
                    case 4:
                        i3 = cl7Var.t;
                        i6 = cl7Var.s;
                        collection2 = cl7Var.r;
                        it2 = cl7Var.q;
                        collection = cl7Var.p;
                        str3 = cl7Var.m;
                        e1gVar4 = cl7Var.l;
                        yocVar6 = cl7Var.k;
                        ResultKt.a(obj);
                        CollectionsKt.o(collection, (Iterable) obj);
                        i2 = i3;
                        yocVar4 = yocVar6;
                        if (it2.hasNext()) {
                        }
                        return u85Var;
                    case 5:
                        Map map3 = cl7Var.n;
                        str4 = cl7Var.m;
                        e1g e1gVar8 = cl7Var.l;
                        yocVar5 = cl7Var.k;
                        ResultKt.a(obj);
                        cl7Var3 = cl7Var;
                        e1gVar5 = e1gVar8;
                        linkedHashMap = map3;
                        Iterable iterable3 = (Iterable) obj;
                        a = c1c.a(CollectionsKt.w(iterable3));
                        if (a < 16) {
                        }
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap(a);
                        while (r1.hasNext()) {
                        }
                        List M032 = CollectionsKt.M0((LinkedHashSet) this.h);
                        cl7Var3.k = yocVar5;
                        cl7Var3.l = e1gVar5;
                        cl7Var3.m = str4;
                        cl7Var3.n = linkedHashMap;
                        cl7Var3.o = linkedHashMap22;
                        cl7Var3.w = 6;
                        obj = e1gVar5.e.d(M032, cl7Var3);
                        if (obj != u85Var) {
                        }
                        return u85Var;
                    case 6:
                        map2 = (Map) cl7Var.o;
                        map = cl7Var.n;
                        String str9 = cl7Var.m;
                        e1g e1gVar9 = cl7Var.l;
                        ResultKt.a(obj);
                        e1gVar6 = e1gVar9;
                        str5 = str9;
                        Iterable iterable22 = (Iterable) obj;
                        a2 = c1c.a(CollectionsKt.w(iterable22));
                        if (a2 < 16) {
                        }
                        LinkedHashMap linkedHashMap32 = new LinkedHashMap(a2);
                        while (r1.hasNext()) {
                        }
                        boolean z2 = yzh.a;
                        r8aVar = yzh.c;
                        g6fVar = g6f.VERBOSE;
                        if (r8aVar.g(g6fVar, "Chat:EventBatchUpdate")) {
                        }
                        int i92 = this.b;
                        LinkedHashMap p3 = d1c.p(map2);
                        LinkedHashMap p22 = d1c.p(map);
                        LinkedHashMap linkedHashMap42 = new LinkedHashMap(linkedHashMap32);
                        LinkedHashSet linkedHashSet32 = (LinkedHashSet) this.f;
                        a3 = c1c.a(CollectionsKt.w(linkedHashSet32));
                        if (a3 >= 16) {
                        }
                        LinkedHashMap linkedHashMap52 = new LinkedHashMap(i4);
                        while (r0.hasNext()) {
                        }
                        return new el7(i92, str5, e1gVar6, p3, p22, linkedHashMap42, new LinkedHashMap(linkedHashMap52));
                    default:
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        cl7Var = new cl7(this, q55Var);
        Object obj5 = cl7Var.u;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        int i62 = 0;
        switch (cl7Var.w) {
        }
    }

    public ytc g(String str) {
        ttc ttcVar;
        str.getClass();
        Lazy lazy = (Lazy) this.h;
        if (lazy != null && (ttcVar = (ttc) lazy.getValue()) != null) {
            int i = ztc.f;
            Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
            parse.getClass();
            Bundle d = ttcVar.d(parse, (LinkedHashMap) this.e);
            if (d != null) {
                return new ytc((ztc) this.c, d, ttcVar.p, ttcVar.b(parse), false, -1);
            }
            return null;
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((msa) this.c) + " version=" + ((lfc) this.d);
            default:
                return super.toString();
        }
    }

    public wo1(msa msaVar, lfc lfcVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        this.a = 2;
        msaVar.getClass();
        this.c = msaVar;
        this.d = lfcVar;
        this.e = strArr;
        this.f = strArr2;
        this.h = strArr3;
        this.g = str;
        this.b = i;
    }

    public wo1(ztc ztcVar) {
        this.a = 3;
        this.c = ztcVar;
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public /* synthetic */ wo1() {
        this.a = 0;
    }
}
