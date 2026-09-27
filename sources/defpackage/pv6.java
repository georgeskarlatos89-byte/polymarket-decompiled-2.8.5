package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class pv6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pv6[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final ov6 Companion;

    @dxg("country")
    public static final pv6 Country;

    /* JADX WARN: Type inference failed for: r0v0, types: [pv6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ov6] */
    static {
        ?? r0 = new Enum("Country", 0);
        Country = r0;
        pv6[] pv6VarArr = {r0};
        $VALUES = pv6VarArr;
        $ENTRIES = new wg7(pv6VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new q56(24));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static pv6 valueOf(String str) {
        return (pv6) Enum.valueOf(pv6.class, str);
    }

    public static pv6[] values() {
        return (pv6[]) $VALUES.clone();
    }
}
