package skip.lib;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/lib/CodingUserInfoKey;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CodingUserInfoKey implements RawRepresentable<String> {
    private final String rawValue;

    public CodingUserInfoKey(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CodingUserInfoKey)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((CodingUserInfoKey) other).getRawValue());
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
}
