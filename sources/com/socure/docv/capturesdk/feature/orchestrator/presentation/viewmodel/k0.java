package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 SCAN_BUTTON_CLICKED;
    public static final k0 UPLOAD_BUTTON_CLICKED;
    public static final k0 UPLOAD_PHOTO_CLICKED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.k0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.k0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.k0] */
    static {
        ?? r0 = new Enum("UPLOAD_BUTTON_CLICKED", 0);
        UPLOAD_BUTTON_CLICKED = r0;
        ?? r1 = new Enum("SCAN_BUTTON_CLICKED", 1);
        SCAN_BUTTON_CLICKED = r1;
        ?? r2 = new Enum("UPLOAD_PHOTO_CLICKED", 2);
        UPLOAD_PHOTO_CLICKED = r2;
        k0[] k0VarArr = {r0, r1, r2};
        $VALUES = k0VarArr;
        $ENTRIES = new wg7(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
