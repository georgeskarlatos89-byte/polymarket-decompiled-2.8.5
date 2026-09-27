package io.intercom.android.sdk.m5.conversation.states;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "PROGRAMMATIC", "CLASSIC", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaunchMode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ LaunchMode[] $VALUES;
    public static final LaunchMode PROGRAMMATIC = new LaunchMode("PROGRAMMATIC", 0);
    public static final LaunchMode CLASSIC = new LaunchMode("CLASSIC", 1);

    private static final /* synthetic */ LaunchMode[] $values() {
        return new LaunchMode[]{PROGRAMMATIC, CLASSIC};
    }

    static {
        LaunchMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private LaunchMode(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static LaunchMode valueOf(String str) {
        return (LaunchMode) Enum.valueOf(LaunchMode.class, str);
    }

    public static LaunchMode[] values() {
        return (LaunchMode[]) $VALUES.clone();
    }
}
