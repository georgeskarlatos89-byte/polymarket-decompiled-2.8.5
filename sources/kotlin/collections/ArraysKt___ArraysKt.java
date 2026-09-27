package kotlin.collections;

import defpackage.l2i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "T", "", "", "filterNotNull", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "getLastIndex", "([B)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes6.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final void c(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            l2i.a(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static final void d(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static <T> List<T> filterNotNull(T[] tArr) {
        tArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final int getLastIndex(byte[] bArr) {
        bArr.getClass();
        return bArr.length - 1;
    }
}
