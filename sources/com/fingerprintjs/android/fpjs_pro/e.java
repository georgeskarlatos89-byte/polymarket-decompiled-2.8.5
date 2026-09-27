package com.fingerprintjs.android.fpjs_pro;

import defpackage.ug7;
import defpackage.wg7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AP;
    public static final e EU;
    public static final e US;
    private final String endpointUrl;

    static {
        e eVar = new e("US", 0, "https://api.fpjs.io");
        US = eVar;
        e eVar2 = new e("EU", 1, "https://eu.api.fpjs.io");
        EU = eVar2;
        e eVar3 = new e("AP", 2, "https://ap.api.fpjs.io");
        AP = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = new wg7(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.endpointUrl = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
