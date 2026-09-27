package defpackage;

import java.util.Set;
import kotlin.collections.ArraysKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sy0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sy0[] $VALUES;
    private static final Set<sy0> ALL;
    public static final sy0 APP_LIFECYCLES;
    public static final ry0 Companion;
    public static final sy0 DEEP_LINKS;
    public static final sy0 ELEMENT_INTERACTIONS;
    public static final sy0 FRUSTRATION_INTERACTIONS;
    public static final sy0 SCREEN_VIEWS;
    public static final sy0 SESSIONS;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, sy0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ry0, java.lang.Object] */
    static {
        ?? r0 = new Enum("SESSIONS", 0);
        SESSIONS = r0;
        ?? r1 = new Enum("APP_LIFECYCLES", 1);
        APP_LIFECYCLES = r1;
        ?? r2 = new Enum("DEEP_LINKS", 2);
        DEEP_LINKS = r2;
        ?? r3 = new Enum("SCREEN_VIEWS", 3);
        SCREEN_VIEWS = r3;
        ?? r4 = new Enum("ELEMENT_INTERACTIONS", 4);
        ELEMENT_INTERACTIONS = r4;
        ?? r5 = new Enum("FRUSTRATION_INTERACTIONS", 5);
        FRUSTRATION_INTERACTIONS = r5;
        sy0[] sy0VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = sy0VarArr;
        $ENTRIES = new wg7(sy0VarArr);
        Companion = new Object();
        ALL = ArraysKt.l0(new sy0[]{r0, r1, r2, r3, r4, r5});
    }

    public static sy0 valueOf(String str) {
        return (sy0) Enum.valueOf(sy0.class, str);
    }

    public static sy0[] values() {
        return (sy0[]) $VALUES.clone();
    }
}
