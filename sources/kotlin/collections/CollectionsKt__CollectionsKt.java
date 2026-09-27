package kotlin.collections;

import defpackage.dmk;
import defpackage.eb4;
import defpackage.f27;
import defpackage.m51;
import defpackage.sv6;
import defpackage.yc7;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "", "emptyList", "()Ljava/util/List;", "", "elements", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "", "throwIndexOverflow", "()V", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class CollectionsKt__CollectionsKt extends eb4 {
    public static final List d(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return eb4.c(list.get(0));
        }
        return emptyList();
    }

    public static final void e(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return;
            }
            f27.m(m51.j(i2, "toIndex (", i, ") is greater than size (", ")."));
            return;
        }
        dmk.v(sv6.j(i2, "fromIndex (0) is greater than toIndex (", ")."));
    }

    public static <T> List<T> emptyList() {
        return yc7.a;
    }

    public static <T> List<T> listOf(T... tArr) {
        tArr.getClass();
        if (tArr.length > 0) {
            List<T> asList = Arrays.asList(tArr);
            asList.getClass();
            return asList;
        }
        return emptyList();
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
