package com.socure.docv.capturesdk.feature.orchestrator;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ID_CARD;
    public static final i PASSPORT;
    private final String value;

    static {
        i iVar = new i("ID_CARD", 0, "id_card");
        ID_CARD = iVar;
        i iVar2 = new i("PASSPORT", 1, "passport");
        PASSPORT = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = new wg7(iVarArr);
    }

    public i(String str, int i, String str2) {
        this.value = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
