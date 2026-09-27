package com.socure.docv.capturesdk.common.view.model;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c PREVIEW_BACK;
    public static final c PREVIEW_FRONT;
    public static final c PREVIEW_PASSPORT;
    public static final c PREVIEW_SELFIE;
    public static final c SCANNER_BACK;
    public static final c SCANNER_FRONT;
    public static final c SCANNER_PASSPORT;
    public static final c SCANNER_SELFIE;
    public static final c SELECTOR;
    private final String screenType;

    static {
        c cVar = new c("SELECTOR", 0, "selector");
        SELECTOR = cVar;
        c cVar2 = new c("SCANNER_FRONT", 1, "scanner");
        SCANNER_FRONT = cVar2;
        c cVar3 = new c("PREVIEW_FRONT", 2, "preview");
        PREVIEW_FRONT = cVar3;
        c cVar4 = new c("SCANNER_BACK", 3, "scanner");
        SCANNER_BACK = cVar4;
        c cVar5 = new c("PREVIEW_BACK", 4, "preview");
        PREVIEW_BACK = cVar5;
        c cVar6 = new c("SCANNER_PASSPORT", 5, "scanner");
        SCANNER_PASSPORT = cVar6;
        c cVar7 = new c("PREVIEW_PASSPORT", 6, "preview");
        PREVIEW_PASSPORT = cVar7;
        c cVar8 = new c("SCANNER_SELFIE", 7, "scanner");
        SCANNER_SELFIE = cVar8;
        c cVar9 = new c("PREVIEW_SELFIE", 8, "preview");
        PREVIEW_SELFIE = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        $VALUES = cVarArr;
        $ENTRIES = new wg7(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.screenType = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.screenType;
    }
}
