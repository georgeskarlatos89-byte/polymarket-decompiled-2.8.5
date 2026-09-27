package kotlin.collections;

import defpackage.hb4;
import defpackage.l2i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "", "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "", "", "", "toByteArray", "(Ljava/util/Collection;)[B", "element", "plus", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class CollectionsKt___CollectionsKt extends hb4 {
    public static <T> T firstOrNull(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void m(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            l2i.a(appendable, obj, function1);
        }
        appendable.append(charSequence3);
    }

    public static final List n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.I0(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static byte[] toByteArray(Collection<Byte> collection) {
        collection.getClass();
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }
}
