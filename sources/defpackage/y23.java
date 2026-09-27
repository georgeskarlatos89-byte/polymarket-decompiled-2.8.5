package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class y23 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y23[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("characters")
    public static final y23 Characters;
    public static final x23 Companion;

    @dxg("none")
    public static final y23 None;

    @dxg("sentences")
    public static final y23 Sentences;

    @dxg("words")
    public static final y23 Words;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y23] */
    /* JADX WARN: Type inference failed for: r0v2, types: [x23, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y23] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y23] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y23] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Characters", 1);
        Characters = r1;
        ?? r2 = new Enum("Words", 2);
        Words = r2;
        ?? r3 = new Enum("Sentences", 3);
        Sentences = r3;
        y23[] y23VarArr = {r0, r1, r2, r3};
        $VALUES = y23VarArr;
        $ENTRIES = new wg7(y23VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new us1(20));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static y23 valueOf(String str) {
        return (y23) Enum.valueOf(y23.class, str);
    }

    public static y23[] values() {
        return (y23[]) $VALUES.clone();
    }
}
