package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uqd extends vqd {
    public final List a;

    public uqd(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.vqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, Continuation continuation) {
        tqd tqdVar;
        int i;
        Iterator it;
        Collection collection;
        Function2 function22;
        if (continuation instanceof tqd) {
            tqdVar = (tqd) continuation;
            int i2 = tqdVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqdVar.q = i2 - Integer.MIN_VALUE;
                Object obj = tqdVar.o;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = tqdVar.q;
                if (i == 0) {
                    if (i == 1) {
                        collection = tqdVar.n;
                        it = tqdVar.m;
                        Collection collection2 = tqdVar.l;
                        Function2 function23 = tqdVar.k;
                        ResultKt.a(obj);
                        collection.add(obj);
                        collection = collection2;
                        function22 = function23;
                        if (it.hasNext()) {
                            Object next = it.next();
                            tqdVar.k = function22;
                            Collection collection3 = collection;
                            tqdVar.l = collection3;
                            tqdVar.m = it;
                            tqdVar.n = collection3;
                            tqdVar.q = 1;
                            Object invoke = function22.invoke(next, tqdVar);
                            if (invoke == u85Var) {
                                return u85Var;
                            }
                            function23 = function22;
                            obj = invoke;
                            collection2 = collection;
                            collection.add(obj);
                            collection = collection2;
                            function22 = function23;
                            if (it.hasNext()) {
                                return new uqd((List) collection);
                            }
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    List list = this.a;
                    ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
                    it = list.iterator();
                    collection = arrayList;
                    function22 = function2;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        tqdVar = new tqd(this, (q55) continuation);
        Object obj2 = tqdVar.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = tqdVar.q;
        if (i == 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uqd) && Intrinsics.areEqual(this.a, ((uqd) obj).a) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + woa.b(0, this.a.hashCode() * 29791, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.S(list));
        sb.append("\n                    |   sourceLoadStates: null,\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
        return c.d(sb.toString().concat("|)"));
    }
}
