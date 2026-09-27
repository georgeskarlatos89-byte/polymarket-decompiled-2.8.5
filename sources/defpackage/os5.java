package defpackage;

import android.util.LruCache;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class os5 implements yzi {
    public final azi a;
    public final qzi b;
    public final byf c;
    public final bd5 d;
    public final bd5 e;
    public final bd5 f;
    public final LruCache g;

    public os5(azi aziVar, qzi qziVar, byf byfVar, bd5 bd5Var, bd5 bd5Var2, bd5 bd5Var3) {
        aziVar.getClass();
        qziVar.getClass();
        this.a = aziVar;
        this.b = qziVar;
        this.c = byfVar;
        this.d = bd5Var;
        this.e = bd5Var2;
        this.f = bd5Var3;
        this.g = new LruCache(1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0272, code lost:
    
        if (r5.insertThreads(r0, r2) != r3) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233 A[LOOP:4: B:61:0x022d->B:63:0x0233, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0254 A[LOOP:5: B:66:0x024e->B:68:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0178 -> B:18:0x0180). Please report as a decompilation issue!!! */
    @Override // defpackage.yzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(List list, Continuation continuation) {
        ns5 ns5Var;
        int i;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        ArrayList emptyList;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        Iterator it;
        int i3;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        if (continuation instanceof ns5) {
            ns5Var = (ns5) continuation;
            int i4 = ns5Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ns5Var.t = i4 - Integer.MIN_VALUE;
                Object obj = ns5Var.r;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ns5Var.t;
                azi aziVar = this.a;
                LruCache lruCache = this.g;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                List list3 = ns5Var.l;
                                List list4 = ns5Var.k;
                                ResultKt.a(obj);
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = ns5Var.q;
                        int i5 = ns5Var.p;
                        Collection collection = ns5Var.o;
                        Iterator it6 = ns5Var.n;
                        Collection collection2 = ns5Var.m;
                        List list5 = ns5Var.l;
                        List list6 = ns5Var.k;
                        ResultKt.a(obj);
                        arrayList4 = collection2;
                        arrayList3 = list5;
                        collection.add((Thread) obj);
                        i3 = i5;
                        it = it6;
                        list2 = list6;
                        if (!it.hasNext()) {
                            czi cziVar = (czi) it.next();
                            ns5Var.k = list2;
                            ns5Var.l = arrayList3;
                            ArrayList arrayList5 = arrayList4;
                            ns5Var.m = arrayList5;
                            ns5Var.n = it;
                            ns5Var.o = arrayList5;
                            ns5Var.p = i3;
                            ns5Var.q = i2;
                            ns5Var.t = 2;
                            Iterator it7 = it;
                            ns5 ns5Var2 = ns5Var;
                            Object c = pkm.c(cziVar, this.c, this.d, this.e, this.f, ns5Var2);
                            if (c != u85Var) {
                                it6 = it7;
                                list6 = list2;
                                ns5Var = ns5Var2;
                                i5 = i3;
                                obj = c;
                                collection = arrayList4;
                                collection.add((Thread) obj);
                                i3 = i5;
                                it = it6;
                                list2 = list6;
                                if (!it.hasNext()) {
                                    emptyList = arrayList4;
                                    arrayList = arrayList3;
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj2 : list2) {
                                        if (((Message) obj2).getParentId() != null) {
                                            arrayList6.add(obj2);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    it2 = arrayList6.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        String parentId = ((Message) next).getParentId();
                                        Object obj3 = linkedHashMap.get(parentId);
                                        if (obj3 == null) {
                                            obj3 = new ArrayList();
                                            linkedHashMap.put(parentId, obj3);
                                        }
                                        ((List) obj3).add(next);
                                    }
                                    ArrayList i0 = CollectionsKt.i0(arrayList, emptyList);
                                    ArrayList arrayList7 = new ArrayList(CollectionsKt.w(i0));
                                    it3 = i0.iterator();
                                    while (it3.hasNext()) {
                                        Thread thread = (Thread) it3.next();
                                        List list7 = (List) linkedHashMap.get(thread.getParentMessageId());
                                        if (list7 != null) {
                                            Iterator it8 = list7.iterator();
                                            while (it8.hasNext()) {
                                                thread = p2n.i(thread, (Message) it8.next());
                                            }
                                        }
                                        arrayList7.add(thread);
                                    }
                                    it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        Thread thread2 = (Thread) it4.next();
                                        lruCache.put(thread2.getParentMessageId(), thread2);
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.w(arrayList7));
                                    it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList8.add(pkm.b((Thread) it5.next()));
                                    }
                                    ns5Var.k = null;
                                    ns5Var.l = null;
                                    ns5Var.m = null;
                                    ns5Var.n = null;
                                    ns5Var.o = null;
                                    ns5Var.t = 3;
                                }
                            }
                            return u85Var;
                        }
                    } else {
                        List list8 = ns5Var.l;
                        list2 = ns5Var.k;
                        ResultKt.a(obj);
                        arrayList2 = list8;
                    }
                } else {
                    ResultKt.a(obj);
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        String parentId2 = ((Message) it9.next()).getParentId();
                        if (parentId2 != null) {
                            arrayList9.add(parentId2);
                        }
                    }
                    Set Q0 = CollectionsKt.Q0(arrayList9);
                    if (Q0.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    arrayList = new ArrayList();
                    Iterator it10 = Q0.iterator();
                    while (it10.hasNext()) {
                        Thread thread3 = (Thread) lruCache.get((String) it10.next());
                        if (thread3 != null) {
                            arrayList.add(thread3);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.w(arrayList));
                    Iterator it11 = arrayList.iterator();
                    while (it11.hasNext()) {
                        arrayList10.add(((Thread) it11.next()).getParentMessageId());
                    }
                    Set g = f.g(Q0, CollectionsKt.Q0(arrayList10));
                    if (g.isEmpty()) {
                        emptyList = CollectionsKt.emptyList();
                        list2 = list;
                        ArrayList arrayList62 = new ArrayList();
                        while (r4.hasNext()) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        it2 = arrayList62.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList i02 = CollectionsKt.i0(arrayList, emptyList);
                        ArrayList arrayList72 = new ArrayList(CollectionsKt.w(i02));
                        it3 = i02.iterator();
                        while (it3.hasNext()) {
                        }
                        it4 = arrayList72.iterator();
                        while (it4.hasNext()) {
                        }
                        ArrayList arrayList82 = new ArrayList(CollectionsKt.w(arrayList72));
                        it5 = arrayList72.iterator();
                        while (it5.hasNext()) {
                        }
                        ns5Var.k = null;
                        ns5Var.l = null;
                        ns5Var.m = null;
                        ns5Var.n = null;
                        ns5Var.o = null;
                        ns5Var.t = 3;
                    } else {
                        ns5Var.k = list;
                        ns5Var.l = arrayList;
                        ns5Var.t = 1;
                        obj = aziVar.selectThreads(g, ns5Var);
                        if (obj != u85Var) {
                            list2 = list;
                            arrayList2 = arrayList;
                        }
                        return u85Var;
                    }
                }
                Iterable iterable = (Iterable) obj;
                arrayList3 = arrayList2;
                arrayList4 = new ArrayList(CollectionsKt.w(iterable));
                i2 = 0;
                it = iterable.iterator();
                i3 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        ns5Var = new ns5(this, (q55) continuation);
        Object obj4 = ns5Var.r;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ns5Var.t;
        azi aziVar2 = this.a;
        LruCache lruCache2 = this.g;
        if (i == 0) {
        }
        Iterable iterable2 = (Iterable) obj4;
        arrayList3 = arrayList2;
        arrayList4 = new ArrayList(CollectionsKt.w(iterable2));
        i2 = 0;
        it = iterable2.iterator();
        i3 = 0;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r7.insertThread(r12, r6) != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // defpackage.yzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(Message message, Continuation continuation) {
        ms5 ms5Var;
        int i;
        String parentId;
        Thread thread;
        Object selectThread;
        Message message2;
        String str;
        czi cziVar;
        String str2;
        if (continuation instanceof ms5) {
            ms5Var = (ms5) continuation;
            int i2 = ms5Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ms5Var.o = i2 - Integer.MIN_VALUE;
                ms5 ms5Var2 = ms5Var;
                Object obj = ms5Var2.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ms5Var2.o;
                azi aziVar = this.a;
                LruCache lruCache = this.g;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.a(obj);
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = ms5Var2.l;
                        message = ms5Var2.k;
                        ResultKt.a(obj);
                        thread = (Thread) obj;
                        parentId = str2;
                        if (thread == null) {
                            return Unit.INSTANCE;
                        }
                        Thread i3 = p2n.i(thread, message);
                        lruCache.put(parentId, i3);
                        czi b = pkm.b(i3);
                        ms5Var2.k = null;
                        ms5Var2.l = null;
                        ms5Var2.o = 3;
                    } else {
                        str = ms5Var2.l;
                        Message message3 = ms5Var2.k;
                        ResultKt.a(obj);
                        selectThread = obj;
                        message2 = message3;
                    }
                } else {
                    ResultKt.a(obj);
                    parentId = message.getParentId();
                    if (parentId == null) {
                        return Unit.INSTANCE;
                    }
                    thread = (Thread) lruCache.get(parentId);
                    if (thread == null) {
                        ms5Var2.k = message;
                        ms5Var2.l = parentId;
                        ms5Var2.o = 1;
                        selectThread = aziVar.selectThread(parentId, ms5Var2);
                        if (selectThread != u85Var) {
                            message2 = message;
                            str = parentId;
                        }
                        return u85Var;
                    }
                    Thread i32 = p2n.i(thread, message);
                    lruCache.put(parentId, i32);
                    czi b2 = pkm.b(i32);
                    ms5Var2.k = null;
                    ms5Var2.l = null;
                    ms5Var2.o = 3;
                }
                cziVar = (czi) selectThread;
                if (cziVar == null) {
                    ms5Var2.k = message2;
                    ms5Var2.l = str;
                    ms5Var2.o = 2;
                    Object c = pkm.c(cziVar, this.c, this.d, this.e, this.f, ms5Var2);
                    if (c != u85Var) {
                        Message message4 = message2;
                        obj = c;
                        str2 = str;
                        message = message4;
                        thread = (Thread) obj;
                        parentId = str2;
                        if (thread == null) {
                        }
                        Thread i322 = p2n.i(thread, message);
                        lruCache.put(parentId, i322);
                        czi b22 = pkm.b(i322);
                        ms5Var2.k = null;
                        ms5Var2.l = null;
                        ms5Var2.o = 3;
                    }
                    return u85Var;
                }
                Message message5 = message2;
                parentId = str;
                message = message5;
                thread = null;
                if (thread == null) {
                }
                Thread i3222 = p2n.i(thread, message);
                lruCache.put(parentId, i3222);
                czi b222 = pkm.b(i3222);
                ms5Var2.k = null;
                ms5Var2.l = null;
                ms5Var2.o = 3;
            }
        }
        ms5Var = new ms5(this, (q55) continuation);
        ms5 ms5Var22 = ms5Var;
        Object obj2 = ms5Var22.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ms5Var22.o;
        azi aziVar2 = this.a;
        LruCache lruCache2 = this.g;
        if (i == 0) {
        }
        cziVar = (czi) selectThread;
        if (cziVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.yzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(String str, q55 q55Var) {
        ks5 ks5Var;
        int i;
        Thread thread;
        czi cziVar;
        String str2;
        if (q55Var instanceof ks5) {
            ks5Var = (ks5) q55Var;
            int i2 = ks5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ks5Var.n = i2 - Integer.MIN_VALUE;
                ks5 ks5Var2 = ks5Var;
                Object obj = ks5Var2.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ks5Var2.n;
                LruCache lruCache = this.g;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            str2 = ks5Var2.k;
                            ResultKt.a(obj);
                            thread = (Thread) obj;
                            str = str2;
                            if (thread == null) {
                                return null;
                            }
                            lruCache.put(str, thread);
                            return thread;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ks5Var2.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    thread = (Thread) lruCache.get(str);
                    if (thread == null) {
                        ks5Var2.k = str;
                        ks5Var2.n = 1;
                        obj = this.a.selectThread(str, ks5Var2);
                    }
                    lruCache.put(str, thread);
                    return thread;
                }
                cziVar = (czi) obj;
                if (cziVar == null) {
                    ks5Var2.k = str;
                    ks5Var2.n = 2;
                    obj = pkm.c(cziVar, this.c, this.d, this.e, this.f, ks5Var2);
                    if (obj != u85Var) {
                        str2 = str;
                        thread = (Thread) obj;
                        str = str2;
                        if (thread == null) {
                        }
                        lruCache.put(str, thread);
                        return thread;
                    }
                    return u85Var;
                }
                thread = null;
                if (thread == null) {
                }
                lruCache.put(str, thread);
                return thread;
            }
        }
        ks5Var = new ks5(this, q55Var);
        ks5 ks5Var22 = ks5Var;
        Object obj2 = ks5Var22.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ks5Var22.n;
        LruCache lruCache2 = this.g;
        if (i == 0) {
        }
        cziVar = (czi) obj2;
        if (cziVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r5.b.deleteAll(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5.a.deleteAll(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.yzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clear(Continuation continuation) {
        js5 js5Var;
        int i;
        if (continuation instanceof js5) {
            js5Var = (js5) continuation;
            int i2 = js5Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                js5Var.m = i2 - Integer.MIN_VALUE;
                Object obj = js5Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = js5Var.m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    this.g.evictAll();
                    js5Var.m = 1;
                }
                js5Var.m = 2;
            }
        }
        js5Var = new js5(this, (q55) continuation);
        Object obj2 = js5Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = js5Var.m;
        if (i == 0) {
        }
        js5Var.m = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0088 -> B:12:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00df -> B:11:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f0 -> B:12:0x00fa). Please report as a decompilation issue!!! */
    @Override // defpackage.yzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, Continuation continuation) {
        ls5 ls5Var;
        int i;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        ls5 ls5Var2;
        Iterator it2;
        int i6;
        int i7;
        int i8;
        int i9;
        czi cziVar;
        boolean hasNext;
        if (continuation instanceof ls5) {
            ls5Var = (ls5) continuation;
            int i10 = ls5Var.t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ls5Var.t = i10 - Integer.MIN_VALUE;
                Object obj = ls5Var.r;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ls5Var.t;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i8 = ls5Var.o;
                            int i11 = ls5Var.n;
                            int i12 = ls5Var.m;
                            Iterator it3 = ls5Var.l;
                            Collection collection = ls5Var.k;
                            ResultKt.a(obj);
                            ArrayList arrayList3 = collection;
                            Thread thread = (Thread) obj;
                            int i13 = i12;
                            i3 = i11;
                            i2 = i13;
                            it = it3;
                            i4 = i8;
                            arrayList = arrayList3;
                            if (thread != null) {
                                arrayList.add(thread);
                            }
                            hasNext = it.hasNext();
                            LruCache lruCache = this.g;
                            if (hasNext) {
                                String str = (String) it.next();
                                thread = (Thread) lruCache.get(str);
                                if (thread == null) {
                                    ls5Var.k = arrayList;
                                    ls5Var.l = it;
                                    ls5Var.m = i2;
                                    ls5Var.n = i3;
                                    ls5Var.o = i4;
                                    ls5Var.p = 0;
                                    ls5Var.q = 0;
                                    ls5Var.t = 1;
                                    Object selectThread = this.a.selectThread(str, ls5Var);
                                    if (selectThread != u85Var) {
                                        ls5Var2 = ls5Var;
                                        arrayList2 = arrayList;
                                        i9 = 0;
                                        i5 = i3;
                                        i8 = i4;
                                        it2 = it;
                                        i6 = i2;
                                        obj = selectThread;
                                        i7 = 0;
                                        cziVar = (czi) obj;
                                        if (cziVar == null) {
                                            ls5Var2.k = arrayList2;
                                            ls5Var2.l = it2;
                                            ls5Var2.m = i6;
                                            ls5Var2.n = i5;
                                            ls5Var2.o = i8;
                                            ls5Var2.p = i7;
                                            ls5Var2.q = i9;
                                            ls5Var2.t = 2;
                                            int i14 = i6;
                                            Iterator it4 = it2;
                                            Object c = pkm.c(cziVar, this.c, this.d, this.e, this.f, ls5Var2);
                                            if (c != u85Var) {
                                                i12 = i14;
                                                it3 = it4;
                                                obj = c;
                                                ls5Var = ls5Var2;
                                                i11 = i5;
                                                arrayList3 = arrayList2;
                                                Thread thread2 = (Thread) obj;
                                                int i132 = i12;
                                                i3 = i11;
                                                i2 = i132;
                                                it = it3;
                                                i4 = i8;
                                                arrayList = arrayList3;
                                            }
                                        } else {
                                            i2 = i6;
                                            it = it2;
                                            i4 = i8;
                                            thread2 = null;
                                            ls5Var = ls5Var2;
                                            i3 = i5;
                                            arrayList = arrayList2;
                                        }
                                    }
                                    return u85Var;
                                }
                                if (thread2 != null) {
                                }
                                hasNext = it.hasNext();
                                LruCache lruCache2 = this.g;
                                if (hasNext) {
                                    ArrayList<Thread> arrayList4 = arrayList;
                                    for (Thread thread3 : arrayList4) {
                                        lruCache2.put(thread3.getParentMessageId(), thread3);
                                    }
                                    return arrayList4;
                                }
                            }
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        int i15 = ls5Var.q;
                        i7 = ls5Var.p;
                        int i16 = ls5Var.o;
                        int i17 = ls5Var.n;
                        int i18 = ls5Var.m;
                        Iterator it5 = ls5Var.l;
                        Collection collection2 = ls5Var.k;
                        ResultKt.a(obj);
                        i5 = i17;
                        it2 = it5;
                        arrayList2 = collection2;
                        ls5Var2 = ls5Var;
                        i9 = i15;
                        i8 = i16;
                        i6 = i18;
                        cziVar = (czi) obj;
                        if (cziVar == null) {
                        }
                    }
                } else {
                    ResultKt.a(obj);
                    arrayList = new ArrayList();
                    it = list.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    hasNext = it.hasNext();
                    LruCache lruCache22 = this.g;
                    if (hasNext) {
                    }
                }
            }
        }
        ls5Var = new ls5(this, (q55) continuation);
        Object obj2 = ls5Var.r;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ls5Var.t;
        if (i == 0) {
        }
    }

    @Override // defpackage.yzi
    public final Object insertThreads(List list, Continuation continuation) {
        List<Thread> list2 = list;
        for (Thread thread : list2) {
            this.g.put(thread.getParentMessageId(), thread);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(pkm.b((Thread) it.next()));
        }
        Object insertThreads = this.a.insertThreads(arrayList, continuation);
        if (insertThreads == u85.COROUTINE_SUSPENDED) {
            return insertThreads;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.yzi
    public final Object o(String str, s0g s0gVar) {
        this.g.evictAll();
        Object deleteThreads = this.a.deleteThreads(str, s0gVar);
        if (deleteThreads == u85.COROUTINE_SUSPENDED) {
            return deleteThreads;
        }
        return Unit.INSTANCE;
    }
}
