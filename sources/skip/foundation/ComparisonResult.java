package skip.foundation;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000eB\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lskip/foundation/ComparisonResult;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "orderedAscending", "orderedSame", "orderedDescending", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComparisonResult implements RawRepresentable<Integer> {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ComparisonResult[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int rawValue;
    public static final ComparisonResult orderedAscending = new ComparisonResult("orderedAscending", 0, -1, null, 2, null);
    public static final ComparisonResult orderedSame = new ComparisonResult("orderedSame", 1, 0, null, 2, null);
    public static final ComparisonResult orderedDescending = new ComparisonResult("orderedDescending", 2, 1, null, 2, null);

    private static final /* synthetic */ ComparisonResult[] $values() {
        return new ComparisonResult[]{orderedAscending, orderedSame, orderedDescending};
    }

    static {
        ComparisonResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ ComparisonResult(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : r4);
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ComparisonResult valueOf(String str) {
        return (ComparisonResult) Enum.valueOf(ComparisonResult.class, str);
    }

    public static ComparisonResult[] values() {
        return (ComparisonResult[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // skip.lib.RawRepresentable
    public Integer getRawValue() {
        return Integer.valueOf(this.rawValue);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/foundation/ComparisonResult$Companion;", "", "<init>", "()V", "ascending", "Lskip/foundation/ComparisonResult;", "getAscending", "()Lskip/foundation/ComparisonResult;", "same", "getSame", "descending", "getDescending", "init", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ComparisonResult getAscending() {
            return ComparisonResult.orderedAscending;
        }

        public final ComparisonResult getDescending() {
            return ComparisonResult.orderedDescending;
        }

        public final ComparisonResult getSame() {
            return ComparisonResult.orderedSame;
        }

        public final ComparisonResult init(int rawValue) {
            if (rawValue != -1) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        return null;
                    }
                    return ComparisonResult.orderedDescending;
                }
                return ComparisonResult.orderedSame;
            }
            return ComparisonResult.orderedAscending;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Integer getRawValue() {
        return getRawValue();
    }

    private ComparisonResult(String str, int i, int i2, Void r4) {
        this.rawValue = i2;
    }
}
