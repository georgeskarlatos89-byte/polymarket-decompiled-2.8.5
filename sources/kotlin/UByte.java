package kotlin;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.tjj;
import kotlin.jvm.internal.Intrinsics;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\b"}, d2 = {"Lkotlin/UByte;", "", "", ApiConstant.KEY_DATA, "constructor-impl", "(B)B", "b", "tjj", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UByte implements Comparable<UByte> {
    public static final tjj b = new tjj(null);
    public final byte a;

    public /* synthetic */ UByte(byte b2) {
        this.a = b2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m884boximpl(byte b2) {
        return new UByte(b2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.d(this.a & MessagePack.Code.EXT_TIMESTAMP, uByte.a & MessagePack.Code.EXT_TIMESTAMP);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UByte) {
            if (this.a != ((UByte) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & MessagePack.Code.EXT_TIMESTAMP);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m885constructorimpl(byte b2) {
        return b2;
    }
}
