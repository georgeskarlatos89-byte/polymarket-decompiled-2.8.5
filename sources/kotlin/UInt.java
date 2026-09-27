package kotlin;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.akj;
import defpackage.ozm;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\b"}, d2 = {"Lkotlin/UInt;", "", "", ApiConstant.KEY_DATA, "constructor-impl", "(I)I", "b", "akj", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UInt implements Comparable<UInt> {
    public static final akj b = new akj(null);
    public final int a;

    public /* synthetic */ UInt(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UInt uInt) {
        return ozm.f(this.a, uInt.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UInt) {
            if (this.a != ((UInt) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m886constructorimpl(int i) {
        return i;
    }
}
