package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class we {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ we[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final ve Companion;

    @dxg("hidden")
    public static final we HIDDEN;

    @dxg("optional")
    public static final we OPTIONAL;

    @dxg("required")
    public static final we REQUIRED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, we] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ve] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, we] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, we] */
    static {
        ?? r0 = new Enum("HIDDEN", 0);
        HIDDEN = r0;
        ?? r1 = new Enum("OPTIONAL", 1);
        OPTIONAL = r1;
        ?? r2 = new Enum("REQUIRED", 2);
        REQUIRED = r2;
        we[] weVarArr = {r0, r1, r2};
        $VALUES = weVarArr;
        $ENTRIES = new wg7(weVarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new oa(3));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static we valueOf(String str) {
        return (we) Enum.valueOf(we.class, str);
    }

    public static we[] values() {
        return (we[]) $VALUES.clone();
    }
}
