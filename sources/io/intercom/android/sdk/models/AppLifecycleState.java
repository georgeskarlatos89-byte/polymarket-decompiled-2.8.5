package io.intercom.android.sdk.models;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/models/AppLifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "UNINITIALIZED", "FOREGROUND", "BACKGROUND", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLifecycleState {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ AppLifecycleState[] $VALUES;
    public static final AppLifecycleState UNINITIALIZED = new AppLifecycleState("UNINITIALIZED", 0);
    public static final AppLifecycleState FOREGROUND = new AppLifecycleState("FOREGROUND", 1);
    public static final AppLifecycleState BACKGROUND = new AppLifecycleState("BACKGROUND", 2);

    private static final /* synthetic */ AppLifecycleState[] $values() {
        return new AppLifecycleState[]{UNINITIALIZED, FOREGROUND, BACKGROUND};
    }

    static {
        AppLifecycleState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private AppLifecycleState(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static AppLifecycleState valueOf(String str) {
        return (AppLifecycleState) Enum.valueOf(AppLifecycleState.class, str);
    }

    public static AppLifecycleState[] values() {
        return (AppLifecycleState[]) $VALUES.clone();
    }
}
