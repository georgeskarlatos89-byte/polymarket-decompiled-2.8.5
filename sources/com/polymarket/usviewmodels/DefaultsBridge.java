package com.polymarket.usviewmodels;

import com.polymarket.data.EEnvironment;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/DefaultsBridge;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultsBridge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DefaultsBridge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ DefaultsBridge[] $values() {
        return new DefaultsBridge[0];
    }

    static {
        DefaultsBridge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private DefaultsBridge(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DefaultsBridge valueOf(String str) {
        return (DefaultsBridge) Enum.valueOf(DefaultsBridge.class, str);
    }

    public static DefaultsBridge[] values() {
        return (DefaultsBridge[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082 J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u0082 J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0011\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/DefaultsBridge$Companion;", "", "<init>", "()V", "getRuntimeEnvironmentOverride", "Lcom/polymarket/data/EEnvironment;", "Swift_Companion_getRuntimeEnvironmentOverride_0", "getCustomLocalhostURLOverride", "", "Swift_Companion_getCustomLocalhostURLOverride_1", "persistLaunchOverrides", "", "json", "Swift_Companion_persistLaunchOverrides_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_getCustomLocalhostURLOverride_1();

        private final native EEnvironment Swift_Companion_getRuntimeEnvironmentOverride_0();

        private final native void Swift_Companion_persistLaunchOverrides_2(String json);

        public final String getCustomLocalhostURLOverride() {
            return Swift_Companion_getCustomLocalhostURLOverride_1();
        }

        public final EEnvironment getRuntimeEnvironmentOverride() {
            return Swift_Companion_getRuntimeEnvironmentOverride_0();
        }

        public final void persistLaunchOverrides(String json) {
            json.getClass();
            Swift_Companion_persistLaunchOverrides_2(json);
        }

        private Companion() {
        }
    }
}
