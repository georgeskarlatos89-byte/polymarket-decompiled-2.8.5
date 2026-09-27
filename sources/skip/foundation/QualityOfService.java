package skip.foundation;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0010B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lskip/foundation/QualityOfService;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "userInteractive", "userInitiated", "utility", "background", "default", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QualityOfService implements RawRepresentable<Integer> {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ QualityOfService[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int rawValue;
    public static final QualityOfService userInteractive = new QualityOfService("userInteractive", 0, 0, null, 2, null);
    public static final QualityOfService userInitiated = new QualityOfService("userInitiated", 1, 1, null, 2, null);
    public static final QualityOfService utility = new QualityOfService("utility", 2, 2, null, 2, null);
    public static final QualityOfService background = new QualityOfService("background", 3, 3, null, 2, null);

    /* renamed from: default, reason: not valid java name */
    public static final QualityOfService f421default = new QualityOfService("default", 4, 4, null, 2, null);

    private static final /* synthetic */ QualityOfService[] $values() {
        return new QualityOfService[]{userInteractive, userInitiated, utility, background, f421default};
    }

    static {
        QualityOfService[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ QualityOfService(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : r4);
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static QualityOfService valueOf(String str) {
        return (QualityOfService) Enum.valueOf(QualityOfService.class, str);
    }

    public static QualityOfService[] values() {
        return (QualityOfService[]) $VALUES.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // skip.lib.RawRepresentable
    public Integer getRawValue() {
        return Integer.valueOf(this.rawValue);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/QualityOfService$Companion;", "", "<init>", "()V", "init", "Lskip/foundation/QualityOfService;", "rawValue", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QualityOfService init(int rawValue) {
            if (rawValue != 0) {
                if (rawValue != 1) {
                    if (rawValue != 2) {
                        if (rawValue != 3) {
                            if (rawValue != 4) {
                                return null;
                            }
                            return QualityOfService.f421default;
                        }
                        return QualityOfService.background;
                    }
                    return QualityOfService.utility;
                }
                return QualityOfService.userInitiated;
            }
            return QualityOfService.userInteractive;
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Integer getRawValue() {
        return getRawValue();
    }

    private QualityOfService(String str, int i, int i2, Void r4) {
        this.rawValue = i2;
    }
}
