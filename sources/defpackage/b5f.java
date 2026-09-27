package defpackage;

import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b5f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ b5f[] $VALUES;
    public static final b5f Completed;
    public static final b5f Disabled;
    public static final b5f Enabled;
    public static final b5f Processing;
    private final boolean isBlocking;

    static {
        b5f b5fVar = new b5f(PeerConnectionFactory.TRIAL_ENABLED, 0, false);
        Enabled = b5fVar;
        b5f b5fVar2 = new b5f("Disabled", 1, false);
        Disabled = b5fVar2;
        b5f b5fVar3 = new b5f("Processing", 2, true);
        Processing = b5fVar3;
        b5f b5fVar4 = new b5f("Completed", 3, true);
        Completed = b5fVar4;
        b5f[] b5fVarArr = {b5fVar, b5fVar2, b5fVar3, b5fVar4};
        $VALUES = b5fVarArr;
        $ENTRIES = new wg7(b5fVarArr);
    }

    public b5f(String str, int i, boolean z) {
        this.isBlocking = z;
    }

    public static b5f valueOf(String str) {
        return (b5f) Enum.valueOf(b5f.class, str);
    }

    public static b5f[] values() {
        return (b5f[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.isBlocking;
    }
}
