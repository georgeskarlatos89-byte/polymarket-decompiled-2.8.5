package defpackage;

import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s77 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ s77[] $VALUES;
    public static final s77 Disabled;
    public static final s77 Enabled;
    public static final s77 Partial;

    /* JADX WARN: Type inference failed for: r0v0, types: [s77, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s77, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s77, java.lang.Enum] */
    static {
        ?? r0 = new Enum(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = r0;
        ?? r1 = new Enum("Partial", 1);
        Partial = r1;
        ?? r2 = new Enum("Disabled", 2);
        Disabled = r2;
        s77[] s77VarArr = {r0, r1, r2};
        $VALUES = s77VarArr;
        $ENTRIES = new wg7(s77VarArr);
    }

    public static s77 valueOf(String str) {
        return (s77) Enum.valueOf(s77.class, str);
    }

    public static s77[] values() {
        return (s77[]) $VALUES.clone();
    }
}
