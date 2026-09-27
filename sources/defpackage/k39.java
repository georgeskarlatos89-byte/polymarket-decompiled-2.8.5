package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class k39 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k39[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("contrast")
    public static final k39 CONTRAST;
    public static final j39 Companion;

    @dxg("dark")
    public static final k39 DARK;

    @dxg("light")
    public static final k39 LIGHT;

    /* JADX WARN: Type inference failed for: r0v0, types: [k39, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j39, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k39, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k39, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DARK", 0);
        DARK = r0;
        ?? r1 = new Enum("LIGHT", 1);
        LIGHT = r1;
        ?? r2 = new Enum("CONTRAST", 2);
        CONTRAST = r2;
        k39[] k39VarArr = {r0, r1, r2};
        $VALUES = k39VarArr;
        $ENTRIES = new wg7(k39VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new w29(3));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static k39 valueOf(String str) {
        return (k39) Enum.valueOf(k39.class, str);
    }

    public static k39[] values() {
        return (k39[]) $VALUES.clone();
    }
}
