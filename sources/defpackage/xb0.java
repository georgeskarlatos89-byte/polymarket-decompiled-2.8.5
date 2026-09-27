package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xb0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xb0[] $VALUES;
    public static final xb0 Clickable;
    public static final xb0 Link;
    public static final xb0 Paragraph;
    public static final xb0 Span;
    public static final xb0 String;
    public static final xb0 Url;
    public static final xb0 VerbatimTts;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, xb0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, xb0] */
    static {
        ?? r0 = new Enum("Paragraph", 0);
        Paragraph = r0;
        ?? r1 = new Enum("Span", 1);
        Span = r1;
        ?? r2 = new Enum("VerbatimTts", 2);
        VerbatimTts = r2;
        ?? r3 = new Enum("Url", 3);
        Url = r3;
        ?? r4 = new Enum(HttpConstants.Headers.LINK, 4);
        Link = r4;
        ?? r5 = new Enum("Clickable", 5);
        Clickable = r5;
        ?? r6 = new Enum("String", 6);
        String = r6;
        xb0[] xb0VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = xb0VarArr;
        $ENTRIES = new wg7(xb0VarArr);
    }

    public static xb0 valueOf(String str) {
        return (xb0) Enum.valueOf(xb0.class, str);
    }

    public static xb0[] values() {
        return (xb0[]) $VALUES.clone();
    }
}
