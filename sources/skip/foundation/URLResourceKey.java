package skip.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lskip/foundation/URLResourceKey;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "unusedp_0", "", "(Ljava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class URLResourceKey implements RawRepresentable<String> {
    private final String rawValue;

    public URLResourceKey(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public boolean equals(Object other) {
        if (!(other instanceof URLResourceKey)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((URLResourceKey) other).getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    public URLResourceKey(String str, Void r2) {
        str.getClass();
        this.rawValue = str;
    }

    public /* synthetic */ URLResourceKey(String str, Void r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : r2);
    }
}
