package com.socure.docv.capturesdk.common.analytics;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ID;
    public static final a PASSPORT;
    private final String value;

    static {
        a aVar = new a("ID", 0, "id_card");
        ID = aVar;
        a aVar2 = new a("PASSPORT", 1, "passport");
        PASSPORT = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = new wg7(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
