package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class c39 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c39[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final b39 Companion;

    @dxg("landscape")
    public static final c39 LANDSCAPE;

    @dxg("portrait")
    public static final c39 PORTRAIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c39] */
    /* JADX WARN: Type inference failed for: r0v2, types: [b39, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c39] */
    static {
        ?? r0 = new Enum("PORTRAIT", 0);
        PORTRAIT = r0;
        ?? r1 = new Enum("LANDSCAPE", 1);
        LANDSCAPE = r1;
        c39[] c39VarArr = {r0, r1};
        $VALUES = c39VarArr;
        $ENTRIES = new wg7(c39VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new w29(1));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static c39 valueOf(String str) {
        return (c39) Enum.valueOf(c39.class, str);
    }

    public static c39[] values() {
        return (c39[]) $VALUES.clone();
    }
}
