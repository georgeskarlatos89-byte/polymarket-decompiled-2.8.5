package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class syf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ syf[] $VALUES;
    public static final syf ANALYTICS_SDK;
    public static final syf DIAGNOSTICS;
    public static final syf SESSION_REPLAY_PRIVACY_CONFIG;
    public static final syf SESSION_REPLAY_SAMPLING_CONFIG;
    private final String value;

    static {
        syf syfVar = new syf("ANALYTICS_SDK", 0, "analyticsSDK.androidSDK");
        ANALYTICS_SDK = syfVar;
        syf syfVar2 = new syf("DIAGNOSTICS", 1, "diagnostics.androidSDK");
        DIAGNOSTICS = syfVar2;
        syf syfVar3 = new syf("SESSION_REPLAY_PRIVACY_CONFIG", 2, "sessionReplay.sr_android_privacy_config");
        SESSION_REPLAY_PRIVACY_CONFIG = syfVar3;
        syf syfVar4 = new syf("SESSION_REPLAY_SAMPLING_CONFIG", 3, "sessionReplay.sr_android_sampling_config");
        SESSION_REPLAY_SAMPLING_CONFIG = syfVar4;
        syf[] syfVarArr = {syfVar, syfVar2, syfVar3, syfVar4};
        $VALUES = syfVarArr;
        $ENTRIES = new wg7(syfVarArr);
    }

    public syf(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static syf valueOf(String str) {
        return (syf) Enum.valueOf(syf.class, str);
    }

    public static syf[] values() {
        return (syf[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
