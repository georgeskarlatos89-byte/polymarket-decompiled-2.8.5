package kotlin.collections;

import defpackage.pl0;
import defpackage.ql0;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "fromIndex", "toIndex", "copyOfRange", "([BII)[B", "copyOfRangeImpl", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes6.dex */
public class ArraysKt___ArraysJvmKt extends ql0 {
    public static byte[] copyOfRange(byte[] bArr, int i, int i2) {
        bArr.getClass();
        pl0.a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }
}
