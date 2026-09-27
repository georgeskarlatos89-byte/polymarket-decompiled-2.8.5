package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class h39 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h39[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("compact")
    public static final h39 COMPACT;
    public static final g39 Companion;

    @dxg("invisible")
    public static final h39 INVISIBLE;

    @dxg("normal")
    public static final h39 NORMAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h39] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, g39] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h39] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h39] */
    static {
        ?? r0 = new Enum("INVISIBLE", 0);
        INVISIBLE = r0;
        ?? r1 = new Enum("NORMAL", 1);
        NORMAL = r1;
        ?? r2 = new Enum("COMPACT", 2);
        COMPACT = r2;
        h39[] h39VarArr = {r0, r1, r2};
        $VALUES = h39VarArr;
        $ENTRIES = new wg7(h39VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new w29(2));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static h39 valueOf(String str) {
        return (h39) Enum.valueOf(h39.class, str);
    }

    public static h39[] values() {
        return (h39[]) $VALUES.clone();
    }
}
