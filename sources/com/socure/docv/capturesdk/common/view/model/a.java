package com.socure.docv.capturesdk.common.view.model;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONTINUE;
    public static final a DEBUG_IMAGE_SAVE;
    public static final a RETAKE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.socure.docv.capturesdk.common.view.model.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.socure.docv.capturesdk.common.view.model.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.socure.docv.capturesdk.common.view.model.a] */
    static {
        ?? r0 = new Enum("DEBUG_IMAGE_SAVE", 0);
        DEBUG_IMAGE_SAVE = r0;
        ?? r1 = new Enum("CONTINUE", 1);
        CONTINUE = r1;
        ?? r2 = new Enum("RETAKE", 2);
        RETAKE = r2;
        a[] aVarArr = {r0, r1, r2};
        $VALUES = aVarArr;
        $ENTRIES = new wg7(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
