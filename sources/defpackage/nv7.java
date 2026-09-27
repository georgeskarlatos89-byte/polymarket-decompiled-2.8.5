package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nv7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nv7[] $VALUES;
    public static final nv7 Linear;
    public static final nv7 Smooth;
    public static final nv7 Soft;
    public static final nv7 Subtle;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nv7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nv7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nv7] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nv7] */
    static {
        ?? r0 = new Enum("Linear", 0);
        Linear = r0;
        ?? r1 = new Enum("Smooth", 1);
        Smooth = r1;
        ?? r2 = new Enum("Soft", 2);
        Soft = r2;
        ?? r3 = new Enum("Subtle", 3);
        Subtle = r3;
        nv7[] nv7VarArr = {r0, r1, r2, r3};
        $VALUES = nv7VarArr;
        $ENTRIES = new wg7(nv7VarArr);
    }

    public static nv7 valueOf(String str) {
        return (nv7) Enum.valueOf(nv7.class, str);
    }

    public static nv7[] values() {
        return (nv7[]) $VALUES.clone();
    }

    public final List a() {
        Float valueOf = Float.valueOf(0.1f);
        Float valueOf2 = Float.valueOf(0.35f);
        Float valueOf3 = Float.valueOf(1.0f);
        Float valueOf4 = Float.valueOf(0.0f);
        int i = mv7.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return CollectionsKt.listOf(Float.valueOf(0.5f), valueOf2, Float.valueOf(0.2f), valueOf, Float.valueOf(0.04f), valueOf4);
                    }
                    dmk.a();
                    return null;
                }
                return CollectionsKt.listOf(valueOf3, Float.valueOf(0.92f), Float.valueOf(0.7f), Float.valueOf(0.4f), Float.valueOf(0.15f), Float.valueOf(0.03f), valueOf4);
            }
            return CollectionsKt.listOf(valueOf3, Float.valueOf(0.75f), valueOf2, valueOf, valueOf4);
        }
        return CollectionsKt.listOf(valueOf3, valueOf4);
    }

    public final List b() {
        Float valueOf = Float.valueOf(0.55f);
        Float valueOf2 = Float.valueOf(0.8f);
        Float valueOf3 = Float.valueOf(1.0f);
        Float valueOf4 = Float.valueOf(0.0f);
        int i = mv7.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return CollectionsKt.listOf(valueOf4, Float.valueOf(0.2f), Float.valueOf(0.4f), Float.valueOf(0.6f), valueOf2, valueOf3);
                    }
                    dmk.a();
                    return null;
                }
                return CollectionsKt.listOf(valueOf4, Float.valueOf(0.15f), Float.valueOf(0.35f), valueOf, Float.valueOf(0.75f), Float.valueOf(0.9f), valueOf3);
            }
            return CollectionsKt.listOf(valueOf4, Float.valueOf(0.25f), valueOf, valueOf2, valueOf3);
        }
        return CollectionsKt.listOf(valueOf4, valueOf3);
    }
}
