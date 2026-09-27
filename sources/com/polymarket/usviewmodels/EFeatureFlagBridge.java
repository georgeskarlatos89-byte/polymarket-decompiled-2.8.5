package com.polymarket.usviewmodels;

import com.polymarket.data.EFeatureFlagKey;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/EFeatureFlagBridge;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EFeatureFlagBridge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EFeatureFlagBridge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ EFeatureFlagBridge[] $values() {
        return new EFeatureFlagBridge[0];
    }

    static {
        EFeatureFlagBridge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private EFeatureFlagBridge(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EFeatureFlagBridge valueOf(String str) {
        return (EFeatureFlagBridge) Enum.valueOf(EFeatureFlagBridge.class, str);
    }

    public static EFeatureFlagBridge[] values() {
        return (EFeatureFlagBridge[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 ¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/EFeatureFlagBridge$Companion;", "", "<init>", "()V", "bool", "", "key", "Lcom/polymarket/data/EFeatureFlagKey;", "Swift_Companion_bool_0", "int", "", "Swift_Companion_int_1", "double", "", "Swift_Companion_double_2", "json", "", "Swift_Companion_json_3", "string", "Swift_Companion_string_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native boolean Swift_Companion_bool_0(EFeatureFlagKey key);

        private final native double Swift_Companion_double_2(EFeatureFlagKey key);

        private final native int Swift_Companion_int_1(EFeatureFlagKey key);

        private final native String Swift_Companion_json_3(EFeatureFlagKey key);

        private final native String Swift_Companion_string_4(EFeatureFlagKey key);

        public final boolean bool(EFeatureFlagKey key) {
            key.getClass();
            return Swift_Companion_bool_0(key);
        }

        /* renamed from: double, reason: not valid java name */
        public final double m41double(EFeatureFlagKey key) {
            key.getClass();
            return Swift_Companion_double_2(key);
        }

        /* renamed from: int, reason: not valid java name */
        public final int m42int(EFeatureFlagKey key) {
            key.getClass();
            return Swift_Companion_int_1(key);
        }

        public final String json(EFeatureFlagKey key) {
            key.getClass();
            return Swift_Companion_json_3(key);
        }

        public final String string(EFeatureFlagKey key) {
            key.getClass();
            return Swift_Companion_string_4(key);
        }

        private Companion() {
        }
    }
}
