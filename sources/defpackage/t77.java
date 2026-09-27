package defpackage;

import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t77 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ t77[] $VALUES;
    public static final t77 Disabled;
    public static final t77 Enabled;
    public static final t77 NotProvided;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t77] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t77] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t77] */
    static {
        ?? r0 = new Enum(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = r0;
        ?? r1 = new Enum("Disabled", 1);
        Disabled = r1;
        ?? r2 = new Enum("NotProvided", 2);
        NotProvided = r2;
        t77[] t77VarArr = {r0, r1, r2};
        $VALUES = t77VarArr;
        $ENTRIES = new wg7(t77VarArr);
    }

    public static t77 valueOf(String str) {
        return (t77) Enum.valueOf(t77.class, str);
    }

    public static t77[] values() {
        return (t77[]) $VALUES.clone();
    }
}
